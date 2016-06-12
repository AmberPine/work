package com.ambersec.cloud.infrastructure.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * encrypt decrypt
 * Created by pine on 2016/6/6.
 */
public class SecretMessage {
    /**
     * MD5 encrypt 32bit
     * @param plainText
     * @return
     */
    public static String encryptionMD532(String plainText) {
        String re_md5 = new String();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }

            re_md5 = buf.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return re_md5;
    }

    public static void main(String[] args) {
        System.out.println(SecretMessage.encryptionMD532("123456"));
    }
}
