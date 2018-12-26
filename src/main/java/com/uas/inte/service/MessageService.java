package com.uas.inte.service;

import com.uas.inte.domain.MessageDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:32:48
 */

public interface MessageService {
	
	MessageDO get(Long messId);
	
	List<MessageDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(MessageDO message);
	
	int update(MessageDO message);
	
	int remove(Long messId);
	
	int batchRemove(Long[] messIds);
}
