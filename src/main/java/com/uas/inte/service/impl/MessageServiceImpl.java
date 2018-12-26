package com.uas.inte.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.uas.inte.dao.MessageDao;
import com.uas.inte.domain.MessageDO;
import com.uas.inte.service.MessageService;



@Service
public class MessageServiceImpl implements MessageService {
	@Autowired
	private MessageDao messageDao;
	
	@Override
	public MessageDO get(Long messId){
		return messageDao.get(messId);
	}
	
	@Override
	public List<MessageDO> list(Map<String, Object> map){
		return messageDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return messageDao.count(map);
	}
	
	@Override
	public int save(MessageDO message){
		return messageDao.save(message);
	}
	
	@Override
	public int update(MessageDO message){
		return messageDao.update(message);
	}
	
	@Override
	public int remove(Long messId){
		return messageDao.remove(messId);
	}
	
	@Override
	public int batchRemove(Long[] messIds){
		return messageDao.batchRemove(messIds);
	}
	
}
