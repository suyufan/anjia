package survey;


import org.junit.Test;
import pojo.Share;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Map;


@WebServlet("/surveyServlet6")
public class SurveyServlet6 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置编码
        req.setCharacterEncoding("utf-8");
        //2.获取请求参数
        String year = req.getParameter("cd-dropdown");
        Share.insertNULL();
        int id = Share.buttom();
        id-=1;
        Share.insert("year",year,id);
        Map map = Share.get(id);
        int a = 0,b=0,c=0,d=0;
        if (map.get("area")==null || map.get("year")==null){
            a=50;
            b=200;
            c=2000;
            d=2020;
        }else
        {
            int area = Integer.parseInt(map.get("area").toString());
            if (area!=-1){
                if (area==1){
                    a=50;
                    b=90;
                } else if (area == 2) {
                    a=90;
                    b=120;
                } else if (area == 3) {
                    a = 120;
                    b = 200;
                } else if(area==4){
                    a=130;
                    b=300;
                }
            }else {
                a=50;
                b=300;
            }


            int y = Integer.parseInt(map.get("year").toString());

            System.out.println(area+"  "+y);
            if (y!=-1){
                if (y==1){
                    c=2000;
                    d=2010;

                } else if (y == 2) {
                    c=2010;
                    d=2013;
                } else if (y == 3) {
                    c=2013;
                    d=2016;
                }else if(y==4){
                    c=2016;
                    d=2020;
                }
            }else {
                c=2000;
                d=2020;
            }

            System.out.println(a+"\t"+b+"\t"+c+"\t"+d+"\t");
        }

        List show = Share.show1(a, b, c, d);


        HttpSession session = req.getSession();
        session.setAttribute("list",show);


        resp.setStatus(302);
        resp.sendRedirect("show.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
    @Test
    public void Test(){
        Share sh = new Share();
        System.out.println(sh);
    }
}