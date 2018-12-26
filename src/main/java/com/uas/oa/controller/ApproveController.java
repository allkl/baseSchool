package com.uas.oa.controller;

import java.util.List;
import java.util.Map;

import com.uas.common.utils.PageUtils;
import com.uas.common.utils.Query;
import com.uas.common.utils.R;
import com.uas.oa.domain.ApproveDO;
import com.uas.oa.service.ApproveService;
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
 * @date 2018-12-09 17:28:34
 */
 
@Controller
@RequestMapping("oa/approve")
public class ApproveController {
	@Autowired
	private ApproveService approveService;
	
	@GetMapping()
	@RequiresPermissions("oa:approve:approve")
	String Approve(){
	    return "oa/approve/approve";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("oa:approve:approve")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ApproveDO> approveList = approveService.list(query);
		int total = approveService.count(query);
		PageUtils pageUtils = new PageUtils(approveList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("oa:approve:add")
	String add(){
	    return "oa/approve/add";
	}

	@GetMapping("/edit/{approveId}")
	@RequiresPermissions("oa:approve:edit")
	String edit(@PathVariable("approveId") Long approveId,Model model){
		ApproveDO approve = approveService.get(approveId);
		model.addAttribute("approve", approve);
	    return "oa/approve/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("oa:approve:add")
	public R save(ApproveDO approve){
		if(approveService.save(approve)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("oa:approve:edit")
	public R update( ApproveDO approve){
		approveService.update(approve);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("oa:approve:remove")
	public R remove( Long approveId){
		if(approveService.remove(approveId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("oa:approve:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] approveIds){
		approveService.batchRemove(approveIds);
		return R.ok();
	}
	
}
