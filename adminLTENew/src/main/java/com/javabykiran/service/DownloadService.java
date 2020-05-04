package com.javabykiran.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javabykiran.dao.DownloadDao;
import com.jbk.hibernate.Download;

@Service
public class DownloadService {
	@Autowired
	DownloadDao downloadDao;

	public List<Download> loadDownload() {
		return downloadDao.loadDownload();
	}
}
