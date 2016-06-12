package com.ambersec.cloud.dbtest;

import com.ambersec.cloud.domain.model.user.UserRepository;
import com.ambersec.cloud.infrastructure.utils.IdGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * junit test
 * Created by pine on 2016/6/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/spring-context*.xml",
        "classpath:spring-mvc.xml" })
public class CommonRepositoryTest {

    @Resource
    private UserRepository userRepository;

    @Test
    public void testUser(){
        String account = "001";
        System.out.println(userRepository.findUserByAccount(account));
    }

    @Resource
    private IdGenerator idGen;
    @Test
    public void testMessage(){
        System.out.println(idGen.nextId());
        System.out.println(idGen.nextId());
        System.out.println(idGen.nextId());
        System.out.println(idGen.nextId());
    }
}
