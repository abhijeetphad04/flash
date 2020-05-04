package com.javabykiran.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Users;

@Repository
public class DeleteDao {

	@Autowired
	SessionFactory sessionFactory;

	public boolean deleteUserDao(int id) {
		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (Exception e) {
			session = sessionFactory.openSession();
		}
		Transaction transaction = session.beginTransaction();
		Users user1 = session.load(Users.class, id);
		System.out.println(888);
		String isDefault = user1.getIsDefault();
		System.out.println(isDefault);
		if (isDefault.equals("Y")) {
			System.out.println(777);
			return false;
		} else {
			session.delete(user1);
			System.out.println(666);
			transaction.commit();
			return true;

		}
		// session.delete(user1);
		// transaction.commit();

	}

}
