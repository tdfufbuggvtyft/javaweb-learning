package top.soft.class01servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
@WebServlet(value = "/demo3",name = "demo3")
public class servletDemo3 implements Servlet {
    public servletDemo3() {
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
        servletResponse.getWriter().write("servletDemo3    执行");
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
System.out.println("ServletDemo3初始化");
    }
}
