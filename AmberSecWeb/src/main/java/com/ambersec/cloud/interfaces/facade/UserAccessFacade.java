package com.ambersec.cloud.interfaces.facade;

import com.ambersec.cloud.interfaces.facade.dto.UserDTO;

/**
 * the facade for user information
 * Created by pine on 2016/6/6.
 */
public interface UserAccessFacade {

    /**
     * get userDTO by account message
     * @param account
     * @return
     */
    UserDTO getUserByAccount(String account);
}
