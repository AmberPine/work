package com.ambersec.cloud.interfaces.web.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by pine on 2016/6/5.
 */
public class MyExceptionHandler implements HandlerExceptionResolver{

    private final static Logger Log = LoggerFactory.getLogger(MyExceptionHandler.class.getSimpleName());

    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        return null;
    }
}
