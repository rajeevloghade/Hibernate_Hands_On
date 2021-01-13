package com.QBC;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.entity.Employee;
import com.sessionUtil.SessionUtils;

public class QBCProjectionOne {		//Projection

	public static void main(String[] args) {
		Session session = SessionUtils.getSession();
		Criteria createCriteria = session.createCriteria(Employee.class);

		// Filtration
		createCriteria.add(Restrictions.ge("name", "CCC"));
		createCriteria.addOrder(Order.desc("name"));

		// we wish to fetch column using Projection
		Projection projection = Projections.property("name");
		createCriteria.setProjection(projection);

		List<String> nameList = createCriteria.list();
		System.out.println();
		for (String name : nameList) {
			System.out.println(name);
		}

		session.close();
		System.out.println();

	}

}
