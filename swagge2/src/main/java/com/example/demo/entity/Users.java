package com.example.demo.entity;/**
 * @description:
 * @author: ManolinCoder
 * @time: 2022/9/26
 */

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

/**
 *
 *@Auther 月鸟石 2022/9/26
 *联系方式(QQ)：3054578922
 *周一 
 *欢迎回家，主人
 */

@Data
@AllArgsConstructor
public class Users {


    private Integer id;

    private String name;

    @JsonIgnore
    private String password;

    private Map<String,Object> hobbies;

    @JsonIgnore
    private Integer is_delete;
}

/**
 *一切顺心
 */