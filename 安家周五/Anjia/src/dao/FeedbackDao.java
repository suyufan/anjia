package dao;


import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import pojo.Feedback;
import untils.JDBCUtils1;

public class FeedbackDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils1.getDataSource());

    public void login(Feedback fd) {

        try {
            String sql = "insert into feedback  values (?,?,?,?,?,?); ";
//            Manager manager = template.queryForObject(sql, new BeanPropertyRowMapper<>(Manager.class),
//                    loginManager.getGemail(), loginManager.getGpassword());
//            return manager;
            template.update(sql,null,fd.getName(),fd.getTel(),fd.getEmail(),fd.getTheme(),fd.getContent());
            System.out.println(fd);

        } catch (DataAccessException e) {

        }


    }
}
