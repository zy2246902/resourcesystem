package com.lovo.resourcesystem.service;

import java.util.List;

import com.lovo.resourcesystem.entity.StockNumberEntity;

public interface StockNumberService {
	/**
	 * 查询全部可用资源
	 * @return
	 */
	public List<StockNumberEntity> stockNumberFind();
	
	/**
	 * 根据ID修改可用车辆数量
	 */
	public void stockNumberCarRevise( Integer resourceStocks, Integer useCar);
	
	
	/**
	 * 根据ID修改可用人员数量
	 */
	public void stockNumberPersonRevise( Integer resourceStocks,Integer usePerson);
	
}
	

