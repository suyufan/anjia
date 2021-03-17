package dao;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import pojo.Share;
import untils.JDBCUtils1;

public class SurveyDao {

    private JdbcTemplate template = new JdbcTemplate(JDBCUtils1.getDataSource());

    public void login() {

        try {
            String sql = "insert into survey values (?,?,?,?,?,?,?)";
//            Manager manager = template.queryForObject(sql, new BeanPropertyRowMapper<>(Manager.class),
//                    loginManager.getGemail(), loginManager.getGpassword());
//            return manager;
//            Share sh = new Share();
//            sh.toString();
//            String money=Share.getMoney();
//            String area=Share.getArea();
//            String county=Share.getCounty();
//            String demand=Share.getDemand();
//            String height=Share.getHeight();
//            String year=Share.getYear();
//            int count=template.update(sql,null,money,area,county,demand,height,year);
//            System.out.println(count);

        } catch (DataAccessException e) {
            e.printStackTrace();
        }


    }
}
