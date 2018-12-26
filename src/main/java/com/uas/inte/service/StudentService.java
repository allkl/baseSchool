package com.uas.inte.service;



import com.uas.inte.domain.StudentDO;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.List;

/**
 * 
 * 
 * @author cjx
 * @date 2018-11-22 14:51:15
 */

public interface StudentService {
	
	StudentDO get(Long stuId);
	
	List<StudentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(StudentDO student);
	
	int update(StudentDO student);
	
	int remove(Long stuId);
	
	int batchRemove(Long[] stuIds);

	List<StudentDO> stuNameList();
}
