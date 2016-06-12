package com.ambersec.cloud.application.impl;

import com.ambersec.cloud.application.UserService;
import com.ambersec.cloud.domain.model.user.User;
import com.ambersec.cloud.domain.model.user.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by pine on 2016/6/6.
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final Logger Log = LoggerFactory.getLogger(this.getClass());

    @Resource
    private UserRepository userRepository;

    @Override
    public User getUserByAccount(String account) {
        return userRepository.findUserByAccount(account);
    }
}
