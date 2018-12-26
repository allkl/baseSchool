package com.uas.inte.controller;

import java.util.List;
import java.util.Map;

import com.uas.common.utils.PageUtils;
import com.uas.common.utils.Query;
import com.uas.common.utils.R;
import com.uas.inte.service.LeaveItemService;
import com.uas.inte.service.StudentService;
import com.uas.system.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uas.inte.domain.LeaveItemDO;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-28 20:45:38
 */
 
@Controller
@RequestMapping("inte/leaveItem")
public class LeaveItemController {
	@Autowired
	private LeaveItemService leaveItemService;
	@Autowired
	private UserService userService;
	@Autowired
	private StudentService studentService;
	
	@GetMapping()
	@RequiresPermissions("inte:leaveItem:leaveItem")
	String Item(){
	    return "inte/leaveItem/leaveItem";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("inte:leaveItem:leaveItem")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<LeaveItemDO> itemList = leaveItemService.list(query);
		for (LeaveItemDO leaveItemDO : itemList){
			leaveItemDO.setApproverName(userService.get(leaveItemDO.getLvApprover()).getUserName());
			leaveItemDO.setProposerName(studentService.get(leaveItemDO.getLvProposer()).getStuName());
		}
		int total = leaveItemService.count(query);
		PageUtils pageUtils = new PageUtils(itemList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("inte:leaveItem:add")
	String add(){
	    return "inte/leaveItem/add";
	}

	@GetMapping("/edit/{lvId}")
	@RequiresPermissions("inte:leaveItem:edit")
	String edit(@PathVariable("lvId") Long lvId,Model model){
		LeaveItemDO leaveItem = leaveItemService.get(lvId);
		model.addAttribute("leaveItem", leaveItem);
	    return "inte/leaveItem/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("inte:leaveItem:add")
	public R save(LeaveItemDO item){
		if(leaveItemService.save(item)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("inte:leaveItem:edit")
	public R update( LeaveItemDO item){
		leaveItemService.update(item);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("inte:leaveItem:remove")
	public R remove( Long lvId){
		if(leaveItemService.remove(lvId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("inte:leaveItem:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] lvIds){
		leaveItemService.batchRemove(lvIds);
		return R.ok();
	}
	
}
