package com.lovo.resourcesystem.entity;
/**
 * 库存人员表
 * @author admin
 *
 */
public class CashStatementEntity {
    /**
     * ID
     */
	private Integer InventoriesId;
	/**
	 * 姓名
	 */
	private String  name;
	/**
	 * 联系方式
	 */
	private String  phone;
	/**
	 * 库存状态
	 */
	private  String state;
	public Integer getInventoriesId() {
		return InventoriesId;
	}
	public void setInventoriesId(Integer inventoriesId) {
		InventoriesId = inventoriesId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "CashStatementEntity [InventoriesId=" + InventoriesId + ", name=" + name + ", phone=" + phone
				+ ", state=" + state + "]";
	}
	
	
	
	
	
}
