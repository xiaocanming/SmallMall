package com.xcm.smallmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan(basePackages = {"com.xcm.smallmall.mapper"})
@EnableScheduling
public class SmallmallApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmallmallApplication.class, args);
    }
}
