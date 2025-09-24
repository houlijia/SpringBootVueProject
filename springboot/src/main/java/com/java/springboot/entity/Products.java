package com.java.springboot.entity;

import java.math.BigInteger;

/**
 * @Author houlijia
 * @Date 2025-09-24 15:23
 * @Desc
 **/
public class Products {
    private String name;
    private BigInteger age;
    private BigInteger height;
    private BigInteger weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getAge() {
        return age;
    }

    public void setAge(BigInteger age) {
        this.age = age;
    }

    public BigInteger getHeight() {
        return height;
    }

    public void setHeight(BigInteger height) {
        this.height = height;
    }

    public BigInteger getWeight() {
        return weight;
    }

    public void setWeight(BigInteger weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MysqlUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
