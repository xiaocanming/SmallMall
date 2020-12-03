package com.xcm.smallmall.config;
import com.xcm.smallmall.common.config.BaseSwaggerConfig;
import com.xcm.smallmall.common.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @描述 Swagger2API文档的配置
 * @创建人 xcm
 * @创建时间 2020/12/2
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {

        return SwaggerProperties.builder()
                .apiBasePackage("com.xcm.smallmall.controller") //指定扫描的包
                .title("smallmall后台系统")
                .description("smallmall后台相关接口文档")
                .contactName("xcm")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}