package com.javabykiran.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.AddUserDao;
import com.jbk.hibernate.Users;

@Service
public class AddUserService {

	@Autowired
	AddUserDao addUserDao;

	public boolean addUserService(Users user) {

		Serializable id = addUserDao.insertUserDao(user);
		if (id != null) {
			return true;
		} else {
			return false;
		}

	}
}
