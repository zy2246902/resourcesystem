package com.lovo.resourcesystem.dao;
/**
 * 资源详情
 * @author admin
 *
 */

import java.util.List;

import com.lovo.resourcesystem.entity.StockNumberEntity;

public interface StockNumberDao {

	/**
	 * 查询全部可用资源
	 * @return
	 */
	public List<StockNumberEntity> stockNumberFind();
	
	
	
	
	
}
