package com.QBC;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.entity.Employee;
import com.sessionUtil.SessionUtils;

public class QBCGrouping {		//Grouping

	public static void main(String[] args) {
		Session session = SessionUtils.getSession();
		Criteria createCriteria = session.createCriteria(Employee.class);

		// Grouping (Projection)
		Projection groupDesgination = Projections.groupProperty("designation");
		Projection sumOfSalary = Projections.sum("salary");
		Projection avgOfSalary = Projections.avg("salary");
		Projection minOfSalary = Projections.min("salary");
		Projection maxOfSalary = Projections.max("salary");

		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(sumOfSalary);
		projectionList.add(avgOfSalary);
		projectionList.add(minOfSalary);
		projectionList.add(maxOfSalary);
		projectionList.add(groupDesgination);

		createCriteria.setProjection(projectionList);

		List<Object[]> list = createCriteria.list();
		System.out.println();
		for (Object[] objects : list) {
			for (Object objects2 : objects) {
				System.out.println(objects2);
			}
			System.out.println("__________________________");
		}

		session.close();
		System.out.println();
	}

}
