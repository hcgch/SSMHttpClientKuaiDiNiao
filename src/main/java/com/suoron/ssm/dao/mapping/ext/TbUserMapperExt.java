package com.suoron.ssm.dao.mapping.ext;

import com.suoron.ssm.dao.mapping.TbUserMapper;
import com.suoron.ssm.dao.pojo.TbUser;
import com.suoron.ssm.dao.pojo.ext.PoUser;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface TbUserMapperExt extends Mapper<PoUser> {
    /* 用户信息+消费总金额 */
    PoUser selectComsumeByPriKey(Integer id);
}
