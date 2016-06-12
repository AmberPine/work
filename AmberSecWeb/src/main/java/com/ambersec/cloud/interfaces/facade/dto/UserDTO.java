package com.ambersec.cloud.interfaces.facade.dto;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

/**
 * Created by pine on 2016/6/6.
 */
public class UserDTO implements Serializable{
    private String id;
    @NotEmpty(message = "user.account.notEmpty")
    private String account;
    private String name;
    @NotEmpty(message = "user.password.notEmpty")
    private String password;
    private String email;
    private String phonenum;
    private String mobilephone;

    public UserDTO(){}

    public UserDTO(String id, String account,String name, String password, String email, String phonenum, String mobilephone) {
        this.id = id;
        this.account = account;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phonenum = phonenum;
        this.mobilephone = mobilephone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
