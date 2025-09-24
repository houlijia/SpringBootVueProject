package com.java.springboot.Interceptor;


import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author houlijia
 * @Date 2025-09-23 10:15
 * @Desc
 **/
public class LoginInterceptor implements HandlerInterceptor {
    //@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){
        System.out.println("HandlerInterceptor");
        return true;
    }
}
