package top.soft.bookonline.servlet;


import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import top.soft.bookonline.entity.User;
import top.soft.bookonline.service.UserService;
import top.soft.bookonline.service.impl.UserServicelmpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * @author Administrator
 * @description: TODO
 * @date 2024/10/26 15:48
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserService userService ;

    @Override
    public void init(ServletConfig config) throws ServletException {
        userService = new UserServicelmpl();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account = req.getParameter("account");
        String password = req.getParameter("password");

        User user = userService.signIn(account, password);
        if (user != null) {
            HttpSession session = req.getSession();
            session.setAttribute("user", user);

            resp.sendRedirect("/index");
        }else {
            resp.setContentType("text/html;charset=UTF-8");
            resp.setCharacterEncoding("UTF-8");
            resp.getWriter().write("<script>alert('账号或密码错误');location.href='/'</script>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}
