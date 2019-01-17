package com.lovo.resourcesystem.service;

import java.util.List;

import com.lovo.resourcesystem.entity.AcceptNewsEntity;
/**
 * 事件维护业务层
 * @author admin
 *
 */
public interface AcceptNeService {
	/**
	 * 添加事件维护
	 * @param acceptNews
	 */
	public void acceptNewsAdd(AcceptNewsEntity acceptNews);
	
	
	/**
	 * 查询全部事件维护，用来展示
	 * @return
	 */
	public List<AcceptNewsEntity>  acceptNewsFind();
}
