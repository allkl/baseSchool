package com.uas.inte.service;

import com.uas.inte.domain.CurriculumDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:28:13
 */

public interface CurriculumService {
	
	CurriculumDO get(Long curId);
	
	List<CurriculumDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CurriculumDO curriculum);
	
	int update(CurriculumDO curriculum);
	
	int remove(Long curId);
	
	int batchRemove(Long[] curIds);
}
