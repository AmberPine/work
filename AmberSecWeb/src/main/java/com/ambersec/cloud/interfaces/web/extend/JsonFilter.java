package com.ambersec.cloud.interfaces.web.extend;

import com.alibaba.fastjson.serializer.ValueFilter;

/**
 * Created by pine on 2016/6/6.
 */
public class JsonFilter implements ValueFilter {
    @Override
    public Object process(Object object, String name, Object value) {
//        if(value instanceof String) {
//            return value;
//        }
        return value;
    }

}
