package top.soft.class06filterlistener.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Administrator
 * @description: TODO
 * @date 2024/11/23 16:40
 */
@WebServlet("/signServlet")
public class SignServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        resp.setContentType("text/html;charset=UTF-8");
        req.getSession().setAttribute("username", username);
        resp.sendRedirect("/detail.jsp");
    }
}
