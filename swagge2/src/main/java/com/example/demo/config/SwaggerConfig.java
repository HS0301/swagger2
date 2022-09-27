package com.example.demo.config;/**
 * @description:
 * @author: ManolinCoder
 * @time: 2022/9/26
 */

import com.google.common.base.Predicates;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.mapstruct.BeanMapping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 *@Auther 月鸟石 2022/9/26
 *联系方式(QQ)：3054578922
 *周一 
 *欢迎回家，主人
 */

@EnableSwagger2
@Configuration
public class SwaggerConfig {


    @Bean
    public Docket adminApiConfig() {
        return new Docket(DocumentationType.SWAGGER_2).
                groupName("adminApi").
                apiInfo(adminApiIno())/*.
                select().
                paths(Predicates.and(PathSelectors.regex("/"))).build()*/;
    }

    private ApiInfo adminApiIno() {
        return new ApiInfoBuilder().
                title("金融后台管理系统-API文档").
                description("本文档描述实训金融平台系统接口").
                version("1.0").
                contact(new Contact("月石鸟","https://csdn.net","3054@qq.com")).
                build();
    }
}

/**
 *一切顺心
 */