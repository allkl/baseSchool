package com.uas.inte.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.uas.common.controller.BaseController;
import com.uas.common.utils.PageUtils;
import com.uas.common.utils.Query;
import com.uas.common.utils.R;
import com.uas.system.service.UserService;
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

import com.uas.inte.domain.MessageDO;
import com.uas.inte.service.MessageService;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:32:48
 */
 
@Controller
@RequestMapping("inte/message")
public class MessageController extends BaseController {
	@Autowired
	private MessageService messageService;
	@Autowired
	private UserService userService;
	
	@GetMapping()
	@RequiresPermissions("inte:message:message")
	String Message(){
	    return "inte/message/message";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("inte:message:message")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<MessageDO> messageList = messageService.list(query);
		for (MessageDO messageDO : messageList){
			messageDO.setUserName(userService.get(messageDO.getUserId()).getUserName());
		}
		int total = messageService.count(query);
		PageUtils pageUtils = new PageUtils(messageList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("inte:message:add")
	String add(){
	    return "inte/message/add";
	}

	@GetMapping("/edit/{messId}")
	@RequiresPermissions("inte:message:edit")
	String edit(@PathVariable("messId") Long messId,Model model){
		MessageDO message = messageService.get(messId);
		model.addAttribute("message", message);
	    return "inte/message/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("inte:message:add")
	public R save(MessageDO message){
		//留言人
		message.setUserId(getUserId());
		//留言时间
		message.setMessDate(new Date());
		if(messageService.save(message)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("inte:message:edit")
	public R update( MessageDO message){
		messageService.update(message);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("inte:message:remove")
	public R remove( Long messId){
		if(messageService.remove(messId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("inte:message:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] messIds){
		messageService.batchRemove(messIds);
		return R.ok();
	}
	
}
