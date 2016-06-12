package com.ambersec.cloud.interfaces.web.controller;

import com.ambersec.cloud.interfaces.web.commons.ResultMessage;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by pine on 2016/6/8.
 */
public abstract class BaseController {

    protected ResultMessage bindError(Errors errors,HttpServletRequest request){
        List<FieldError> fieldErrorList = errors.getFieldErrors();
        List<ObjectError> objectErrors =  errors.getAllErrors();
        StringBuilder sb = new StringBuilder();
        if(fieldErrorList != null && fieldErrorList.size() > 0){
            RequestContext requestContext = new RequestContext(request);
            for(FieldError fieldError : fieldErrorList){
                if(sb.length() > 0){
                    sb.append(",");
                }
                String code = fieldError.getCode();
                sb.append(requestContext.getMessage(fieldError.getDefaultMessage()));
            }
        }
       return ResultMessage.failure(sb.toString());
    }
}
