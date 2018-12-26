package com.uas.system.service;



import com.uas.system.domain.UserSchDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:22:59
 */

public interface UserSchService {
	
	UserSchDO get(Long userSchId);
	
	List<UserSchDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserSchDO sch);
	
	int update(UserSchDO sch);
	
	int remove(Long userSchId);
	
	int batchRemove(Long[] userSchIds);
}
