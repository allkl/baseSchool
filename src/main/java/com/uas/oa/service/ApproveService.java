package com.uas.oa.service;



import com.uas.oa.domain.ApproveDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-12-09 17:28:34
 */
public interface ApproveService {
	
	ApproveDO get(Long approveId);
	
	List<ApproveDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ApproveDO approve);
	
	int update(ApproveDO approve);
	
	int remove(Long approveId);
	
	int batchRemove(Long[] approveIds);
}
