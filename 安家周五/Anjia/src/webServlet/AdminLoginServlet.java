package webServlet;

import dao.BaseDao;
import pojo.Admin;
import pojo.User;
import service.AdminService;
import service.UserService;
import service.impl.AdminServiceImpl;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Su yufan
 * @create 2020-12-31 13:44
 */
public class AdminLoginServlet extends BaseServlet {
        private AdminService adminService = new AdminServiceImpl();
        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("utf-8");
            //  1、获取请求的参数
            String Guser= req.getParameter("Guser");
            String Gpassword = req.getParameter("Gpassword");
            // 调用 userService.login()登录处理业务
            Admin loginAdmin = adminService.login(new Admin(Guser,Gpassword));
            // 如果等于null,说明登录 失败!
            if (loginAdmin == null) {
                // 把错误信息，和回显的表单项信息，保存到Request域中
                req.setAttribute("msg","用户或密码错误！");
                //   跳回登录页面
                req.getRequestDispatcher("admin_sign.jsp").forward(req, resp);
            } else {
                // 登录 成功
                //跳到成功页面
                req.getRequestDispatcher("admin_index.html").forward(req, resp);
            }
        }
    }
