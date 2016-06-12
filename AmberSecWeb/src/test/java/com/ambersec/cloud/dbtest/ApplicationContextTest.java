package com.ambersec.cloud.dbtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Locale;

/**
 * this case could get the applicationContext
 * Created by pine on 2016/6/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/spring-context*.xml",
        "classpath:spring-mvc.xml" })
public class ApplicationContextTest implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    @Test
    public void testGetApplicationContext() {
        System.out.println(applicationContext.getMessage("test", new Object[]{"测试0","---s"}, Locale.CHINESE));
        System.out.println(applicationContext.getMessage("test", null, Locale.US));
    }
}
