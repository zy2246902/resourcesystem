package com.lovo.resourcesystem.entity;
/**
 * 角色权限中间表
 * @author admin
 *
 */
public class CharacterPowerEntity {

	/**
	 * ID
	 */
	private Integer id;
	
	/**
	 * 角色ID
	 */
	private Integer  characterId;
	
	
	/**
	 * 权限ID
	 */
	
	private Integer powerId;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getCharacterId() {
		return characterId;
	}


	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}


	public Integer getPowerId() {
		return powerId;
	}


	public void setPowerId(Integer powerId) {
		this.powerId = powerId;
	}
	
	
}
