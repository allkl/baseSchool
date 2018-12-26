package com.uas.inte.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:46:01
 */
public class VoteDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//编号
	private Long voteId;
	//名称
	private String voteName;
	//类型  1投票 2反馈   3问卷调查
	private Integer voteType;
	//创建人
	private Long creator;
	//创建时间
	private Date creatDate;
	//投票时间
	private Date voteDate;
	//投票人
	private String voter;
	//附件
	private String voteFile;
	//备注
	private String voteRemarks;
	//状态 1使用  2闲置
	private Integer voteStatus;

	/**
	 * 设置：编号
	 */
	public void setVoteId(Long voteId) {
		this.voteId = voteId;
	}
	/**
	 * 获取：编号
	 */
	public Long getVoteId() {
		return voteId;
	}
	/**
	 * 设置：名称
	 */
	public void setVoteName(String voteName) {
		this.voteName = voteName;
	}
	/**
	 * 获取：名称
	 */
	public String getVoteName() {
		return voteName;
	}
	/**
	 * 设置：类型  1投票 2反馈   3问卷调查
	 */
	public void setVoteType(Integer voteType) {
		this.voteType = voteType;
	}
	/**
	 * 获取：类型  1投票 2反馈   3问卷调查
	 */
	public Integer getVoteType() {
		return voteType;
	}
	/**
	 * 设置：创建人
	 */
	public void setCreator(Long creator) {
		this.creator = creator;
	}
	/**
	 * 获取：创建人
	 */
	public Long getCreator() {
		return creator;
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
	 * 设置：投票时间
	 */
	public void setVoteDate(Date voteDate) {
		this.voteDate = voteDate;
	}
	/**
	 * 获取：投票时间
	 */
	public Date getVoteDate() {
		return voteDate;
	}
	/**
	 * 设置：投票人
	 */
	public void setVoter(String voter) {
		this.voter = voter;
	}
	/**
	 * 获取：投票人
	 */
	public String getVoter() {
		return voter;
	}
	/**
	 * 设置：附件
	 */
	public void setVoteFile(String voteFile) {
		this.voteFile = voteFile;
	}
	/**
	 * 获取：附件
	 */
	public String getVoteFile() {
		return voteFile;
	}
	/**
	 * 设置：备注
	 */
	public void setVoteRemarks(String voteRemarks) {
		this.voteRemarks = voteRemarks;
	}
	/**
	 * 获取：备注
	 */
	public String getVoteRemarks() {
		return voteRemarks;
	}
	/**
	 * 设置：状态 1使用  2闲置
	 */
	public void setVoteStatus(Integer voteStatus) {
		this.voteStatus = voteStatus;
	}
	/**
	 * 获取：状态 1使用  2闲置
	 */
	public Integer getVoteStatus() {
		return voteStatus;
	}
}
