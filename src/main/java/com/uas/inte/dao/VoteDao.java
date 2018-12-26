package com.uas.inte.dao;

import com.uas.inte.domain.VoteDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:46:01
 */
@Mapper
public interface VoteDao {

	VoteDO get(Long voteId);
	
	List<VoteDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(VoteDO vote);
	
	int update(VoteDO vote);
	
	int remove(Long vote_id);
	
	int batchRemove(Long[] voteIds);
}
