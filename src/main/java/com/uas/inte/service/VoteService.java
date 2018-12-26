package com.uas.inte.service;

import com.uas.inte.domain.VoteDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:46:01
 */

public interface VoteService {
	
	VoteDO get(Long voteId);
	
	List<VoteDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(VoteDO vote);
	
	int update(VoteDO vote);
	
	int remove(Long voteId);
	
	int batchRemove(Long[] voteIds);
}
