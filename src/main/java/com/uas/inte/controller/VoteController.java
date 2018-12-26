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

import com.uas.inte.domain.VoteDO;
import com.uas.inte.service.VoteService;

/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:46:01
 */
 
@Controller
@RequestMapping("inte/vote")
public class VoteController {
	@Autowired
	private VoteService voteService;
	
	@GetMapping()
	@RequiresPermissions("inte:vote:vote")
	String Vote(){
	    return "inte/vote/vote";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("inte:vote:vote")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<VoteDO> voteList = voteService.list(query);
		int total = voteService.count(query);
		PageUtils pageUtils = new PageUtils(voteList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("inte:vote:add")
	String add(){
	    return "inte/vote/test";
	}

	@GetMapping("/edit/{voteId}")
	@RequiresPermissions("inte:vote:edit")
	String edit(@PathVariable("voteId") Long voteId,Model model){
		VoteDO vote = voteService.get(voteId);
		model.addAttribute("vote", vote);
	    return "inte/vote/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("inte:vote:add")
	public R save(VoteDO vote){
		if(voteService.save(vote)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("inte:vote:edit")
	public R update( VoteDO vote){
		voteService.update(vote);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("inte:vote:remove")
	public R remove( Long voteId){
		if(voteService.remove(voteId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("inte:vote:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] voteIds){
		voteService.batchRemove(voteIds);
		return R.ok();
	}
	
}
