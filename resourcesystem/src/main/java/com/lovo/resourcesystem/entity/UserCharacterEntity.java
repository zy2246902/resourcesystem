package com.lovo.resourcesystem.entity;
/**
 * 用户角色中间表
 * @author admin
 *
 */
public class UserCharacterEntity {
    /**
     * ID
     */
	private Integer id;
	
	/**
	 * 用户表ID
	 */
	private Integer userId;
	
	/**
	 * 角色表ID
	 */
	private Integer  characterId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getCharacterId() {
		return characterId;
	}

	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}
	
	
	
}
