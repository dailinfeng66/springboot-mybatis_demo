package com.cuit.wjl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = "com.cuit.wjl.mapping")
public class WjlApplication {

    public static void main(String[] args) {
        SpringApplication.run(WjlApplication.class, args);
    }

}
