package com.uas.inte.dao;

import com.uas.inte.domain.NotifyDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:33:53
 */
@Mapper
public interface NotifyDao {

	NotifyDO get(Long notifyId);
	
	List<NotifyDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(NotifyDO notify);
	
	int update(NotifyDO notify);
	
	int remove(Long notify_id);
	
	int batchRemove(Long[] notifyIds);

	List<NotifyDO> headmasterMessageList(Map<String, Object> map);
}
