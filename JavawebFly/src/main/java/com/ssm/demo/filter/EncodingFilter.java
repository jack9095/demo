package com.ssm.demo.filter;

import javax.servlet.Filter;
import javax.servlet.*;
import java.io.IOException;

/**
 * 过滤器 解决中文字符集乱码
 */
public class EncodingFilter implements Filter {
    public EncodingFilter(){
        System.out.println("过滤器构造");
    }
    public void destroy() {
        System.out.println("过滤器销毁");
    }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8"); //将编码改为utf-8
        response.setContentType("text/html;charset=utf-8");
        chain.doFilter(request, response);
    }

    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("过滤器初始化");
    }

}