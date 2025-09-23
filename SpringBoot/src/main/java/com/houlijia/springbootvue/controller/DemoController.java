package com.houlijia.springbootvue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author houlijia
 * @Date 2025-09-22 09:47
 * @Desc
 **/
@RestController
public class DemoController {
    //@GetMapping(value = "/hello")
    // 两个用法等价
    // http://localhost:8081/hello?name=%E5%BC%A0%E4%B8%89&phone=123
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(String name, String phone) {
        System.out.println(phone);
        return "Hello "+ name;
    }

    /*
    默认情况下，@RestController注解会将返回值直接转换为JSON格式，
    因此我们不需要再使用@ResponseBody注解
     */
    //@RequestMapping("/user")
    //public User getUser() {
    //    User user = new User();
    //    user.setName("houlijia");
    //    user.setAge(25);
    //    return user;
    //}
}
