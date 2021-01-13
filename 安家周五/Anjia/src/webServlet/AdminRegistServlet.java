package webServlet;

import pojo.Admin;
import pojo.User;
import service.AdminService;
import service.impl.AdminServiceImpl;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Su yufan
 * @create 2021-01-02 12:17
 */
public class AdminRegistServlet extends HttpServlet {
    private AdminService adminService = new AdminServiceImpl();

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("utf-8");
            //  1、获取请求的参数
            String Guser = req.getParameter("name");
            String Gpassword = req.getParameter("password");
            String Gemail = req.getParameter("email");
//            String code = req.getParameter("code");


//        2、检查 验证码是否正确  === 写死,要求验证码为:abcde
//            if ("abcde".equalsIgnoreCase(code)) {
//        3、检查 用户名是否可用
            if (adminService.existsAdminname(Guser)) {
                System.out.println("用户名[" + Guser + "]已存在!");

                // 把回显信息，保存到Request域中
                req.setAttribute("msg", "用户名已存在！！");
                req.setAttribute("name", Guser);
                req.setAttribute("email", Gemail);

//        跳回注册页面
                req.getRequestDispatcher("register.jsp").forward(req, resp);
            } else {
                //      可用
//                调用Sservice保存到数据库
                adminService.registAdmin(new Admin(Guser,Gpassword,Gemail));
//
//        跳到注册成功页面
                req.getRequestDispatcher("admin_sign.jsp").forward(req, resp);
            }
//            } else {
//                // 把回显信息，保存到Request域中
//                req.setAttribute("msg", "验证码错误！！");
//                req.setAttribute("Guser", Guser);
////                req.setAttribute("email", email);
//
//                System.out.println("验证码[" + code + "]错误");
//                req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
        }
    }