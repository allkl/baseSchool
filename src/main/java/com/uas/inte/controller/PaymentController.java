package com.uas.inte.controller;

import java.util.List;
import java.util.Map;

import com.uas.common.utils.PageUtils;
import com.uas.common.utils.Query;
import com.uas.common.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uas.inte.domain.PaymentDO;
import com.uas.inte.service.PaymentService;
/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:21:15
 */
 
@Controller
@RequestMapping("inte/payment")
public class PaymentController {
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping()
	@RequiresPermissions("inte:payment:payment")
	String Payment(){
	    return "inte/payment/payment";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("inte:payment:payment")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PaymentDO> paymentList = paymentService.list(query);
		int total = paymentService.count(query);
		PageUtils pageUtils = new PageUtils(paymentList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("inte:payment:add")
	String add(){
	    return "inte/payment/add";
	}

	@GetMapping("/edit/{stuPaymentId}")
	@RequiresPermissions("inte:payment:edit")
	String edit(@PathVariable("stuPaymentId") Long stuPaymentId,Model model){
		PaymentDO payment = paymentService.get(stuPaymentId);
		model.addAttribute("payment", payment);
	    return "inte/payment/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("inte:payment:add")
	public R save(PaymentDO payment){
		if(paymentService.save(payment)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("inte:payment:edit")
	public R update( PaymentDO payment){
		paymentService.update(payment);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("inte:payment:remove")
	public R remove( Long stuPaymentId){
		if(paymentService.remove(stuPaymentId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("inte:payment:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] stuPaymentIds){
		paymentService.batchRemove(stuPaymentIds);
		return R.ok();
	}
	
}
