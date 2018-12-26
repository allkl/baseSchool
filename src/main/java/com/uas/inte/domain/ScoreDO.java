package com.uas.inte.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:43:00
 */
public class ScoreDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Long scoreId;
	//考试类型
	private String scoreType;
	//考试科目
	private String scoreName;
	//学生
	private Long stuId;
	//分值
	private Integer scoreTotal;
	//时间
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date scoreDate;
	//备注
	private String scoreRemarks;
	//开始时间（用于解决date问题）
	private String scoreDateStr;
	//学生姓名
	private String stuName;
	//所在班级
	private Long schId;
	//班级名称
	private String schName;


	/**
	 * 设置：编号
	 */
	public void setScoreId(Long scoreId) {
		this.scoreId = scoreId;
	}
	/**
	 * 获取：编号
	 */
	public Long getScoreId() {
		return scoreId;
	}
	/**
	 * 设置：考试类型
	 */
	public void setScoreType(String scoreType) {
		this.scoreType = scoreType;
	}
	/**
	 * 获取：考试类型
	 */
	public String getScoreType() {
		return scoreType;
	}
	/**
	 * 设置：考试科目
	 */
	public void setScoreName(String scoreName) {
		this.scoreName = scoreName;
	}
	/**
	 * 获取：考试科目
	 */
	public String getScoreName() {
		return scoreName;
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
	 * 设置：分值
	 */
	public void setScoreTotal(Integer scoreTotal) {
		this.scoreTotal = scoreTotal;
	}
	/**
	 * 获取：分值
	 */
	public Integer getScoreTotal() {
		return scoreTotal;
	}
	/**
	 * 设置：时间
	 */
	public void setScoreDate(Date scoreDate) {
		this.scoreDate = scoreDate;
	}
	/**
	 * 获取：时间
	 */
	public Date getScoreDate() {
		return scoreDate;
	}
	/**
	 * 设置：备注
	 */
	public void setScoreRemarks(String scoreRemarks) {
		this.scoreRemarks = scoreRemarks;
	}
	/**
	 * 获取：备注
	 */
	public String getScoreRemarks() {
		return scoreRemarks;
	}

	public String getScoreDateStr() {
		return scoreDateStr;
	}

	public void setScoreDateStr(String scoreDateStr) {
		this.scoreDateStr = scoreDateStr;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Long getSchId() {
		return schId;
	}

	public void setSchId(Long schId) {
		this.schId = schId;
	}

	public String getSchName() {
		return schName;
	}

	public void setSchName(String schName) {
		this.schName = schName;
	}
}
