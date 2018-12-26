package com.uas.inte.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:40:30
 */
public class PictureDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Long picId;
	//名称
	private String picName;
	//地址
	private String picUrl;
	//创建时间
	private Date picDate;
	//类型  1相片  2视频
	private Integer picType;
	//状态   1草稿   2发布
	private Integer picStatus;
	//相册id
	private Long parentId;
	//备注
	private String picRemarks;
	//班级
	private Long schId;

	/**
	 * 设置：编号
	 */
	public void setPicId(Long picId) {
		this.picId = picId;
	}
	/**
	 * 获取：编号
	 */
	public Long getPicId() {
		return picId;
	}
	/**
	 * 设置：名称
	 */
	public void setPicName(String picName) {
		this.picName = picName;
	}
	/**
	 * 获取：名称
	 */
	public String getPicName() {
		return picName;
	}
	/**
	 * 设置：地址
	 */
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	/**
	 * 获取：地址
	 */
	public String getPicUrl() {
		return picUrl;
	}
	/**
	 * 设置：创建时间
	 */
	public void setPicDate(Date picDate) {
		this.picDate = picDate;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getPicDate() {
		return picDate;
	}
	/**
	 * 设置：类型  1相片  2视频
	 */
	public void setPicType(Integer picType) {
		this.picType = picType;
	}
	/**
	 * 获取：类型  1相片  2视频
	 */
	public Integer getPicType() {
		return picType;
	}
	/**
	 * 设置：状态   1草稿   2发布
	 */
	public void setPicStatus(Integer picStatus) {
		this.picStatus = picStatus;
	}
	/**
	 * 获取：状态   1草稿   2发布
	 */
	public Integer getPicStatus() {
		return picStatus;
	}
	/**
	 * 设置：相册id
	 */
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：相册id
	 */
	public Long getParentId() {
		return parentId;
	}
	/**
	 * 设置：备注
	 */
	public void setPicRemarks(String picRemarks) {
		this.picRemarks = picRemarks;
	}
	/**
	 * 获取：备注
	 */
	public String getPicRemarks() {
		return picRemarks;
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
