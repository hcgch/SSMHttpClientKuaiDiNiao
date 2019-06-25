package com.suoron.ssm.dao.pojo.ext;

import com.suoron.ssm.dao.pojo.TbUser;

public class PoUser extends TbUser {

    /* 消费总金额 */
    private Integer totalConsume;

    public Integer getTotalConsume() {
        return totalConsume;
    }

    public void setTotalConsume(Integer totalConsume) {
        this.totalConsume = totalConsume;
    }
}
