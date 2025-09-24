package com.java.springboot.config;

import com.java.springboot.Interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author houlijia
 * @Date 2025-09-23 10:26
 * @Desc
 **/

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        // 不加 .addPathPatterns("/user/**") 会拦截所有请求
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/user/**");
        System.out.println("0000");
    }
}
