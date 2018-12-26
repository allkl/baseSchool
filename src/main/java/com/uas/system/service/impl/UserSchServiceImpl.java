package com.uas.system.service.impl;

import com.uas.system.dao.UserSchDao;
import com.uas.system.domain.UserSchDO;
import com.uas.system.service.UserSchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;




@Service
public class UserSchServiceImpl implements UserSchService {
	@Autowired
	private UserSchDao userSchDao;
	
	@Override
	public UserSchDO get(Long userSchId){
		return userSchDao.get(userSchId);
	}
	
	@Override
	public List<UserSchDO> list(Map<String, Object> map){
		return userSchDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return userSchDao.count(map);
	}
	
	@Override
	public int save(UserSchDO sch){
		return userSchDao.save(sch);
	}
	
	@Override
	public int update(UserSchDO sch){
		return userSchDao.update(sch);
	}
	
	@Override
	public int remove(Long userSchId){
		return userSchDao.remove(userSchId);
	}
	
	@Override
	public int batchRemove(Long[] userSchIds){
		return userSchDao.batchRemove(userSchIds);
	}
	
}
