package com.uas.inte.dao;


import java.util.List;
import java.util.Map;

import com.uas.inte.domain.StudentDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:51:15
 */
@Mapper
public interface StudentDao {

	StudentDO get(Long stuId);
	
	List<StudentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StudentDO student);
	
	int update(StudentDO student);
	
	int remove(Long stu_id);
	
	int batchRemove(Long[] stuIds);

	List<StudentDO> stuNameList();
}
