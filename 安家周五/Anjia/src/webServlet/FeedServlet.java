package webServlet;



import dao.FeedbackDao;
import pojo.Feedback;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/*
* 实现反馈信息的封装和数据库存储
*
* */

@WebServlet("/feedbackServlet")
public class FeedServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码
        req.setCharacterEncoding("utf-8");
        //2.获取请求参数
        String name = req.getParameter("Name");
        String email = req.getParameter("Email");
        String tel = req.getParameter("Telephone");
        String theme = req.getParameter("Subject");
        String content = req.getParameter("Message");


        Feedback fd = new Feedback();
        fd.setName(name);
        fd.setEmail(email);
        fd.setContent(content);
        fd.setTel(tel);
        fd.setTheme(theme);


//        System.out.println(password);


        FeedbackDao dao=new FeedbackDao();
        dao.login(fd);


        resp.setStatus(302);
        resp.sendRedirect("index_bak.html");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }
}
