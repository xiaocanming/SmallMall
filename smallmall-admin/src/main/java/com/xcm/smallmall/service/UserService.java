package com.xcm.smallmall.service;

import com.xcm.smallmall.mapper.MallUserMapper;
import com.xcm.smallmall.model.MallUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private MallUserMapper userMapper;

    public MallUser getUser(long id)throws Exception {
        MallUser result=null;
        try{
            result=userMapper.selectByPrimaryKey(id);
        }catch(Exception e){
//            JshException.readFail(logger, e);
        }
        return result;
    }
}
