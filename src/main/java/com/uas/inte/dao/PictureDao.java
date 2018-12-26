package com.uas.inte.dao;

import com.uas.inte.domain.PictureDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:40:30
 */
@Mapper
public interface PictureDao {

	PictureDO get(Long picId);

	//相册
	List<PictureDO> pictureList(Map<String, Object> map);

	//视频
	List<PictureDO> videoList(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PictureDO picture);
	
	int update(PictureDO picture);
	
	int remove(Long pic_id);
	
	int batchRemove(Long[] picIds);
}
