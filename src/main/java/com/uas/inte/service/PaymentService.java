package com.uas.inte.service;

import com.uas.inte.domain.PaymentDO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:21:15
 */

public interface PaymentService {
	
	PaymentDO get(Long stuPaymentId);
	
	List<PaymentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(PaymentDO payment);
	
	int update(PaymentDO payment);
	
	int remove(Long stuPaymentId);
	
	int batchRemove(Long[] stuPaymentIds);
}
