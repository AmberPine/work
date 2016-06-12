package com.ambersec.cloud.application;

import com.ambersec.cloud.domain.model.user.User;

/**
 * user service
 * Created by pine on 2016/6/6.
 */
public interface UserService {
    /**
     * get a user message by account
     * @param account
     * @return
     */
    User getUserByAccount(String account);
}
