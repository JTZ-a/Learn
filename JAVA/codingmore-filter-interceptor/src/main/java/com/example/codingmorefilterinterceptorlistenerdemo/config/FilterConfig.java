package com.example.codingmorefilterinterceptorlistenerdemo.config;

import com.example.codingmorefilterinterceptorlistenerdemo.Filter.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * &#064;project: codingmore-filter-interceptor-listenerdemo
 * &#064;ClassName: FilterConfig
 * &#064;author: JTZ
 * &#064;creat: 2023/8/4 23:10
 * &#064;Description:
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean registrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
