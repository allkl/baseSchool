package com.uas.inte.dao;

import com.uas.inte.domain.LeaveItemDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-28 20:45:38
 */
@Mapper
public interface LeaveItemDao {

	LeaveItemDO get(Long lvId);
	
	List<LeaveItemDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(LeaveItemDO item);
	
	int update(LeaveItemDO item);
	
	int remove(Long lv_id);
	
	int batchRemove(Long[] lvIds);
}
