package com.uas.inte.dao;

import com.uas.inte.domain.ScoreDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:43:00
 */
@Mapper
public interface ScoreDao {

	ScoreDO get(Long scoreId);
	
	List<ScoreDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ScoreDO score);
	
	int update(ScoreDO score);
	
	int remove(Long score_id);
	
	int batchRemove(Long[] scoreIds);
}
