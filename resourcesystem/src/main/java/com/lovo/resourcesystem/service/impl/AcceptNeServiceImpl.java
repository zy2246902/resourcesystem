package com.lovo.resourcesystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovo.resourcesystem.dao.AcceptNewsDao;
import com.lovo.resourcesystem.entity.AcceptNewsEntity;
import com.lovo.resourcesystem.service.AcceptNeService;
@Service(value="acceptNeService")
public class AcceptNeServiceImpl implements AcceptNeService{

	@Autowired
	private AcceptNewsDao acceptNewsDao;

	@Override
	public void acceptNewsAdd(AcceptNewsEntity acceptNews) {
		// TODO Auto-generated method stub
		acceptNewsDao.acceptNewsAdd(acceptNews);
	}

	@Override
	public List<AcceptNewsEntity> acceptNewsFind() {
		// TODO Auto-generated method stub
		List<AcceptNewsEntity> list = null;
		list =	acceptNewsDao.acceptNewsFind();

		return list;
	}

}
