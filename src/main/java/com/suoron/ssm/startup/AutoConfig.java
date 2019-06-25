package com.suoron.ssm.startup;

import com.suoron.ssm.utils.KdniaoUtils;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;

public class AutoConfig {

    /* 商家ID */
    @Value("${kdniao.EBusinessID}")
    private String eBusinessID;

    /* 商户授权码 */
    @Value("${kdniao.AppKey}")
    private String appKey;

    /* 接口地址 */
    @Value("${kdniao.ReqURL}")
    private String reqURL;

    @PostConstruct
    public void init(){
        KdniaoUtils.setConfig(eBusinessID,appKey,reqURL);
    }
}
