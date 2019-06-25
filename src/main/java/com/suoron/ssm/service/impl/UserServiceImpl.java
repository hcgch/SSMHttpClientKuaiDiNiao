package com.suoron.ssm.service.impl;

import com.suoron.ssm.dao.mapping.TbUserMapper;
import com.suoron.ssm.dao.mapping.ext.TbUserMapperExt;
import com.suoron.ssm.dao.pojo.TbUser;
import com.suoron.ssm.dao.pojo.ext.PoUser;
import com.suoron.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    TbUserMapper tbUserMapper;

    @Resource
    TbUserMapperExt tbUserMapperExt;

    @Autowired               //泛型注入
    Mapper<TbUser> mapper;

    public List<TbUser> getUsers() {
//        查询模板引擎
        Example example = new Example(TbUser.class);
        example.createCriteria()
                .andNotIn("id", Collections.singleton(1))
                .andBetween("id",5,10);
        /// criteria.andUsernameEqualTo("admin"); mybatis官方

        return mapper.selectByExample(example);

        //return tbUserMapper.selectAll();

        //return null;
        //return tbUserDao.selectByPrimaryKey(1);
    }

    @Override
    public PoUser getUserAndComsume(Integer id) {
        return tbUserMapperExt.selectComsumeByPriKey(id);
    }

    @Override
    //@Transactional
    public Integer addUser(TbUser tbUser) {

        Integer ret = tbUserMapper.insert(tbUser);
        ret = tbUserMapper.insert(tbUser);
        ret = tbUserMapper.insert(tbUser);
        ret = tbUserMapper.insert(tbUser);
        ret = tbUserMapper.insert(tbUser);
/*

        try {
            Thread.sleep(15*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
*/

        if(true){
          throw new RuntimeException("回滚测试");
        }
        return ret;
    }
}
