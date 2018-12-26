package com.uas.inte.service;

import com.uas.inte.domain.LeaveItemDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-28 20:45:38
 */

public interface LeaveItemService {
	
	LeaveItemDO get(Long lvId);
	
	List<LeaveItemDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(LeaveItemDO item);
	
	int update(LeaveItemDO item);
	
	int remove(Long lvId);
	
	int batchRemove(Long[] lvIds);
}
