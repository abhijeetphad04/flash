package com.javabykiran.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Users;

@Repository
public class EditDao {

	@Autowired
	SessionFactory sessionFactory;

	public Users selectUserDao(int id) {
		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			session = sessionFactory.openSession();
		}
		Users user = session.load(Users.class, id);
		return user;
	}
}
