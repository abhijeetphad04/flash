package com.javabykiran.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hibernate.Download;

@Repository
public class DownloadDao {

	@Autowired
	SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Download> loadDownload() {
		List<Download> dwnld = (List<Download>) sessionFactory.openSession().createCriteria(Download.class).list();
		return dwnld;
	}
}
