package com.java.springboot.mapper;

import com.java.springboot.entity.Products;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//import org.apache.ibatis.annotations.Select;
/**
 * @Author houlijia
 * @Date 2025-09-23 14:00
 * @Desc
 **/

@Mapper
public interface MysqlProductsMapper {
    //int add(User user);
    //int deleted();
    //int selectById();
    @Select("select * from products")
    List<Products> getAll();
}

