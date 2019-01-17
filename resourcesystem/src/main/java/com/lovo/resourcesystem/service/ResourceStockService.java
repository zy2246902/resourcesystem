package com.lovo.resourcesystem.service;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lovo.resourcesystem.entity.ResourceStockEntity;
/**
 * 车辆管理
 * @author admin
 *
 */
public interface ResourceStockService {
	/**
	 * 添加车辆
	 * @param resourceStock
	 */
	public void resourceStockAdd(ResourceStockEntity resourceStock);
	
	/**
	 * 根据ID删除车辆
	 * @param id
	 */
	public void resourceStockdelete(Integer id);
	
	/**
	 * 查询车辆 展示页面
	 * @return
	 */
	public List<ResourceStockEntity> resourceStockFind();
	
	/**
	 * 根据状态查询车辆
	 * @param state 状态
	 * @param currentPage 当前页面
	 * @return 车辆信息集合
	 */
	public List<ResourceStockEntity> resourceStockFind1(@Param("state")String state,Integer currentPage);
	
	
	/**
	 * 根据ID修改状态
	 * @param id
	 */
	public void  resourceStockRevise(String state,Integer id);
	
	/**
     * 获取动态查询的总页数
     * @param state 状态
     * @return 总页数
     */
    public int getTotalPageByItem(String state);

}
