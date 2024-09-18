package top.soft.class01servlet;

import jakarta.servlet.*;

import java.io.IOException;

public class servletDemo2 implements Servlet {
    public servletDemo2() {
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
        servletResponse.getWriter().write("servletDemo2    执行");
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
System.out.println("ServletDemo2初始化");
    }
}
