package com.lovo.resourcesystem.service;

import java.util.List;

import com.lovo.resourcesystem.entity.StockNumberEntity;

public interface StockNumberService {
	/**
	 * 查询全部可用资源
	 * @return
	 */
	public List<StockNumberEntity> stockNumberFind();
}
