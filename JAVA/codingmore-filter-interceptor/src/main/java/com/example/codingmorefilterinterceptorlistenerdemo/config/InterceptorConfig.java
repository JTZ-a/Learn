package com.example.codingmorefilterinterceptorlistenerdemo.config;

import com.example.codingmorefilterinterceptorlistenerdemo.Interceptor.LoggerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * &#064;project: codingmore-filter-interceptor-listenerdemo
 * &#064;ClassName: InterceptorConfig
 * &#064;author: JTZ
 * &#064;creat: 2023/8/4 23:23
 * &#064;Description:
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoggerInterceptor()).addPathPatterns("/**");
    }
}
