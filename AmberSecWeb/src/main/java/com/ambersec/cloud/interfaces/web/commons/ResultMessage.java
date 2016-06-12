package com.ambersec.cloud.interfaces.web.commons;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * result message object
 * Created by pine on 2016/6/6.
 */
public class ResultMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * status code
     */
    @JSONField(ordinal = 1)
    private int code;
    /**
     * main used to store error message
     */
    @JSONField(ordinal = 2)
    private String msg;
    /**
     * true：success false：fail
     */
    @JSONField(ordinal = 3)
    private Boolean success;
    /**
     * data
     */
    @JSONField(ordinal = 4)
    private Object data;

    public ResultMessage(){}
    public ResultMessage(ResultCode code, String msg, Object data) {
        super();
        this.code = code.getCode();
        this.msg = msg;
        switch (code) {
            case SUCESS:
                this.success = true;
                break;
            default:
                this.success = false;
        }
        this.data = data;
    }
    public static ResultMessage success(){
       return new ResultMessage(ResultCode.SUCESS,null,null);
    }
    public static ResultMessage failure(String message){
        return new ResultMessage(ResultCode.ERROR,message,null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "ResultMessage [code=" + code + ", data=" + data + ", msg="
                + msg + ", success=" + success + "]";
    }
}
