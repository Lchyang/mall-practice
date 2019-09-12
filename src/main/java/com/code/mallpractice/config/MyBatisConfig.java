package com.code.mallpractice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置mapper扫描路径
 */

@Configuration
@MapperScan("com.code.mallpractice.mbg.mapper")
public class MyBatisConfig {
}
