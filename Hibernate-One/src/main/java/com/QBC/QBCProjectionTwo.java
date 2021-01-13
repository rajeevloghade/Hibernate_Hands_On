package com.QBC;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.entity.Employee;
import com.sessionUtil.SessionUtils;

public class QBCProjectionTwo {

	public static void main(String[] args) {
		Session session = SessionUtils.getSession();
		Criteria createCriteria = session.createCriteria(Employee.class);

		// Projection for fetching multiple column
		Projection name = Projections.property("name");
		Projection salary = Projections.property("salary");

		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(salary);
		projectionList.add(name);

		createCriteria.setProjection(projectionList);

		List<Object[]> list = createCriteria.list();

		System.out.println();
		for (Object[] objects : list) {
			for (Object objects2 : objects) {
				System.out.println(objects2);
			}
			System.out.println();
		}

		session.close();
		System.out.println();

	}

}
