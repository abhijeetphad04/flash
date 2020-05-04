package com.javabykiran.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Operators;
import com.jbk.hibernate.Statetable;
@Repository
public class OperatorsDao {

	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Operators> loadOperatorsDao() {
		List<Operators> operator = sessionFactory.openSession().createCriteria(Operators.class).list();
		return operator;
	}
}
