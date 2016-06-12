package com.ambersec.cloud.infrastructure.utils;

import com.alibaba.druid.filter.config.ConfigTools;

/**
 * this util is main use encrypt password for druid
 * Created by pine on 2016/6/6.
 */
public class EncryptUtil {
    static String encrypt(String text) throws Exception {
        if (text == null) {
            throw new Exception("plaintext is null");
        }
        return ConfigTools.encrypt(text);
    }

    static String decrypt(String ciphertext) throws Exception {
        if (ciphertext == null) {
            throw new Exception("ciphertext is null");
        }
        return ConfigTools.decrypt(ciphertext);
    }

    public static void main(String[] a){
        try {
            System.out.println(EncryptUtil.encrypt("root"));

            System.out.print(EncryptUtil.decrypt("bNVOqb7WKLX5Bjnw+LMv92taj25KOxDimXxILPQjw42wgv+1lHzOH8kr97xDwWdhpY67QuYCS7sWN4W46YbkFA=="));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
