package com.uas.system.service;

import com.uas.system.domain.UserRoleDO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserRoleService
 * @Description TODO
 * @Author jinxing.chen
 * @Date 2018/12/7 8:48
 * @Version 1.o
 */

public interface UserRoleService {

    int save(UserRoleDO userRole);

    int update(UserRoleDO userRole);

    List<UserRoleDO> selectListByUserId(Long userId);
}
