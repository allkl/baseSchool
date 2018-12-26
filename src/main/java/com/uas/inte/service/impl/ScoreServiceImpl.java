package com.uas.inte.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.uas.inte.dao.ScoreDao;
import com.uas.inte.domain.ScoreDO;
import com.uas.inte.service.ScoreService;



@Service
public class ScoreServiceImpl implements ScoreService {
	@Autowired
	private ScoreDao scoreDao;
	
	@Override
	public ScoreDO get(Long scoreId){
		return scoreDao.get(scoreId);
	}
	
	@Override
	public List<ScoreDO> list(Map<String, Object> map){
		return scoreDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return scoreDao.count(map);
	}
	
	@Override
	public int save(ScoreDO score){
		return scoreDao.save(score);
	}
	
	@Override
	public int update(ScoreDO score){
		return scoreDao.update(score);
	}
	
	@Override
	public int remove(Long scoreId){
		return scoreDao.remove(scoreId);
	}
	
	@Override
	public int batchRemove(Long[] scoreIds){
		return scoreDao.batchRemove(scoreIds);
	}
	
}
