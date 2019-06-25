package com.suoron.ssm.controller;

import com.suoron.ssm.dto.LogisticsResp;
import com.suoron.ssm.service.UserService;
import com.suoron.ssm.utils.KdniaoUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 *   快递查询接口
 *
 */

@Controller
public class LogisticsController {

    @Resource
    UserService userService;

    @RequestMapping(value = "/logistics/query",method = RequestMethod.GET)
    @ResponseBody
    public LogisticsResp query(String expCode, String expNo){
       return KdniaoUtils.query(expCode,expNo);
    }

}
