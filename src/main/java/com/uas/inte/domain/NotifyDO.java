package com.uas.inte.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:33:53
 */
public class NotifyDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Long notifyId;
	//名称
	private String notifyName;
	//类型   1通知  2公告  3作业发布  4缴费通知   
	private Integer notifyType;
	//详情
	private String notifyDetails;
	//附件地址
	private String notifyFiles;
	//创建人
	private Long notifyCreator;
	//会议地址
	private String notifyAddress;
	//创建时间
	private Date creatDate;
	//开始时间
	private Date startDate;
	//结束时间
	private Date endDate;
	//提醒时间
	private Date reminderDate;
	//状态 1发布  2草稿
	private Integer notifyStatus;
	//备注
	private String notifyRemarks;
	//创建人姓名
	private String notifyCreatorName;
	//开始时间（用于处理date问题）
	private String startDateStr;
	//结束时间（用于处理date问题）
	private String endDateStr;
	//提醒时间（用于处理date问题）
	private String reminderDateStr;
	/**
	 * 设置：编号
	 */
	public void setNotifyId(Long notifyId) {
		this.notifyId = notifyId;
	}
	/**
	 * 获取：编号
	 */
	public Long getNotifyId() {
		return notifyId;
	}
	/**
	 * 设置：名称
	 */
	public void setNotifyName(String notifyName) {
		this.notifyName = notifyName;
	}
	/**
	 * 获取：名称
	 */
	public String getNotifyName() {
		return notifyName;
	}
	/**
	 * 设置：类型   1通知  2公告  3作业发布  4缴费通知   
	 */
	public void setNotifyType(Integer notifyType) {
		this.notifyType = notifyType;
	}
	/**
	 * 获取：类型   1通知  2公告  3作业发布  4缴费通知   
	 */
	public Integer getNotifyType() {
		return notifyType;
	}
	/**
	 * 设置：详情
	 */
	public void setNotifyDetails(String notifyDetails) {
		this.notifyDetails = notifyDetails;
	}
	/**
	 * 获取：详情
	 */
	public String getNotifyDetails() {
		return notifyDetails;
	}
	/**
	 * 设置：附件地址
	 */
	public void setNotifyFiles(String notifyFiles) {
		this.notifyFiles = notifyFiles;
	}
	/**
	 * 获取：附件地址
	 */
	public String getNotifyFiles() {
		return notifyFiles;
	}
	/**
	 * 设置：创建人
	 */
	public void setNotifyCreator(Long notifyCreator) {
		this.notifyCreator = notifyCreator;
	}
	/**
	 * 获取：创建人
	 */
	public Long getNotifyCreator() {
		return notifyCreator;
	}
	/**
	 * 设置：会议地址
	 */
	public void setNotifyAddress(String notifyAddress) {
		this.notifyAddress = notifyAddress;
	}
	/**
	 * 获取：会议地址
	 */
	public String getNotifyAddress() {
		return notifyAddress;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreatDate(Date creatDate) {
		this.creatDate = creatDate;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreatDate() {
		return creatDate;
	}
	/**
	 * 设置：开始时间
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取：开始时间
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 设置：结束时间
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * 获取：结束时间
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * 设置：提醒时间
	 */
	public void setReminderDate(Date reminderDate) {
		this.reminderDate = reminderDate;
	}
	/**
	 * 获取：提醒时间
	 */
	public Date getReminderDate() {
		return reminderDate;
	}
	/**
	 * 设置：状态 1发布  2草稿
	 */
	public void setNotifyStatus(Integer notifyStatus) {
		this.notifyStatus = notifyStatus;
	}
	/**
	 * 获取：状态 1发布  2草稿
	 */
	public Integer getNotifyStatus() {
		return notifyStatus;
	}
	/**
	 * 设置：备注
	 */
	public void setNotifyRemarks(String notifyRemarks) {
		this.notifyRemarks = notifyRemarks;
	}
	/**
	 * 获取：备注
	 */
	public String getNotifyRemarks() {
		return notifyRemarks;
	}

	public String getNotifyCreatorName() {
		return notifyCreatorName;
	}

	public void setNotifyCreatorName(String notifyCreatorName) {
		this.notifyCreatorName = notifyCreatorName;
	}

	public String getStartDateStr() {
		return startDateStr;
	}

	public void setStartDateStr(String startDateStr) {
		this.startDateStr = startDateStr;
	}

	public String getEndDateStr() {
		return endDateStr;
	}

	public void setEndDateStr(String endDateStr) {
		this.endDateStr = endDateStr;
	}

	public String getReminderDateStr() {
		return reminderDateStr;
	}

	public void setReminderDateStr(String reminderDateStr) {
		this.reminderDateStr = reminderDateStr;
	}
}
