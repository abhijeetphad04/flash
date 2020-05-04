package com.javabykiran.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javabykiran.model.User;
import com.jbk.hibernate.Users;

@Repository
@Transactional
public class LoginDao {

	@Autowired
	SessionFactory sessionFactory;

	public User checkUserDao(User user) {
		Session session;

		try {
		    session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		Query q = session.createQuery("select email,password from Users where email=:email AND password=:password");
		q.setParameter("email", user.getEmail());
		q.setParameter("password", user.getPassword());
		List<Users> list = q.list();
		if (!list.isEmpty()) {
			return user;
		}
		return null;
	}

}
