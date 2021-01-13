package webServlet;

import pojo.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends BaseServlet {
    private UserService userService = new UserServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //  1、获取请求的参数
        String Uuser= req.getParameter("Uuser");
        String Upassword = req.getParameter("Upassword");
        // 调用 userService.login()登录处理业务
        User loginUser = userService.login(new User(Uuser,Upassword,null));
        // 如果等于null,说明登录 失败!
        if (loginUser == null) {
            // 把错误信息，和回显的表单项信息，保存到Request域中
          req.setAttribute("msg","用户或密码错误！");
          req.setAttribute("Uuser", Uuser);
            //   跳回登录页面
            req.getRequestDispatcher("sign.jsp").forward(req, resp);
        } else {
            // 登录 成功
            //跳到成功页面login_success.html
            resp.setStatus(302);
            resp.sendRedirect("index_bak.html");
        }
    }
}
