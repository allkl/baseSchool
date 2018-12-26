package com.uas.system.service.impl;

import com.uas.system.dao.UserStuDao;

import com.uas.system.domain.UserStuDO;
import com.uas.system.service.UserStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;




@Service
public class UserStuServiceImpl implements UserStuService {

	@Autowired
	private UserStuDao userStuDao;
	
	@Override
	public UserStuDO get(Long userStuId){
		return userStuDao.get(userStuId);
	}
	
	@Override
	public List<UserStuDO> list(Map<String, Object> map){
		return userStuDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return userStuDao.count(map);
	}
	
	@Override
	public int save(UserStuDO stu){
		return userStuDao.save(stu);
	}
	
	@Override
	public int update(UserStuDO stu){
		return userStuDao.update(stu);
	}
	
	@Override
	public int remove(Long userStuId){
		return userStuDao.remove(userStuId);
	}
	
	@Override
	public int batchRemove(Long[] userStuIds){
		return userStuDao.batchRemove(userStuIds);
	}
	
}
