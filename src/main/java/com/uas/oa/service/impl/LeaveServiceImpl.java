package com.uas.oa.service.impl;

import com.uas.oa.dao.LeaveDao;
import com.uas.oa.domain.LeaveDO;
import com.uas.oa.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class LeaveServiceImpl implements LeaveService {
	@Autowired
	private LeaveDao leaveDao;
	
	@Override
	public LeaveDO get(Long lvId){
		return leaveDao.get(lvId);
	}
	
	@Override
	public List<LeaveDO> stuLeaveList(Map<String, Object> map){
		return leaveDao.stuLeaveList(map);
	}

	@Override
	public List<LeaveDO> teacherLeaveList(Map<String, Object> map){
		return leaveDao.teacherLeaveList(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return leaveDao.count(map);
	}
	
	@Override
	public int save(LeaveDO leave){
		return leaveDao.save(leave);
	}
	
	@Override
	public int update(LeaveDO leave){
		return leaveDao.update(leave);
	}
	
	@Override
	public int remove(Long lvId){
		return leaveDao.remove(lvId);
	}
	
	@Override
	public int batchRemove(Long[] lvIds){
		return leaveDao.batchRemove(lvIds);
	}
	
}
