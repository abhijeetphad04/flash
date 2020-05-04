package com.javabykiran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.EditDao;
import com.jbk.hibernate.Users;

@Service
public class EditService {

	@Autowired
	EditDao editDao;

	public Users editUserService(int id) {

		return editDao.selectUserDao(id);
	}

}
