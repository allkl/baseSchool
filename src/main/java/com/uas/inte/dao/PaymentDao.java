package com.uas.inte.dao;

import com.uas.inte.domain.PaymentDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:21:15
 */
@Mapper
public interface PaymentDao {

	PaymentDO get(Long stuPaymentId);
	
	List<PaymentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PaymentDO payment);
	
	int update(PaymentDO payment);
	
	int remove(Long stu_payment_id);
	
	int batchRemove(Long[] stuPaymentIds);
}
