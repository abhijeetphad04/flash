package com.javabykiran.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.LoginDao;
import com.javabykiran.model.User;
import com.jbk.hibernate.Users;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;

	public boolean checkLoginService(User user) {
		User user2 = loginDao.checkUserDao(user);
		if (user2 != null) {
			return true;
		} else {
			return false;
		}
	}

}
