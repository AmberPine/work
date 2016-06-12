package com.ambersec.cloud.infrastructure.utils;

/**
 * Created by pine on 2016/6/6.
 */
public class StringUtils extends org.springframework.util.StringUtils{

    public static boolean isNotEmpty(final Object value){
        return !isEmpty(value);
    }

    public static boolean isNotEmptys(Object...values){
        if(values == null || values.length < 1){
            return false;
        }
        int size = values.length;
        for(int i = 0; i < size; i++){
            if(isEmpty(values[i])){
                return false;
            }
        }
        return true;
    }
}
