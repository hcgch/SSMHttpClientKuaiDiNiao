package com.suoron.ssm.utils;

import com.alibaba.fastjson.JSONObject;
import com.suoron.ssm.dto.LogisticsResp;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * 快递鸟物流轨迹即时查询接口
 *
 * @技术QQ群: 456320272
 * @see: http://www.kdniao.com/YundanChaxunAPI.aspx
 * @copyright: 深圳市快金数据技术服务有限公司
 *
 * DEMO中的电商ID与私钥仅限测试使用，正式环境请单独注册账号
 * 单日超过500单查询量，建议接入我方物流轨迹订阅推送接口
 *
 * ID和Key请到官网申请：http://www.kdniao.com/ServiceApply.aspx
 */

public class KdniaoUtils {

    public static void setConfig(String EBusinessID,String AppKey,String ReqURL){
        KdniaoUtils.EBusinessID = EBusinessID;
        KdniaoUtils.AppKey = AppKey;
        KdniaoUtils.ReqURL = ReqURL;
    }

    public static LogisticsResp query(String expCode, String expNo) {
        KdniaoUtils api = new KdniaoUtils();
        try {
            //物流公司编码、快递单号
            String result = api.getOrderTracesByJson(expCode, expNo);
            LogisticsResp logisticsResp = JSONObject.parseObject(result,LogisticsResp.class);
            System.out.print(result);
            return logisticsResp;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //电商ID
    private static String EBusinessID;
    //电商加密私钥，快递鸟提供，注意保管，不要泄漏
    private static String AppKey;
    //请求url
    private static String ReqURL;
    //测试环境
    //private String ReqURL="http://testapi.kdniao.com/Ebusiness/EbusinessOrderHandle.aspx";

    /**
     * Json方式 查询订单物流轨迹
     * @throws Exception
     */
    public static String getOrderTracesByJson(String expCode, String expNo) throws Exception{
        String requestData= "{'OrderCode':'','ShipperCode':'" + expCode + "','LogisticCode':'" + expNo + "'}";

        Map<String, String> params = new HashMap<String, String>();
        params.put("RequestData", urlEncoder(requestData, "UTF-8"));
        params.put("EBusinessID", EBusinessID);
        params.put("RequestType", "1002");
        String dataSign=encrypt(requestData, AppKey, "UTF-8");
        params.put("DataSign", urlEncoder(dataSign, "UTF-8"));
        params.put("DataType", "2");

        //String result=sendPost(ReqURL, params);
        String result = HttpUtils.sendPost(ReqURL,params);

        //根据公司业务处理返回的信息......

        return result;
    }

    /**
     * base64编码
     * @param str 内容
     * @param charset 编码方式
     * @throws UnsupportedEncodingException
     */
    private static String base64(String str, String charset) throws UnsupportedEncodingException{
        String encoded = Base64Util.base64Encode(str.getBytes(charset));
        return encoded;
    }

    @SuppressWarnings("unused")
    private static String urlEncoder(String str, String charset) throws UnsupportedEncodingException{
        String result = URLEncoder.encode(str, charset);
        return result;
    }

    /**
     * 电商Sign签名生成
     * @param content 内容
     * @param keyValue Appkey
     * @param charset 编码方式
     * @throws UnsupportedEncodingException ,Exception
     * @return DataSign签名
     */
    @SuppressWarnings("unused")
    private static String encrypt (String content, String keyValue, String charset) throws UnsupportedEncodingException, Exception
    {
        if (keyValue != null)
        {
            return base64(MD5Util.MD5(content + keyValue, charset), charset);
        }
        return base64(MD5Util.MD5(content, charset), charset);
    }

}
