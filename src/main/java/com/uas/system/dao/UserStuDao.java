package com.uas.system.dao;

import java.util.List;
import java.util.Map;

import com.uas.system.domain.UserStuDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:23:41
 */
@Mapper
public interface UserStuDao {

	UserStuDO get(Long userStuId);
	
	List<UserStuDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserStuDO stu);
	
	int update(UserStuDO stu);
	
	int remove(Long user_stu_id);
	
	int batchRemove(Long[] userStuIds);
}
