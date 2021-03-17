package survey;


import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import pojo.Share;
import pojo.User;
import untils.JDBCUtils1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/surveyServlet1")
public class SurveyServlet1 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码
        req.setCharacterEncoding("utf-8");
        //2.获取请求参数
        String money = req.getParameter("cd-dropdown");
        int id = Share.buttom();
        Share.insert("money",money,id);
//        System.out.println(money);
//        Share.setMoney(money);

//        req.setAttribute("money",money);
//        req.getRequestDispatcher("surveyServlet2").forward(req,resp);
//        req.getRequestDispatcher("survey2.html").forward(req,resp);

//        resp.setStatus(302);
//        resp.sendRedirect("survey2.html");



      /*  if (Integer.parseInt(money) != -1) {
            Survey sur = new Survey();
            sur.setMoney(Integer.parseInt(money));
           *//* SurveyDao dao=new SurveyDao();
            dao.login(sur);*//*
            req.setAttribute("Survey", sur);
            req.getRequestDispatcher("survey2.html").forward(req, resp);
        } else {
            //重定向到新界面
            resp.setStatus(302);
            resp.sendRedirect("survey2.html");

        }*/

        //转发  为了共享这一片数据

        resp.setStatus(302);
        resp.sendRedirect("survey2.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

}
