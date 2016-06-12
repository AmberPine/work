package com.ambersec.cloud.interfaces.facade.internal.assembler;

import com.ambersec.cloud.domain.model.user.User;
import com.ambersec.cloud.interfaces.facade.dto.UserDTO;

/**
 * assembler
 * Created by pine on 2016/6/6.
 */
public class UserAssembler {

    public static UserDTO toUserDTO(User user){
        if(user == null){
            return null;
        }
        UserDTO userDTO = new UserDTO(user.getId(),user.getAccount(),user.getName(),user.getPassword(),user.getEmail(),
                user.getPhonenum(),user.getMobilephone());
        return userDTO;
    }
}
