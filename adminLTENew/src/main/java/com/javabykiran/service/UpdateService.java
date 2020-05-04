package com.javabykiran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.UpdateDao;
import com.jbk.hibernate.Users;

@Service
public class UpdateService {

	@Autowired
	UpdateDao updateDao;
	
	public boolean updateUserService(Users user) {
		return updateDao.updateUserDao(user);
	}
}
