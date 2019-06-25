package com.suoron.ssm.controller;

import com.suoron.ssm.dao.pojo.TbUser;
import com.suoron.ssm.dao.pojo.ext.PoUser;
import com.suoron.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TestController {

    @Resource
    UserService userService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public PoUser test(){
       PoUser poUser = userService.getUserAndComsume(1);
       return poUser;
    }

    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    @ResponseBody
    public List<TbUser> test1(){
        return userService.getUsers();
    }

    /**
     *  测试添加用户
     *
     */
    @RequestMapping(value = "/user/add",method = RequestMethod.GET)
    @ResponseBody
    public Integer addUser(){
        TbUser tbUser = new TbUser();

        tbUser.setUsername("suoronx");
        tbUser.setPassword("123456");

        return userService.addUser(tbUser);
    }
}
