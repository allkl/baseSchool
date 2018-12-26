package com.uas.inte.service.impl;

import com.uas.inte.dao.StudentDao;
import com.uas.inte.domain.StudentDO;
import com.uas.inte.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public StudentDO get(Long stuId){
		return studentDao.get(stuId);
	}
	
	@Override
	public List<StudentDO> list(Map<String, Object> map){
		return studentDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return studentDao.count(map);
	}
	
	@Override
	public int save(StudentDO student){
		return studentDao.save(student);
	}
	
	@Override
	public int update(StudentDO student){
		return studentDao.update(student);
	}
	
	@Override
	public int remove(Long stuId){
		return studentDao.remove(stuId);
	}
	
	@Override
	public int batchRemove(Long[] stuIds){
		return studentDao.batchRemove(stuIds);
	}

	@Override
	public List<StudentDO> stuNameList() {
		return studentDao.stuNameList();
	}

}
