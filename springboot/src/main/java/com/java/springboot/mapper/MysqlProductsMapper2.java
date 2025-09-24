package com.java.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.java.springboot.entity.Products;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author houlijia
 * @Date 2025-09-23 14:00
 * @Desc
 **/

@Mapper
public interface MysqlProductsMapper2 extends BaseMapper<Products> {

}
