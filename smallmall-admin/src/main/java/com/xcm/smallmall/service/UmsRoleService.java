package com.xcm.smallmall.service;

import com.xcm.smallmall.model.UmsMenu;

import java.util.List;

/**
 * @描述
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
public interface UmsRoleService {
    /**
     * 根据管理员ID获取对应菜单
     */
    List<UmsMenu> getMenuList(Long adminId);
}
