package com.uas.oa.dao;



import java.util.List;
import java.util.Map;

import com.uas.oa.domain.LeaveDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-12-09 17:32:23
 */
@Mapper
public interface LeaveDao {

	LeaveDO get(Long lvId);
	
	List<LeaveDO> stuLeaveList(Map<String, Object> map);

	List<LeaveDO> teacherLeaveList(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(LeaveDO leave);
	
	int update(LeaveDO leave);
	
	int remove(Long lv_id);
	
	int batchRemove(Long[] lvIds);
}
