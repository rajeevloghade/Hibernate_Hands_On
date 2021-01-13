package com.QBC;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.entity.Employee;
import com.sessionUtil.SessionUtils;
 
public class QBCFilteration {		// Filtration

	public static void main(String[] args) {
		// we are using criteria object
		Session session = SessionUtils.getSession();
		Criteria createCriteria = session.createCriteria(Employee.class);

		//when we add more then one criterion the it is treated with AND operator by default
		//but we have flexibility to operate them using OR also

		// Restriction
		Criterion ge = Restrictions.ge("salary", 50000); // greater than
		Criterion eq = Restrictions.eq("name", "GGG"); // equal

		Criterion orOperator = Restrictions.or(ge, eq); // OR-Operator
//		Criterion andOperator = Restrictions.and(ge,eq); //AND-Operator 
		createCriteria.add(orOperator);

//		Criterion between = Restrictions.between("salary", 20000, 70000);  // Between clause
//		createCriteria.add(between);

//		Criterion in = Restrictions.in("department", "QA", "IT");   // IN-Clause
//		createCriteria.add(in);

//		Criterion like = Restrictions.like("designation", "De%");   // LIKE-Operator 
//		createCriteria.add(like);

		List<Employee> empList = createCriteria.list();
		System.out.println();
		for (Employee emp : empList)
			System.out.println(emp);

		session.close();
		System.out.println();

	}
}