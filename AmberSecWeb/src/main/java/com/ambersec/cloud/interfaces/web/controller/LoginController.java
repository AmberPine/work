package com.ambersec.cloud.interfaces.web.controller;

import com.ambersec.cloud.infrastructure.utils.SecretMessage;
import com.ambersec.cloud.interfaces.facade.UserAccessFacade;
import com.ambersec.cloud.interfaces.facade.dto.UserDTO;
import com.ambersec.cloud.interfaces.web.commons.Constants;
import com.ambersec.cloud.interfaces.web.commons.ResultCode;
import com.ambersec.cloud.interfaces.web.commons.ResultMessage;
import com.ambersec.cloud.interfaces.web.session.SessionBean;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.support.RequestContext;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by pine on 2016/6/6.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController extends  BaseController {

    @Resource
    private UserAccessFacade userAccessFacade;

    @RequestMapping(value = "")
    @ResponseBody
    public ResultMessage login(@Valid UserDTO userDTO,Errors errors,HttpServletRequest request,HttpSession session){
        if(errors.hasErrors()){
            return bindError(errors,request);
        }
        UserDTO user = userAccessFacade.getUserByAccount(userDTO.getAccount());
        RequestContext requestContext = new RequestContext(request);
        ResultMessage resultMessage;
        if(user != null){
            if(SecretMessage.encryptionMD532(userDTO.getPassword()).equals(user.getPassword())){
                resultMessage = ResultMessage.success();
                session.setAttribute(Constants.SESSION_KEY, new SessionBean.Builder().user(user).build());
            }else{
                resultMessage = ResultMessage.failure(requestContext.getMessage("user.passwordError"));
            }
        }else{
            resultMessage = ResultMessage.failure(requestContext.getMessage("user.notExists"));
        }
        return resultMessage;

    }
    @RequestMapping(value = "/msg")
    @ResponseBody
    public ResultMessage getLoginMsg(HttpSession session){
        return new ResultMessage(ResultCode.SUCESS,"success",session.getAttribute(Constants.SESSION_KEY));
    }

}
