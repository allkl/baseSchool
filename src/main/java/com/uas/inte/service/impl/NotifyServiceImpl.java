package com.uas.inte.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.uas.inte.dao.NotifyDao;
import com.uas.inte.domain.NotifyDO;
import com.uas.inte.service.NotifyService;



@Service
public class NotifyServiceImpl implements NotifyService {
	@Autowired
	private NotifyDao notifyDao;
	
	@Override
	public NotifyDO get(Long notifyId){
		return notifyDao.get(notifyId);
	}
	
	@Override
	public List<NotifyDO> list(Map<String, Object> map){
		return notifyDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return notifyDao.count(map);
	}
	
	@Override
	public int save(NotifyDO notify){
		notify.setCreatDate(new Date());
		return notifyDao.save(notify);
	}
	
	@Override
	public int update(NotifyDO notify){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date startDate = simpleDateFormat.parse(notify.getStartDateStr());
			Date endDate = simpleDateFormat.parse(notify.getEndDateStr());
			Date reminderDate = simpleDateFormat.parse(notify.getReminderDateStr());
			notify.setStartDate(startDate);
			notify.setEndDate(endDate);
			notify.setReminderDate(reminderDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return notifyDao.update(notify);
	}
	
	@Override
	public int remove(Long notifyId){
		return notifyDao.remove(notifyId);
	}
	
	@Override
	public int batchRemove(Long[] notifyIds){
		return notifyDao.batchRemove(notifyIds);
	}

	@Override
	public List<NotifyDO> headmasterMessageList(Map<String, Object> map) {
		return notifyDao.headmasterMessageList(map);
	}

}
