package com.uas.inte.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-28 20:45:38
 */
public class LeaveItemDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Long lvId;
	//名称
	private String lvName;
	//详情
	private String lvDetails;
	//请假类型  1事假   2病假   3丧家   4陪产假
	private Integer lvType;
	//申请人（学生）
	private Long lvProposer;
	//老师申请
	private Long lvPro;
	//申请时间
	private Date applyDate;
	//审批人
	private Long lvApprover;
	//审批时间
	private Date approveDate;
	//状态
	private Integer lvStatus;
	//请假开始时间
	private Date startDate;
	//请假结束时间
	private Date endDate;
	//备注
	private String lvRemarks;
	//学生申请人姓名
	private String proposerName;
	//审批姓名
	private String approverName;

	/**
	 * 设置：编号
	 */
	public void setLvId(Long lvId) {
		this.lvId = lvId;
	}
	/**
	 * 获取：编号
	 */
	public Long getLvId() {
		return lvId;
	}
	/**
	 * 设置：名称
	 */
	public void setLvName(String lvName) {
		this.lvName = lvName;
	}
	/**
	 * 获取：名称
	 */
	public String getLvName() {
		return lvName;
	}
	/**
	 * 设置：详情
	 */
	public void setLvDetails(String lvDetails) {
		this.lvDetails = lvDetails;
	}
	/**
	 * 获取：详情
	 */
	public String getLvDetails() {
		return lvDetails;
	}
	/**
	 * 设置：请假类型  1事假   2病假   3丧家   4陪产假
	 */
	public void setLvType(Integer lvType) {
		this.lvType = lvType;
	}
	/**
	 * 获取：请假类型  1事假   2病假   3丧家   4陪产假
	 */
	public Integer getLvType() {
		return lvType;
	}
	/**
	 * 设置：申请人（学生）
	 */
	public void setLvProposer(Long lvProposer) {
		this.lvProposer = lvProposer;
	}
	/**
	 * 获取：申请人（学生）
	 */
	public Long getLvProposer() {
		return lvProposer;
	}
	/**
	 * 设置：老师申请
	 */
	public void setLvPro(Long lvPro) {
		this.lvPro = lvPro;
	}
	/**
	 * 获取：老师申请
	 */
	public Long getLvPro() {
		return lvPro;
	}
	/**
	 * 设置：申请时间
	 */
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	/**
	 * 获取：申请时间
	 */
	public Date getApplyDate() {
		return applyDate;
	}
	/**
	 * 设置：审批人
	 */
	public void setLvApprover(Long lvApprover) {
		this.lvApprover = lvApprover;
	}
	/**
	 * 获取：审批人
	 */
	public Long getLvApprover() {
		return lvApprover;
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
	public void setLvStatus(Integer lvStatus) {
		this.lvStatus = lvStatus;
	}
	/**
	 * 获取：状态
	 */
	public Integer getLvStatus() {
		return lvStatus;
	}
	/**
	 * 设置：请假开始时间
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * 获取：请假开始时间
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * 设置：请假结束时间
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * 获取：请假结束时间
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * 设置：备注
	 */
	public void setLvRemarks(String lvRemarks) {
		this.lvRemarks = lvRemarks;
	}
	/**
	 * 获取：备注
	 */
	public String getLvRemarks() {
		return lvRemarks;
	}

	public String getProposerName() {
		return proposerName;
	}

	public void setProposerName(String proposerName) {
		this.proposerName = proposerName;
	}

	public String getApproverName() {
		return approverName;
	}

	public void setApproverName(String approverName) {
		this.approverName = approverName;
	}
}
