package com.uas.inte.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.uas.inte.dao.CurriculumDao;
import com.uas.inte.domain.CurriculumDO;
import com.uas.inte.service.CurriculumService;



@Service
public class CurriculumServiceImpl implements CurriculumService {
	@Autowired
	private CurriculumDao curriculumDao;
	
	@Override
	public CurriculumDO get(Long curId){
		return curriculumDao.get(curId);
	}
	
	@Override
	public List<CurriculumDO> list(Map<String, Object> map){
		return curriculumDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return curriculumDao.count(map);
	}
	
	@Override
	public int save(CurriculumDO curriculum){
		return curriculumDao.save(curriculum);
	}
	
	@Override
	public int update(CurriculumDO curriculum){
		return curriculumDao.update(curriculum);
	}
	
	@Override
	public int remove(Long curId){
		return curriculumDao.remove(curId);
	}
	
	@Override
	public int batchRemove(Long[] curIds){
		return curriculumDao.batchRemove(curIds);
	}
	
}
