package com.xcm.smallmall.controller;

import com.xcm.smallmall.BaseResponseInfo;
import com.xcm.smallmall.model.UmsAdmin;
import com.xcm.smallmall.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@Api(tags = "UserController", description = "用户管理")
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation("获取所有品牌列表")
    @RequestMapping(value = "/getBasicData", method = RequestMethod.GET)
    @ResponseBody
    public BaseResponseInfo getBasicData(@RequestParam(value = "KeyId") long keyId,
                                         HttpServletRequest request)throws Exception {
        BaseResponseInfo res = new BaseResponseInfo();
        try {
            UmsAdmin user = userService.getUser(keyId);
            Map<String, UmsAdmin> mapData = new HashMap<String, UmsAdmin>();
            mapData.put("user", user);
            res.code = 200;
            res.data = mapData;
        } catch (Exception e) {
            e.printStackTrace();
            res.code = 500;
            res.data = "查询权限失败";
        }
        return res;
    }
}
