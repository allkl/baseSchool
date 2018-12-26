package com.uas.oa.controller;

import java.util.List;
import java.util.Map;

import com.uas.common.utils.PageUtils;
import com.uas.common.utils.Query;
import com.uas.common.utils.R;
import com.uas.oa.domain.LeaveDO;
import com.uas.oa.service.LeaveService;
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


/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-12-09 17:32:23
 */
 
@Controller
@RequestMapping("oa/leave")
public class LeaveController {
	@Autowired
	private LeaveService leaveService;
	
	@GetMapping("/stuLeave")
	@RequiresPermissions("oa:leave:leave")
	String stuLeave(){
	    return "oa/leave/stuLeave";
	}

	@GetMapping("/teacherLeave")
	@RequiresPermissions("oa:leave:leave")
	String teacherLeave(){
		return "oa/leave/teacherLeave";
	}
	
	@ResponseBody
	@GetMapping("/stuLeaveList")
	@RequiresPermissions("oa:leave:leave")
	public PageUtils stuLeaveList(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<LeaveDO> leaveList = leaveService.stuLeaveList(query);
		int total = leaveService.count(query);
		PageUtils pageUtils = new PageUtils(leaveList, total);
		return pageUtils;
	}

	@ResponseBody
	@GetMapping("/teacherLeaveList")
	@RequiresPermissions("oa:leave:leave")
	public PageUtils teacherLeaveList(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params);
		List<LeaveDO> leaveList = leaveService.teacherLeaveList(query);
		int total = leaveService.count(query);
		PageUtils pageUtils = new PageUtils(leaveList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("oa:leave:add")
	String add(){
	    return "oa/leave/add";
	}

	@GetMapping("/edit/{lvId}")
	@RequiresPermissions("oa:leave:edit")
	String edit(@PathVariable("lvId") Long lvId,Model model){
		LeaveDO leave = leaveService.get(lvId);
		model.addAttribute("leave", leave);
	    return "oa/leave/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("oa:leave:add")
	public R save(LeaveDO leave){
		if(leaveService.save(leave)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("oa:leave:edit")
	public R update( LeaveDO leave){
		leaveService.update(leave);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("oa:leave:remove")
	public R remove( Long lvId){
		if(leaveService.remove(lvId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("oa:leave:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] lvIds){
		leaveService.batchRemove(lvIds);
		return R.ok();
	}
	
}
