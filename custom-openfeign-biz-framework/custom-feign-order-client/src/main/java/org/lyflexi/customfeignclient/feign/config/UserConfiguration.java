package org.lyflexi.customfeignclient.feign.config;

import org.lyflexi.customfeignclient.feign.interceptor.UserInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: lyflexi
 * @project: debuginfo_jdkToFramework
 * @Date: 2024/7/27 14:12
 */
@Configuration
public class UserConfiguration {
    @Bean
    public UserInterceptor userInterceptor(){
        return new UserInterceptor();
    }
}