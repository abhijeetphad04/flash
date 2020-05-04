package com.javabykiran.dao;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Users;

@Repository
public class AddUserDao {

	@Autowired
	SessionFactory sessionFactory;

	public Serializable insertUserDao(Users user) {

		Session session;

		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		Transaction transaction = session.beginTransaction();
		Serializable id = session.save(user);
		transaction.commit();
		return id;

	}
}
