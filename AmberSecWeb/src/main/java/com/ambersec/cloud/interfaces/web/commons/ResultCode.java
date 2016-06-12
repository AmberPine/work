package com.ambersec.cloud.interfaces.web.commons;

/**
 * result code enum
 * Created by pine on 2016/6/6.
 */
public enum ResultCode {

    /**
     * sucess code
     */
    SUCESS(200),
    /**
     * unlogin
     */
    UN_LOGIN(101),
    /**
     * 请求参数不合法
     */
    ERROR_ILLEGAL_ARGUMENT(100),
    /**
     * 反序列化 失败
     */
    ERROR_DESERIALIZE(101),
    /**
     * 请求参数校验不通过
     */
    ERROR_CHECK_ARGUMENT(102),
    /**
     * 系统处理出错
     */
    ERROR_SYSTEM(500),

    ERROR(505);
    private int code;

    private ResultCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
