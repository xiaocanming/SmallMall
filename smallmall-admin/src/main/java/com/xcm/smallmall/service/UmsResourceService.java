package com.xcm.smallmall.service;

import com.xcm.smallmall.model.UmsResource;

import java.util.List;

/**
 * @描述 后台资源管理Service
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
public interface UmsResourceService {
    /**
     * 查询全部资源
     */
    List<UmsResource> listAll();
}
