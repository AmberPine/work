package com.ambersec.cloud.dbtest;

import com.alibaba.fastjson.JSON;
import com.ambersec.cloud.interfaces.web.commons.ResultMessage;
import com.ambersec.cloud.interfaces.web.extend.JsonFilter;

/**
 * Created by pine on 2016/6/6.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(JSON.toJSONString(ResultMessage.failure("ces"),new JsonFilter()));
    }
}
