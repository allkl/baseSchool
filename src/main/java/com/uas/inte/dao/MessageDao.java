package com.uas.inte.dao;

import com.uas.inte.domain.MessageDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:32:48
 */
@Mapper
public interface MessageDao {

	MessageDO get(Long messId);
	
	List<MessageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(MessageDO message);
	
	int update(MessageDO message);
	
	int remove(Long mess_id);
	
	int batchRemove(Long[] messIds);
}
