package com.ambersec.cloud.interfaces.web.session;

import com.ambersec.cloud.interfaces.facade.dto.UserDTO;

import java.io.Serializable;

/**
 * Created by pine on 2016/6/6.
 */
public class SessionBean implements Serializable{
    private String userId;
    private String userName;
    private String userAccount;

    public String getUserId() {
        return userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public static class Builder {
        private UserDTO user;

        public Builder(){

        }

        public Builder user(UserDTO userDto){
            this.user = userDto;
            return this;
        }

        public SessionBean build(){
            return new SessionBean(this);
        }

    }

    private SessionBean(Builder b){
        if(b != null){
            this.userId = b.user.getId();
            this.userAccount = b.user.getAccount();
            this.userName = b.user.getName();
        }
    }

}
