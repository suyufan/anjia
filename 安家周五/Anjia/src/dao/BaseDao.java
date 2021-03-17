package dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import untils.JdbcUtils;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Su yufan
 * @create 2020-11-21 18:38
 */
public abstract class BaseDao {


    //使用DbUtils操作数据库
    private QueryRunner queryRunner = new QueryRunner();

    /**
     * @param sql
     * @param args
     * @return 如果返回-1
     */
    public int update(String sql,Object...args){
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            return queryRunner.update(connection,sql,args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    /**
     * 查询返回一个JavaBean的sql语句
     * @param type 返回的对象类型
     * @param sql
     * @param args sql对应的参数值
     * @param <T> 返回的类型的泛型
     * @return
     */
    public <T> T queryForone(Class<T> type ,String sql,Object...args){
        Connection con = null;
        try {
            con = JdbcUtils.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            return queryRunner.query(con,sql,new BeanHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 查询返回一列JavaBean的sql语句
     * @param type
     * @param sql
     * @param args
     * @param <T>
     * @return
     */
    public <T>List<T> queryForList(Class<T> type ,String sql,Object...args){
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            return queryRunner.query(connection,sql, new BeanListHandler<T>(type),args);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * 执行返回一行一列的sql语句
     * @param sql
     * @param args
     * @return
     */
    public Object queryForSingleValue(String sql,Object...args){
        Connection connection = null;
        try {
            connection = JdbcUtils.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            queryRunner.query(connection,sql,new ScalarHandler(),args);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
