package com.xcm.smallmall.security.component;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * @描述 动态权限相关业务类
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
public interface DynamicSecurityService {
    /**
     * 加载资源ANT通配符和资源对应MAP
     */
    Map<String, ConfigAttribute> loadDataSource();
}
