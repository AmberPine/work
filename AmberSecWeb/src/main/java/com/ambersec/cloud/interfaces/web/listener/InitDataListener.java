package com.ambersec.cloud.interfaces.web.listener;

import com.ambersec.cloud.infrastructure.utils.SqlHandler;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * init some data
 * Created by pine on 2016/6/11.
 */
public class InitDataListener implements ApplicationListener {
    private static boolean isStart = false;
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if(!isStart){
            isStart = true;
            StringBuilder sb = new StringBuilder();
            sb.append("\r\n======================================================================\r\n");
            sb.append("\r\n    init System Data Start  \r\n");
            sb.append("\r\n======================================================================\r\n");
            System.out.println(sb.toString());
            //init sql data int memory
            SqlHandler.init();
            sb.append("\r\n    init System Data  End \r\n");
        }
    }
}
