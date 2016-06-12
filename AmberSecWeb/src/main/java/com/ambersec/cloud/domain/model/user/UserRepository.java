package com.ambersec.cloud.domain.model.user;

/**
 * Created by pine on 2016/6/6.
 */
public interface UserRepository {

    /**
     * finds a user using given account
     * @param userAccount
     * @return
     */
    User findUserByAccount(String userAccount);
}
