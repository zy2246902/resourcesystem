package com.lovo.resourcesystem.service;

import java.util.List;

import com.lovo.resourcesystem.entity.CashStatementEntity;
/**
 * 医生管理业务层
 * @author admin
 *
 */
public interface CashStatementService {
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
	public List<CashStatementEntity> cashStatementFindb(String state);
	
	
	/**
	 * 根据ID修改状态
	 * @param id
	 */
	public void  cashStatementRevise(Integer id,String state);
}
