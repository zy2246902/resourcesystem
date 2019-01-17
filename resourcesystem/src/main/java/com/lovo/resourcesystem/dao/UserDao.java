package com.lovo.resourcesystem.dao;
/**
 * 用户实体类
 * @author admin
 *
 */

import java.util.List;

import com.lovo.resourcesystem.entity.UserEntity;

public interface UserDao {

	/**
	 * 添加用户
	 * @param id
	 */
	public void userAdd(Integer id);
	
	/**
	 * 根据ID删除用户
	 * @param id
	 */
	public void userDelete(Integer id);
	
	/**
	 * 根据ID修改用户
	 * @param id
	 */
	public void userRevise(Integer id);
	
	/**
	 * 展示所有用户
	 * @return
	 */
	public List<UserEntity> userFind();
}
