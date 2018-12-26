package com.uas.inte.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.uas.common.utils.PageUtils;
import com.uas.common.utils.R;
import com.uas.inte.domain.StudentDO;
import com.uas.inte.service.StudentService;
import com.uas.system.service.SchoolService;
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
import com.uas.common.utils.Query;

/**
 * @author cjx
 * @date 2018-11-22 14:51:15
 */
 
@Controller
@RequestMapping("inte/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	SchoolService schoolService;
	
	@GetMapping()
	@RequiresPermissions("inte:student:student")
	String Student(){
	    return "inte/student/student";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("inte:student:student")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StudentDO> studentList = studentService.list(query);
		for (StudentDO studentDO : studentList){
			String className=schoolService.get(studentDO.getSchId()).getSchName();
			studentDO.setClassName(className);
		}
		int total = studentService.count(query);
		PageUtils pageUtils = new PageUtils(studentList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("inte:student:add")
	String add(){
	    return "inte/student/add";
	}

	@GetMapping("/edit/{stuId}")
	@RequiresPermissions("inte:student:edit")
	String edit(@PathVariable("stuId") Long stuId,Model model){
		StudentDO student = studentService.get(stuId);
		String className=schoolService.get(student.getSchId()).getSchName();
		student.setClassName(className);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String stuBirthday = simpleDateFormat.format(student.getStuBirthday());
		student.setStuBirthdayStr(stuBirthday);
		model.addAttribute("student", student);
	    return "inte/student/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("inte:student:add")
	public R save(StudentDO student){
		if(studentService.save(student)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("inte:student:edit")
	public R update( StudentDO student){
		String stuBirthdayStr = student.getStuBirthdayStr();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date stuBirthdayDate = null;
		try {
			stuBirthdayDate = simpleDateFormat.parse(stuBirthdayStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		student.setStuBirthday(stuBirthdayDate);
		studentService.update(student);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("inte:student:remove")
	public R remove( Long stuId){
		if(studentService.remove(stuId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 批量删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("inte:student:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] stuIds){
		studentService.batchRemove(stuIds);
		return R.ok();
	}
	
}
