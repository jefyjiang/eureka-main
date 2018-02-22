package com.cnipr.open.feign.consumer.consumer.vo;

/**
 * Created by Administrator on 2018/2/22.
 */
public class User {
    private static final long serialVersionUID = 1L;
    private String name;
    private Integer age;
    private String passWord;

    public User(){}

    public User(String name, Integer age, String passWord) {
        this.name = name;
        this.age = age;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
