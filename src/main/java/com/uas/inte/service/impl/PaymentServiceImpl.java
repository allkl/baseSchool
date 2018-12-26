package com.uas.inte.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.uas.inte.dao.PaymentDao;
import com.uas.inte.domain.PaymentDO;
import com.uas.inte.service.PaymentService;



@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentDao paymentDao;
	
	@Override
	public PaymentDO get(Long stuPaymentId){
		return paymentDao.get(stuPaymentId);
	}
	
	@Override
	public List<PaymentDO> list(Map<String, Object> map){
		return paymentDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return paymentDao.count(map);
	}
	
	@Override
	public int save(PaymentDO payment){
		return paymentDao.save(payment);
	}
	
	@Override
	public int update(PaymentDO payment){
		return paymentDao.update(payment);
	}
	
	@Override
	public int remove(Long stuPaymentId){
		return paymentDao.remove(stuPaymentId);
	}
	
	@Override
	public int batchRemove(Long[] stuPaymentIds){
		return paymentDao.batchRemove(stuPaymentIds);
	}
	
}
