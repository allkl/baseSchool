package com.uas.inte.service;

import com.uas.inte.domain.NotifyDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:33:53
 */

public interface NotifyService {
	
	NotifyDO get(Long notifyId);
	
	List<NotifyDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(NotifyDO notify);
	
	int update(NotifyDO notify);
	
	int remove(Long notifyId);
	
	int batchRemove(Long[] notifyIds);

	List<NotifyDO> headmasterMessageList(Map<String, Object> map);
}
