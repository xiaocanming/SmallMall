package com.xcm.smallmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @描述 MyBatis相关配置
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
@Configuration
@ServletComponentScan
@MapperScan(basePackages = {"com.xcm.smallmall.mapper","com.xcm.smallmall.dao"})
public class MyBatisConfig {

}
