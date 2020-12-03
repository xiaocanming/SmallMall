package com.xcm.smallmall.service.impl;

import com.xcm.smallmall.mapper.UmsResourceMapper;
import com.xcm.smallmall.model.UmsResource;
import com.xcm.smallmall.model.UmsResourceExample;
import com.xcm.smallmall.service.UmsResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @描述 后台资源管理Service实现类
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
@Service
public class UmsResourceServiceImpl  implements UmsResourceService {
    @Autowired
    private UmsResourceMapper resourceMapper;

    @Override
    public List<UmsResource> listAll() {
        return resourceMapper.selectByExample(new UmsResourceExample());
    }
}
