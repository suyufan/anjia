package dao.impl;

import dao.BaseDao;
import dao.UserDao;
import pojo.User;

import java.util.List;

/**
 * @author Su yufan
 * @create 2020-12-31 9:27
 */
public class UserDaoImpl extends BaseDao implements UserDao {
    /**
     *
     * @param sql
     * @param args
     * @return 如果返回-1
     */
    @Override
    public int update(String sql, Object... args) {
        return super.update(sql, args);
    }

    /**
     * 查询返回一个JavaBean的sql语句
     *
     * @param type 返回的对象类型
     * @param sql
     * @param args sql对应的参数值
     * @return
     */
    @Override
    public <T> T queryForone(Class<T> type, String sql, Object... args) {
        return super.queryForone(type, sql, args);
    }

    /**
     * 查询返回一列JavaBean的sql语句
     *
     * @param type
     * @param sql
     * @param args
     * @return
     */
    @Override
    public <T> List<T> queryForList(Class<T> type, String sql, Object... args) {
        return super.queryForList(type, sql, args);
    }

    /**
     * 执行返回一行一列的sql语句
     *
     * @param sql
     * @param args
     * @return
     */
    @Override
    public Object queryForSingleValue(String sql, Object... args) {
        return super.queryForSingleValue(sql, args);
    }

    @Override
    public User queryUserByUsername(String Uuser){
        String sql = "select * from user where Uuser = ? ";
        return queryForone(User.class, sql,Uuser);
    }
    @Override
    public User queryUserByUsernameAndPassword(String Uuser, String Upassword) {
        String sql = "select * from user where Uuser = ? and Upassword = ?";
        return queryForone(User.class, sql,Uuser,Upassword);
    }

    @Override
    public int saveUser(User user) {
        String sql = "insert into user(Uuser,Uemail,Upassword) values(?,?,?)";
        return update(sql,user.getUuser(),user.getEmail(),user.getUpassword());
    }
}
