package com.uas.inte.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.uas.inte.dao.PictureDao;
import com.uas.inte.domain.PictureDO;
import com.uas.inte.service.PictureService;



@Service
public class PictureServiceImpl implements PictureService {
	@Autowired
	private PictureDao pictureDao;
	
	@Override
	public PictureDO get(Long picId){
		return pictureDao.get(picId);
	}
	
	@Override
	public List<PictureDO> pictureList(Map<String, Object> map){
		return pictureDao.pictureList(map);
	}

	@Override
	public List<PictureDO> videoList(Map<String, Object> map) {
		return pictureDao.videoList(map);
	}

	@Override
	public int count(Map<String, Object> map){
		return pictureDao.count(map);
	}
	
	@Override
	public int save(PictureDO picture){
		return pictureDao.save(picture);
	}
	
	@Override
	public int update(PictureDO picture){
		return pictureDao.update(picture);
	}
	
	@Override
	public int remove(Long picId){
		return pictureDao.remove(picId);
	}
	
	@Override
	public int batchRemove(Long[] picIds){
		return pictureDao.batchRemove(picIds);
	}
	
}
