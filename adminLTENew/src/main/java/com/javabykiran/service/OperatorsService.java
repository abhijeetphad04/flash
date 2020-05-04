package com.javabykiran.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.DownloadDao;
import com.javabykiran.dao.OperatorsDao;
import com.jbk.hibernate.Download;
import com.jbk.hibernate.Operators;
import com.jbk.hibernate.Statetable;

@Service
public class OperatorsService {
	@Autowired
	OperatorsDao operatorsDao;

	public List<Operators> loadOperatorsService() {
		return operatorsDao.loadOperatorsDao();
	}
}
