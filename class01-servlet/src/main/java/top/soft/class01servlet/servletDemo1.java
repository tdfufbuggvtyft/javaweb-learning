package top.soft.class01servlet;

import jakarta.servlet.*;

import java.io.IOException;

public class servletDemo1 implements Servlet {
    public servletDemo1() {
        super();
    }

    @Override
    public void destroy() {
System.out.println("销毁方法");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().write("servletDemo1    执行");
System.out.println("service执行");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * Servlet初始化
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
System.out.println("ServletDomo1初始化");
    }
}
