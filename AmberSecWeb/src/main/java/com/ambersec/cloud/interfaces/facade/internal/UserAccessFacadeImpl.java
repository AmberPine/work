package com.ambersec.cloud.interfaces.facade.internal;

import com.ambersec.cloud.application.UserService;
import com.ambersec.cloud.infrastructure.utils.StringUtils;
import com.ambersec.cloud.interfaces.facade.UserAccessFacade;
import com.ambersec.cloud.interfaces.facade.dto.UserDTO;
import com.ambersec.cloud.interfaces.facade.internal.assembler.UserAssembler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by pine on 2016/6/6.
 */
@Component
public class UserAccessFacadeImpl implements UserAccessFacade {

    @Resource
    private UserService userService;
    @Override
    public UserDTO getUserByAccount(String account) {
        if(StringUtils.isEmpty(account)){
            return null;
        }
        return UserAssembler.toUserDTO(userService.getUserByAccount(account));
    }
}
