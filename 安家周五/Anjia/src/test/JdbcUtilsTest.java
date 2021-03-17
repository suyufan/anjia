package test;

import org.junit.Test;
import untils.JdbcUtils;

import java.sql.*;

/**
 * @author Su yufan
 * @create 2020-12-31 12:41
 */
public class JdbcUtilsTest {

        public static void main(String[] args) throws Exception{
            Connection con;
            //jdbc驱动
            String driver="com.mysql.cj.jdbc.Driver";
            //这里是我的数据库的信息
            String url="jdbc:mysql://47.105.196.73/anjia?&useSSL=false&serverTimezone=UTC";
            String user="anjia";
            String password="Anjia996";
            try {
                //注册JDBC驱动程序
                Class.forName(driver);
                //建立连接
                con = DriverManager.getConnection(url, user, password);
                //判断连接是否成功
                if (!con.isClosed()) {
                    System.out.println("数据库连接成功");
                }
                Statement statement=con.createStatement();
                String sql;
                //sql语句
                sql="select * from user";
                ResultSet resultSet=statement.executeQuery(sql);
                con.close();
            } catch (ClassNotFoundException e) {
                System.out.println("数据库驱动没有安装");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("数据库连接失败");
            }
        }
    }

