package com.uas.inte.dao;

import com.uas.inte.domain.CurriculumDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:28:13
 */
@Mapper
public interface CurriculumDao {

	CurriculumDO get(Long curId);
	
	List<CurriculumDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CurriculumDO curriculum);
	
	int update(CurriculumDO curriculum);
	
	int remove(Long cur_id);
	
	int batchRemove(Long[] curIds);
}
