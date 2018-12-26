package com.uas.inte.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.uas.inte.dao.VoteDao;
import com.uas.inte.domain.VoteDO;
import com.uas.inte.service.VoteService;



@Service
public class VoteServiceImpl implements VoteService {
	@Autowired
	private VoteDao voteDao;
	
	@Override
	public VoteDO get(Long voteId){
		return voteDao.get(voteId);
	}
	
	@Override
	public List<VoteDO> list(Map<String, Object> map){
		return voteDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return voteDao.count(map);
	}
	
	@Override
	public int save(VoteDO vote){
		return voteDao.save(vote);
	}
	
	@Override
	public int update(VoteDO vote){
		return voteDao.update(vote);
	}
	
	@Override
	public int remove(Long voteId){
		return voteDao.remove(voteId);
	}
	
	@Override
	public int batchRemove(Long[] voteIds){
		return voteDao.batchRemove(voteIds);
	}
	
}
