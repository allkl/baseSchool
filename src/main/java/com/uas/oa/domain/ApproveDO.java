package com.uas.oa.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-12-09 17:28:34
 */
public class ApproveDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Long approveId;
	//名称
	private String approveName;
	//内容
	private String approveDetails;
	//类型 1、出差  2、用品 3、外出
	private Integer approveType;
	//细分类型
	private Integer appType;
	//申请人
	private Long proposer;
	//审批人
	private Long approver;
	//创建时间
	private Date creatDate;
	//审批时间
	private Date approveDate;
	//状态
	private Integer approveStatus;
	//开始时间
	private Date startDate;
	//结束时间
	private Date endDate;
	//地址
	private String address;
	//附件
	private String approveFiles;
	//审批意见
	private String approveOpinion;

	/**
	 * 设置：编号
	 */
	public void setApproveId(Long approveId) {
		this.approveId = approveId;
	}
	/**
	 * 获取：编号
	 */
	public Long getApproveId() {
		return approveId;
	}
	/**
	 * 设置：名称
	 */
	public void setApproveName(String approveName) {
		this.approveName = approveName;
	}
	/**
	 * 获取：名称
	 */
	public String getApproveName() {
		return approveName;
	}
	/**
	 * 设置：内容
	 */
	public void setApproveDetails(String approveDetails) {
		this.approveDetails = approveDetails;
	}
	/**
	 * 获取：内容
	 */
	public String getApproveDetails() {
		return approveDetails;
	}
	/**
	 * 设置：类型 1、出差  2、用品 3、外出
	 */
	public void setApproveType(Integer approveType) {
		this.approveType = approveType;
	}
	/**
	 * 获取：类型 1、出差  2、用品 3、外出
	 */
	public Integer getApproveType() {
		return approveType;
	}
	/**
	 * 设置：细分类型
	 */
	public void setAppType(Integer appType) {
		this.appType = appType;
	}
	/**
	 * 获取：细分类型
	 */
	public Integer getAppType() {
		return appType;
	}
	/**
	 * 设置：申请人
	 */
	public void setProposer(Long proposer) {
		this.proposer = proposer;
	}
	/**
	 * 获取：申请人
	 */
	public Long getProposer() {
		return proposer;
	}
	/**
	 * 设置：审批人
	 */
	public void setApprover(Long approver) {
		this.approver = approver;
	}
	/**
	 * 获取：审批人
	 */
	public Long getApprover() {
		return approver;
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
	 * 设置：审批时间
	 */
	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}
	/**
	 * 获取：审批时间
	 */
	public Date getApproveDate() {
		return approveDate;
	}
	/**
	 * 设置：状态
	 */
	public void setApproveStatus(Integer approveStatus) {
		this.approveStatus = approveStatus;
	}
	/**
	 * 获取：状态
	 */
	public Integer getApproveStatus() {
		return approveStatus;
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
	 * 设置：地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：附件
	 */
	public void setApproveFiles(String approveFiles) {
		this.approveFiles = approveFiles;
	}
	/**
	 * 获取：附件
	 */
	public String getApproveFiles() {
		return approveFiles;
	}
	/**
	 * 设置：审批意见
	 */
	public void setApproveOpinion(String approveOpinion) {
		this.approveOpinion = approveOpinion;
	}
	/**
	 * 获取：审批意见
	 */
	public String getApproveOpinion() {
		return approveOpinion;
	}
}
