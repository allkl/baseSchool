package com.uas.system.service;


import com.uas.system.domain.UserStuDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:23:41
 */
public interface UserStuService {
	
	UserStuDO get(Long userStuId);
	
	List<UserStuDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserStuDO stu);
	
	int update(UserStuDO stu);
	
	int remove(Long userStuId);
	
	int batchRemove(Long[] userStuIds);
}
