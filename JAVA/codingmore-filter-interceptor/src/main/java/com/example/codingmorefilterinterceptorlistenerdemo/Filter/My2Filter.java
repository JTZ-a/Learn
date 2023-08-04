package com.example.codingmorefilterinterceptorlistenerdemo.Filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * &#064;project: codingmore-filter-interceptor-listenerdemo
 * &#064;ClassName: My2Filter
 * &#064;author: JTZ
 * &#064;creat: 2023/8/4 23:12
 * &#064;Description:
 */
@Component
// 定义filterName 和过滤的url
@WebFilter(filterName = "my2Filter" ,urlPatterns = "/*")
public class My2Filter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter2");
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
