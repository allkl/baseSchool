package com.uas.inte.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.uas.inte.dao.LeaveItemDao;
import com.uas.inte.domain.LeaveItemDO;
import com.uas.inte.service.LeaveItemService;



@Service
public class ItemServiceImpl implements LeaveItemService {
	@Autowired
	private LeaveItemDao itemDao;
	
	@Override
	public LeaveItemDO get(Long lvId){
		return itemDao.get(lvId);
	}
	
	@Override
	public List<LeaveItemDO> list(Map<String, Object> map){
		return itemDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return itemDao.count(map);
	}
	
	@Override
	public int save(LeaveItemDO item){
		return itemDao.save(item);
	}
	
	@Override
	public int update(LeaveItemDO item){
		return itemDao.update(item);
	}
	
	@Override
	public int remove(Long lvId){
		return itemDao.remove(lvId);
	}
	
	@Override
	public int batchRemove(Long[] lvIds){
		return itemDao.batchRemove(lvIds);
	}
	
}
