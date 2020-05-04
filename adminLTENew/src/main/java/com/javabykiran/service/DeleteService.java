package com.javabykiran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.DeleteDao;

@Service
public class DeleteService {

	@Autowired
	DeleteDao deleteDao;

	public boolean deleteUserService(int id) {
		System.out.println(555);
		return deleteDao.deleteUserDao(id);
	}

}
