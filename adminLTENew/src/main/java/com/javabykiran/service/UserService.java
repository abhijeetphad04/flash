package com.javabykiran.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.UserDao;
import com.jbk.hibernate.Users;

@Service
public class UserService {

	@Autowired
	UserDao userDao;

	public List<Users> loadUsersService() {
		return userDao.loadUserDao();
	}
}
