package com.ruirui.entity;

import javax.validation.constraints.Min;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {

    private final static Logger logger = LoggerFactory.getLogger(User.class);

    private String name;
    @Min(value = 18, message = "未成年人禁止入内！")
    private Integer age;

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

    public void say() {
        logger.info("我正在学习说话");
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }
}
