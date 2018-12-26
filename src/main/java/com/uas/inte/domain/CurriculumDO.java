package com.uas.inte.domain;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;



/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:28:13
 */
public class CurriculumDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Long curId;
	//课程
	private String curName;
	//星期
	private String curWeek;
	//开始时间
	private Time curStartTime;
	//结束时间
	private Time curEndTime;
	//教师
	private Long userId;
	//状态  1使用   2草稿
	private Integer curStatus;
	//备注
	private String curRemarks;
	//班级
	private Long schId;

	/**
	 * 设置：编号
	 */
	public void setCurId(Long curId) {
		this.curId = curId;
	}
	/**
	 * 获取：编号
	 */
	public Long getCurId() {
		return curId;
	}
	/**
	 * 设置：课程
	 */
	public void setCurName(String curName) {
		this.curName = curName;
	}
	/**
	 * 获取：课程
	 */
	public String getCurName() {
		return curName;
	}
	/**
	 * 设置：星期
	 */
	public void setCurWeek(String curWeek) {
		this.curWeek = curWeek;
	}
	/**
	 * 获取：星期
	 */
	public String getCurWeek() {
		return curWeek;
	}
	/**
	 * 设置：开始时间
	 */
	public void setCurStartTime(Time curStartTime) {
		this.curStartTime = curStartTime;
	}
	/**
	 * 获取：开始时间
	 */
	public Time getCurStartTime() {
		return curStartTime;
	}
	/**
	 * 设置：结束时间
	 */
	public void setCurEndTime(Time curEndTime) {
		this.curEndTime = curEndTime;
	}
	/**
	 * 获取：结束时间
	 */
	public Time getCurEndTime() {
		return curEndTime;
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
	/**
	 * 设置：状态  1使用   2草稿
	 */
	public void setCurStatus(Integer curStatus) {
		this.curStatus = curStatus;
	}
	/**
	 * 获取：状态  1使用   2草稿
	 */
	public Integer getCurStatus() {
		return curStatus;
	}
	/**
	 * 设置：备注
	 */
	public void setCurRemarks(String curRemarks) {
		this.curRemarks = curRemarks;
	}
	/**
	 * 获取：备注
	 */
	public String getCurRemarks() {
		return curRemarks;
	}
	/**
	 * 设置：班级
	 */
	public void setSchId(Long schId) {
		this.schId = schId;
	}
	/**
	 * 获取：班级
	 */
	public Long getSchId() {
		return schId;
	}
}
