package com.example.codingmorefilterinterceptorlistenerdemo.Filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * &#064;project: codingmore-filter-interceptor-listenerdemo
 * &#064;ClassName: MyFilter
 * &#064;author: JTZ
 * &#064;creat: 2023/8/4 23:08
 * &#064;Description:
 */
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化方法");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // do something 处理request 或response
        System.out.println("filter1");
        // 调用filter链中的下一个filter
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }
}
