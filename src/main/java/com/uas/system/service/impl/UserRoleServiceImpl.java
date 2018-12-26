package com.uas.system.service.impl;

import com.uas.system.dao.UserRoleDao;
import com.uas.system.domain.UserRoleDO;
import com.uas.system.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserRoleService
 * @Description TODO
 * @Author jinxing.chen
 * @Date 2018/12/7 9:26
 * @Version 1.o
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public int save(UserRoleDO userRole) {
        return userRoleDao.save(userRole);
    }

    @Override
    public int update(UserRoleDO userRole) {
        return userRoleDao.update(userRole);
    }

    @Override
    public List<UserRoleDO> selectListByUserId(Long userId) {
        return userRoleDao.selectListByUserId(userId);
    }
}
