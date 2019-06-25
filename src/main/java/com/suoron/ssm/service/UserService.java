package com.suoron.ssm.service;

import com.suoron.ssm.dao.mapping.TbUserMapper;
import com.suoron.ssm.dao.pojo.TbUser;
import com.suoron.ssm.dao.pojo.ext.PoUser;

import java.util.List;

public interface UserService {
    public List<TbUser> getUsers();
    public PoUser getUserAndComsume(Integer id);
    public Integer addUser(TbUser tbUser);
}
