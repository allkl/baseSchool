package com.uas.inte.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:21:15
 */
public class PaymentDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Long stuPaymentId;
	//学生
	private Long stuId;
	//缴费人
	private Long userId;
	//单据id
	private Long payId;
	//缴费方式
	private String payType;
	//状态   1未支付   2已支付   3已退款
	private Integer status;
	//支付时间
	private Date payDate;
	//备注
	private String remarks;

	/**
	 * 设置：编号
	 */
	public void setStuPaymentId(Long stuPaymentId) {
		this.stuPaymentId = stuPaymentId;
	}
	/**
	 * 获取：编号
	 */
	public Long getStuPaymentId() {
		return stuPaymentId;
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
	/**
	 * 设置：缴费人
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：缴费人
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：单据id
	 */
	public void setPayId(Long payId) {
		this.payId = payId;
	}
	/**
	 * 获取：单据id
	 */
	public Long getPayId() {
		return payId;
	}
	/**
	 * 设置：缴费方式
	 */
	public void setPayType(String payType) {
		this.payType = payType;
	}
	/**
	 * 获取：缴费方式
	 */
	public String getPayType() {
		return payType;
	}
	/**
	 * 设置：状态   1未支付   2已支付   3已退款
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态   1未支付   2已支付   3已退款
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：支付时间
	 */
	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	/**
	 * 获取：支付时间
	 */
	public Date getPayDate() {
		return payDate;
	}
	/**
	 * 设置：备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：备注
	 */
	public String getRemarks() {
		return remarks;
	}
}
