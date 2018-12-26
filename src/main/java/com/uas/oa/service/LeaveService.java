package com.uas.oa.service;


import com.uas.oa.domain.LeaveDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-12-09 17:32:23
 */
public interface LeaveService {
	
	LeaveDO get(Long lvId);
	
	List<LeaveDO> stuLeaveList(Map<String, Object> map);

	List<LeaveDO> teacherLeaveList(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(LeaveDO leave);
	
	int update(LeaveDO leave);
	
	int remove(Long lvId);
	
	int batchRemove(Long[] lvIds);
}
