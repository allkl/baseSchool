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

import com.uas.inte.domain.CurriculumDO;
import com.uas.inte.service.CurriculumService;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:28:13
 */
 
@Controller
@RequestMapping("inte/curriculum")
public class CurriculumController {
	@Autowired
	private CurriculumService curriculumService;
	
	@GetMapping()
	@RequiresPermissions("inte:curriculum:curriculum")
	String Curriculum(){
	    return "inte/curriculum/curriculum";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("inte:curriculum:curriculum")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<CurriculumDO> curriculumList = curriculumService.list(query);
		int total = curriculumService.count(query);
		PageUtils pageUtils = new PageUtils(curriculumList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("inte:curriculum:add")
	String add(){
	    return "inte/curriculum/add";
	}

	@GetMapping("/edit/{curId}")
	@RequiresPermissions("inte:curriculum:edit")
	String edit(@PathVariable("curId") Long curId,Model model){
		CurriculumDO curriculum = curriculumService.get(curId);
		model.addAttribute("curriculum", curriculum);
	    return "inte/curriculum/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("inte:curriculum:add")
	public R save(CurriculumDO curriculum){
		if(curriculumService.save(curriculum)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("inte:curriculum:edit")
	public R update( CurriculumDO curriculum){
		curriculumService.update(curriculum);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("inte:curriculum:remove")
	public R remove( Long curId){
		if(curriculumService.remove(curId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("inte:curriculum:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] curIds){
		curriculumService.batchRemove(curIds);
		return R.ok();
	}
	
}
