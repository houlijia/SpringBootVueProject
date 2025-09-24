package com.java.springboot.entity;

import java.util.Date;

/**
 * @Author houlijia
 * @Date 2025-09-24 20:55
 * @Desc
 **/
public class Students {
    private int id;
    private String name;
    private String gender;
    private String birthdate;
    private String enroll_time;
    private int class_id;
    private int score;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getEnroll_time() {
        return enroll_time;
    }

    public void setEnroll_time(String enroll_time) {
        this.enroll_time = enroll_time;
    }

    public int getClass_id() {
        return class_id;
    }

    public void setClass_id(int class_id) {
        this.class_id = class_id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", enroll_time='" + enroll_time + '\'' +
                ", class_id=" + class_id +
                ", score=" + score +
                '}';
    }
}
