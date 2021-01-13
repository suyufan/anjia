package untils;

import java.sql.*;

/**
 * @author Su yufan
 * @create 2020-11-21 17:33
 */
public class JdbcUtils {

        //jdbc驱动
        private  static String driver="com.mysql.cj.jdbc.Driver";
        //这里是我的数据库的信息
        private static String url="jdbc:mysql://47.105.196.73/anjia?&useSSL=false&serverTimezone=UTC";
        private static String user="anjia";
        private static String password="Anjia996";
    /**
     * 获取数据连接
     * @return
     */
    public static Connection getConnection() throws Exception{
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url,user,password);
        return con;
    }

    /**
     * 关闭连接
     * @param con
     */
    public static void close(Connection con,PreparedStatement ps,ResultSet rs){
        if(rs!=null){
            //关闭资源
            try{
                rs.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

        if(ps!=null){
            //关闭资源
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(con!=null){
            //关闭资源
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }



}
