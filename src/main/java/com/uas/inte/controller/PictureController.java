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

import com.uas.inte.domain.PictureDO;
import com.uas.inte.service.PictureService;


/**
 * 
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:40:30
 */
 
@Controller
@RequestMapping("inte/picture")
public class PictureController {
	@Autowired
	private PictureService pictureService;
	
	@GetMapping("/picture")
	@RequiresPermissions("inte:picture:picture")
	String Picture(){
	    return "inte/picture/picture";
	}

	@GetMapping("/video")
	@RequiresPermissions("inte:picture:picture")
	String Video(){
		return "inte/picture/video";
	}

	@ResponseBody
	@GetMapping("/pictureList")
	@RequiresPermissions("inte:picture:picture")
	public PageUtils pictureList(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<PictureDO> pictureList = pictureService.pictureList(query);
		int total = pictureService.count(query);
		PageUtils pageUtils = new PageUtils(pictureList, total);
		return pageUtils;
	}

	@ResponseBody
	@GetMapping("/videoList")
	@RequiresPermissions("inte:picture:picture")
	public PageUtils videoList(@RequestParam Map<String, Object> params){
		//查询列表数据
		Query query = new Query(params);
		List<PictureDO> pictureList = pictureService.videoList(query);
		int total = pictureService.count(query);
		PageUtils pageUtils = new PageUtils(pictureList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("inte:picture:add")
	String add(){
	    return "inte/picture/add";
	}

	@GetMapping("/edit/{picId}")
	@RequiresPermissions("inte:picture:edit")
	String edit(@PathVariable("picId") Long picId,Model model){
		PictureDO picture = pictureService.get(picId);
		model.addAttribute("picture", picture);
	    return "inte/picture/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("inte:picture:add")
	public R save(PictureDO picture){
		if(pictureService.save(picture)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("inte:picture:edit")
	public R update( PictureDO picture){
		pictureService.update(picture);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("inte:picture:remove")
	public R remove( Long picId){
		if(pictureService.remove(picId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("inte:picture:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] picIds){
		pictureService.batchRemove(picIds);
		return R.ok();
	}
	
}
