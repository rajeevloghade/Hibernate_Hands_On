package com.sessionUtil;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionUtils {

	public static Session getSession() {
		return new Configuration().configure().buildSessionFactory().openSession();
	}
}
