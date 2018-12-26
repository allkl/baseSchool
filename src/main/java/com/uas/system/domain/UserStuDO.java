package com.uas.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:23:41
 */
public class UserStuDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Long userStuId;
	//用户
	private Long userId;
	//学生
	private Long stuId;

	/**
	 * 设置：编号
	 */
	public void setUserStuId(Long userStuId) {
		this.userStuId = userStuId;
	}
	/**
	 * 获取：编号
	 */
	public Long getUserStuId() {
		return userStuId;
	}
	/**
	 * 设置：用户
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：学生
	 */
	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}
	/**
	 * 获取：学生
	 */
	public Long getStuId() {
		return stuId;
	}
}
