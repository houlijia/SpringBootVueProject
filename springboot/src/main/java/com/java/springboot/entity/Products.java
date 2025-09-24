package com.java.springboot.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigInteger;

/**
 * @Author houlijia
 * @Date 2025-09-24 15:23
 * @Desc
 **/
// 如果表名和class名不一致的话
@TableName("products")
public class Products {
    //加上之后，插入数据之后，会自带上id
    @TableId(type= IdType.AUTO)
    private int id;
    // 如果表里面叫nickname，传入字段是name，使用@TableField做映射
    //@TableField("nickname")
    private String name;
    private int age;
    private int height;
    private int weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
