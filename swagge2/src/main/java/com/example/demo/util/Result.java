package com.example.demo.util;/**
 * @description:
 * @author: ManolinCoder
 * @time: 2022/9/26
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

/**
 *
 *@Auther 月鸟石 2022/9/26
 *联系方式(QQ)：3054578922
 *周一 
 *欢迎回家，主人
 */

@Data
@AllArgsConstructor
public class Result<T> implements Serializable {

    private Integer id;

    private String messaging;

    private T data;
}

/**
 *一切顺心
 */