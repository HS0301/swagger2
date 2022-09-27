package com.example.demo.controller;/**
 * @description:
 * @author: ManolinCoder
 * @time: 2022/9/26
 */

import com.example.demo.entity.Users;
import com.example.demo.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 *@Auther 月鸟石 2022/9/26
 *联系方式(QQ)：3054578922
 *周一 
 *欢迎回家，主人
 */
@RestController
@Api("test controller")
@RequestMapping("test")
public class MyController {


    @RequestMapping("test")
    @ApiOperation("api operation")
    public Result<String> test() {
        System.out.println("执行");
        return new Result<String>(
                200,
                "success",
                "test result"
        );
    }

    @RequestMapping("test01")
    @ApiOperation("api operation test01")
    public Result<List<Users>> test01() {
        System.out.println("执行");
        List<Users> list = new ArrayList<Users>();
        for (int i = 0; i < 5;i++) {
            Map<String,Object> map = new HashMap<>();
            map.put("hobby" + i,"test1");
            map.put("hobby" + 10 + i,"test2");
            Users user = new Users(
                    i,
                    "lpl",
                    "123",
                    map,
                    0
            );
            list.add(user);
        }
        return new Result<List<Users>>(
                1,
                "success",
                list
        );
    }
}

/**
 *一切顺心
 */