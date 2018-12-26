package com.uas.inte.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:32:48
 */
public class MessageDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Long messId;
	//题目
	private String messName;
	//留言时间
	private Date messDate;
	//内容
	private String messContent;
	//留言人
	private Long userId;
	//通知
	private Long notifyId;
	//留言人姓名
	private String userName;

	/**
	 * 设置：编号
	 */
	public void setMessId(Long messId) {
		this.messId = messId;
	}
	/**
	 * 获取：编号
	 */
	public Long getMessId() {
		return messId;
	}
	/**
	 * 设置：题目
	 */
	public void setMessName(String messName) {
		this.messName = messName;
	}
	/**
	 * 获取：题目
	 */
	public String getMessName() {
		return messName;
	}
	/**
	 * 设置：留言时间
	 */
	public void setMessDate(Date messDate) {
		this.messDate = messDate;
	}
	/**
	 * 获取：留言时间
	 */
	public Date getMessDate() {
		return messDate;
	}
	/**
	 * 设置：内容
	 */
	public void setMessContent(String messContent) {
		this.messContent = messContent;
	}
	/**
	 * 获取：内容
	 */
	public String getMessContent() {
		return messContent;
	}
	/**
	 * 设置：留言人
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：留言人
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：通知
	 */
	public void setNotifyId(Long notifyId) {
		this.notifyId = notifyId;
	}
	/**
	 * 获取：通知
	 */
	public Long getNotifyId() {
		return notifyId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
