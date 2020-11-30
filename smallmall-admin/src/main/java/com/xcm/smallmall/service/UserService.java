package com.xcm.smallmall.service;

import com.xcm.smallmall.mapper.UmsAdminMapper;
import com.xcm.smallmall.model.UmsAdmin;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UmsAdminMapper adminMapper;

    public UmsAdmin getUser(long id)throws Exception {
        UmsAdmin result=null;
        try{
            result=adminMapper.selectByPrimaryKey(id);
        }catch(Exception e){
//            JshException.readFail(logger, e);
        }
        return result;
    }
}
