package prac.filter.filter;

import javax.servlet.*;
import java.io.IOException;

public class SecoundFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("SecoundFilter 생성됨");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("======= Secound 필터 시작 =======");
        chain.doFilter(request,response);
        System.out.println("======= Secound 필터 종료 =======");
    }

    @Override
    public void destroy() {
        System.out.println("SecoundFilter Destroy");
        Filter.super.destroy();
    }
}
