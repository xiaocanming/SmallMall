package com.xcm.smallmall.dao;

import com.xcm.smallmall.model.UmsMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @描述
 * @创建人 xcm
 * @创建时间 2020/12/3
 */
public interface UmsRoleDao {
    /**
     * 根据后台用户ID获取菜单
     */
    List<UmsMenu> getMenuList(@Param("adminId") Long adminId);
}
