package com.uas.inte.service;

import com.uas.inte.domain.ScoreDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:43:00
 */

public interface ScoreService {
	
	ScoreDO get(Long scoreId);
	
	List<ScoreDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ScoreDO score);
	
	int update(ScoreDO score);
	
	int remove(Long scoreId);
	
	int batchRemove(Long[] scoreIds);
}
