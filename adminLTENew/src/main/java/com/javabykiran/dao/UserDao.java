package com.javabykiran.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Users;
@Repository
public class UserDao {
	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Users> loadUserDao() {
		List<Users> listusers = (List<Users>) sessionFactory.openSession()
		.createCriteria(Users.class).list();
		return listusers;
	}
}
