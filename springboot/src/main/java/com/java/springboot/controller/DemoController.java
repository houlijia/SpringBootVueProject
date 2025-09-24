package com.java.springboot.controller;


import com.java.springboot.entity.Products;
import com.java.springboot.entity.User;
import com.java.springboot.mapper.MysqlProductsMapper;
import com.java.springboot.mapper.MysqlProductsMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author houlijia
 * @Date 2025-09-22 09:47
 * @Desc
 **/

@RestController
public class DemoController {

    //@GetMapping(value = "/hello")
    // 两个用法等价
    // http://localhost:8088/hello?name=zhangsan&phone=123456789
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(String name, String phone) {
        System.out.println(phone);
        return "Hello "+ name;
    }

    /*
    默认情况下，@RestController注解会将返回值直接转换为JSON格式，
    因此我们不需要再使用@ResponseBody注解
     */
    @GetMapping("/user")
    public User getUser() {
        User user = new User();
        user.setName("testname");
        user.setAge(25);
        return user;
    }
    // 输出: {"name":"testname","age":25}

    // mybatis 用法
    @Autowired
    private MysqlProductsMapper MysqlProductsMapper;
    @GetMapping("/querymysql")
    public List<Products> queryMysql() {
        List<Products> userlist = MysqlProductsMapper.getAll();
        System.out.println(userlist.toString());
        return userlist;
    }

    // mybatis-plugs 用法
    @Autowired
    private MysqlProductsMapper2 MysqlProductsMapper2;
    @GetMapping("/querymysql2")
    public List<Products> query2() {
        List<Products> userlist = MysqlProductsMapper2.selectList(null);
        System.out.println(userlist.toString());
        return userlist;
    }

    @PostMapping("/adddata")
    public String save(Products data){
        int i = MysqlProductsMapper2.insert(data);
        System.out.println(data);
        if(i>0){
            return "add data successfully ";
        }else {
            return "add data error ";
        }
    }
}
