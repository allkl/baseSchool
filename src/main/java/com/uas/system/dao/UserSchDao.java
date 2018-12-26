package com.uas.system.dao;


import java.util.List;
import java.util.Map;

import com.uas.system.domain.UserSchDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:22:59
 */
@Mapper
public interface UserSchDao {

	UserSchDO get(Long userSchId);

	UserSchDO getSchId(Long userId);
	
	List<UserSchDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserSchDO sch);
	
	int update(UserSchDO sch);
	
	int remove(Long user_sch_id);

	int batchRemove(Long[] userSchIds);

	int batchSave(List<UserSchDO> list);

	int removeByUserId(Long userId);

	int batchRemoveByUserId(Long[] ids);
}
