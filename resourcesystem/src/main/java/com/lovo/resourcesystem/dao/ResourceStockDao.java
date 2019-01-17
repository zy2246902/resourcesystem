package com.lovo.resourcesystem.dao;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import com.lovo.resourcesystem.entity.ResourceStockEntity;

/**
 * 车辆管理
 * @author admin
 *
 */
@Repository
public interface ResourceStockDao {
   
	/**
	 * 添加车辆
	 * @param resourceStock
	 */
	public void resourceStockAdd(ResourceStockEntity resourceStock);
	
	/**
	 * 根据ID删除车辆
	 * @param id
	 */
	public void resourceStockDelete(Integer id);
	
	/**
	 * 查询车辆 展示页面
	 * @return
	 */
	public List<ResourceStockEntity> resourceStockFind();
	
	/**
	 * 根据车辆状态查询车辆
	 * @param state 状态
	 * @param currentPage 当前页面
	 * @return 
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
