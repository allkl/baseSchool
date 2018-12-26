package com.uas.oa.service.impl;

import com.uas.oa.dao.ApproveDao;
import com.uas.oa.domain.ApproveDO;
import com.uas.oa.service.ApproveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;





@Service
public class ApproveServiceImpl implements ApproveService {
	@Autowired
	private ApproveDao approveDao;
	
	@Override
	public ApproveDO get(Long approveId){
		return approveDao.get(approveId);
	}
	
	@Override
	public List<ApproveDO> list(Map<String, Object> map){
		return approveDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return approveDao.count(map);
	}
	
	@Override
	public int save(ApproveDO approve){
		return approveDao.save(approve);
	}
	
	@Override
	public int update(ApproveDO approve){
		return approveDao.update(approve);
	}
	
	@Override
	public int remove(Long approveId){
		return approveDao.remove(approveId);
	}
	
	@Override
	public int batchRemove(Long[] approveIds){
		return approveDao.batchRemove(approveIds);
	}
	
}
