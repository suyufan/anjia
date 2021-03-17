package webServlet;

import pojo.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Su yufan
 * @create 2020-12-31 10:08
 */

public class RegistServlet extends HttpServlet {

        private UserService userService = new UserServiceImpl();

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("utf-8");
            //  1、获取请求的参数
            String Uuser = req.getParameter("name");
            String Upassword = req.getParameter("password");
            String Uemail = req.getParameter("email");
//            String code = req.getParameter("code");


//        2、检查 验证码是否正确  === 写死,要求验证码为:abcde
//            if ("abcde".equalsIgnoreCase(code)) {
//        3、检查 用户名是否可用
                if (userService.existsUsername(Uuser)) {
                    System.out.println("用户名[" + Uuser + "]已存在!");

                    // 把回显信息，保存到Request域中
                    req.setAttribute("msg", "用户名已存在！！");
                    req.setAttribute("name", Uuser);
                    req.setAttribute("email", Uemail);

//        跳回注册页面
                    req.getRequestDispatcher("register.jsp").forward(req, resp);
                } else {
                    //      可用
//                调用Sservice保存到数据库
                    userService.registUser(new User(Uuser,Upassword,Uemail));
//
//        跳到注册成功页面 regist_success.jsp
                    req.getRequestDispatcher("sign.jsp").forward(req, resp);
                }
//            } else {
//                // 把回显信息，保存到Request域中
//                req.setAttribute("msg", "验证码错误！！");
//                req.setAttribute("Uuser", Uuser);
////                req.setAttribute("email", email);
//
//                System.out.println("验证码[" + code + "]错误");
//                req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
            }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }
}

