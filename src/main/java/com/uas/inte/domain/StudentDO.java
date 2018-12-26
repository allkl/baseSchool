package com.uas.inte.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;



/**
 *
 * @author cjx
 * @date 2018-11-22 14:51:15
 */
public class StudentDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Long stuId;
	//名字
	private String stuName;
	//生日
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date stuBirthday;
	//年龄
	private Integer stuAge;
	//性别   1男  2女
	private Integer stuSex;
	//地址
	private String stuAddress;
	//头像
	private String stuPhoto;
	//状态   1正常   2冻结
	private Integer stuStatus;
	//备注
	private String stuRemarks;
	//学号
	private String stuNumber;
	//所在班级
	private Long schId;
	//班级名称
	private String className;
	//生日时间（用于处理date时间问题）
	private String stuBirthdayStr;

	/**
	 * 设置：编号
	 */
	public void setStuId(Long stuId) {
		this.stuId = stuId;
	}
	/**
	 * 获取：编号
	 */
	public Long getStuId() {
		return stuId;
	}
	/**
	 * 设置：名字
	 */
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	/**
	 * 获取：名字
	 */
	public String getStuName() {
		return stuName;
	}
	/**
	 * 设置：生日
	 */
	public void setStuBirthday(Date stuBirthday) {
		this.stuBirthday = stuBirthday;
	}
	/**
	 * 获取：生日
	 */
	public Date getStuBirthday() {
		return stuBirthday;
	}
	/**
	 * 设置：年龄
	 */
	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getStuAge() {
		return stuAge;
	}
	/**
	 * 设置：性别   1男  2女
	 */
	public void setStuSex(Integer stuSex) {
		this.stuSex = stuSex;
	}
	/**
	 * 获取：性别   1男  2女
	 */
	public Integer getStuSex() {
		return stuSex;
	}
	/**
	 * 设置：地址
	 */
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	/**
	 * 获取：地址
	 */
	public String getStuAddress() {
		return stuAddress;
	}
	/**
	 * 设置：头像
	 */
	public void setStuPhoto(String stuPhoto) {
		this.stuPhoto = stuPhoto;
	}
	/**
	 * 获取：头像
	 */
	public String getStuPhoto() {
		return stuPhoto;
	}
	/**
	 * 设置：状态   1正常   2冻结
	 */
	public void setStuStatus(Integer stuStatus) {
		this.stuStatus = stuStatus;
	}
	/**
	 * 获取：状态   1正常   2冻结
	 */
	public Integer getStuStatus() {
		return stuStatus;
	}
	/**
	 * 设置：备注
	 */
	public void setStuRemarks(String stuRemarks) {
		this.stuRemarks = stuRemarks;
	}
	/**
	 * 获取：备注
	 */
	public String getStuRemarks() {
		return stuRemarks;
	}
	/**
	 * 设置：学号
	 */
	public void setStuNumber(String stuNumber) {
		this.stuNumber = stuNumber;
	}
	/**
	 * 获取：学号
	 */
	public String getStuNumber() {
		return stuNumber;
	}
	/**
	 * 设置：所在班级
	 */
	public void setSchId(Long schId) {
		this.schId = schId;
	}
	/**
	 * 获取：所在班级
	 */
	public Long getSchId() {
		return schId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getStuBirthdayStr() {
		return stuBirthdayStr;
	}

	public void setStuBirthdayStr(String stuBirthdayStr) {
		this.stuBirthdayStr = stuBirthdayStr;
	}

	@Override
	public String toString() {
		return "StudentDO{" +
				"stuId=" + stuId +
				", stuName='" + stuName + '\'' +
				", stuBirthday='" + stuBirthday +
				", stuAge='" + stuAge +
				", stuSex=" + stuSex +
				", stuAddress=" + stuAddress + '\'' +
				", stuPhoto=" + stuPhoto + '\'' +
				", stuStatus=" + stuStatus +
				", stuRemarks=" + stuRemarks + '\'' +
				", stuNumber=" + stuNumber + '\'' +
				", schId=" + schId +
				", className=" + className + '\'' +
				'}';
	}

}
