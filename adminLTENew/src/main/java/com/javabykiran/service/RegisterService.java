package com.javabykiran.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.RegisterDao;
import com.jbk.hibernate.Users;

@Service
public class RegisterService {

	@Autowired
	RegisterDao registerDao;

	public boolean registerUserService(Users user) {

		Serializable id = registerDao.registerUserDao(user);
		if (id != null) {
			return true;
		} else {
			return false;
		}
	}
}