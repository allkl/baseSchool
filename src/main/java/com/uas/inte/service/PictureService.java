package com.uas.inte.service;

import com.uas.inte.domain.PictureDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:40:30
 */

public interface PictureService {
	
	PictureDO get(Long picId);
	
	List<PictureDO> pictureList(Map<String, Object> map);

	List<PictureDO> videoList(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PictureDO picture);
	
	int update(PictureDO picture);
	
	int remove(Long picId);
	
	int batchRemove(Long[] picIds);
}
