package com.uas.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:22:59
 */
public class UserSchDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Long userSchId;
	//年级班级
	private Long schId;
	//教师
	private Long userId;

	/**
	 * 设置：编号
	 */
	public void setUserSchId(Long userSchId) {
		this.userSchId = userSchId;
	}
	/**
	 * 获取：编号
	 */
	public Long getUserSchId() {
		return userSchId;
	}
	/**
	 * 设置：年级班级
	 */
	public void setSchId(Long schId) {
		this.schId = schId;
	}
	/**
	 * 获取：年级班级
	 */
	public Long getSchId() {
		return schId;
	}
	/**
	 * 设置：教师
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：教师
	 */
	public Long getUserId() {
		return userId;
	}
}
