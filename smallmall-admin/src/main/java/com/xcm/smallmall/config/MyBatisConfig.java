package com.xcm.smallmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * Created by macro on 2019/4/8.
 */
@Configuration
@ServletComponentScan
@MapperScan(basePackages = {"com.xcm.smallmall.mapper","com.xcm.smallmall.dao"})
public class MyBatisConfig {

}
