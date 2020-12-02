package com.xcm.smallmall.dao;

import com.xcm.smallmall.model.UmsResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @描述 自定义后台用户与角色管理Dao
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有可访问资源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);
}