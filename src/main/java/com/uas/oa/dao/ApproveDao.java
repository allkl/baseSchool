package com.uas.oa.dao;

import java.util.List;
import java.util.Map;

import com.uas.oa.domain.ApproveDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author kl
 * @email kl@163.com
 * @date 2018-12-09 17:28:34
 */
@Mapper
public interface ApproveDao {

	ApproveDO get(Long approveId);
	
	List<ApproveDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ApproveDO approve);
	
	int update(ApproveDO approve);
	
	int remove(Long approve_id);
	
	int batchRemove(Long[] approveIds);
}
