package com.xcm.smallmall.common.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;

/**
 * @描述 Redis配置类
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
@EnableCaching
@Configuration
public class RedisConfig extends BaseRedisConfig{
}
