package com.lovo.resourcesystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lovo.resourcesystem.entity.CashStatementEntity;
/**
 * 医生人员管理
 * @author admin
 *
 */
@Repository
public interface CashStatementDao {
   
	/**
	 * 添加医生
	 * @param cashStatement
	 */
	public void cashStatementAdd(CashStatementEntity cashStatement);
	
	
	/**
	 * 删除医生
	 * @param id
	 */
	public void cashStatementdelete(Integer id);
	
	
	/**
	 * 展示医生
	 * @return
	 */
	public List<CashStatementEntity> cashStatementFinda();
	
	
	/**
	 * 根据状态查询在线医生
	 * @param state
	 * @return
	 */
	public List<CashStatementEntity> cashStatementFindb(@Param("state")String state);
	
	
	/**
	 * 根据ID修改状态
	 * @param id
	 */
	public void  cashStatementRevise(Integer id,String state);
	
}
