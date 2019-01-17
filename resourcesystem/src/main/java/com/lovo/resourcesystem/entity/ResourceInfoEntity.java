package com.lovo.resourcesystem.entity;
/**
 * 资源信息事件表
 * @author admin
 *
 */

import java.sql.Date;

public class ResourceInfoEntity {


	/**
	 * ID
	 */
	private Integer id;

	/**
	 * 事件接受资源ID
	 */
	private Integer eventSourceId;

	/**
	 * 状态
	 */
	private  String state;


	/**
	 * 派出日期
	 */
	private Date outDate;

	/**
	 * 归还日期
	 */
	private Date backDate;


	/**
	 * 资源类型
	 */
	private String type;

	/**
	 * 资源名
	 */
	private String resourceName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getEventSourceId() {
		return eventSourceId;
	}

	public void setEventSourceId(Integer eventSourceId) {
		this.eventSourceId = eventSourceId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getOutDate() {
		return outDate;
	}

	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}

	public Date getBackDate() {
		return backDate;
	}

	public void setBackDate(Date backDate) {
		this.backDate = backDate;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}


}
