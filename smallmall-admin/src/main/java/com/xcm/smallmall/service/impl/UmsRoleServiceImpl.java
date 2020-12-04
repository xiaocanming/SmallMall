package com.xcm.smallmall.service.impl;

import com.xcm.smallmall.dao.UmsRoleDao;
import com.xcm.smallmall.model.UmsMenu;
import com.xcm.smallmall.service.UmsRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @描述 后台管理员角色实现Service
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
@Service
public class UmsRoleServiceImpl implements UmsRoleService {

    @Autowired
    private UmsRoleDao roleDao;
    @Override
    public List<UmsMenu> getMenuList(Long adminId) {
        return roleDao.getMenuList(adminId);
    }
}
