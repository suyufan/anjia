package dao.impl;

import dao.AdminDao;
import dao.BaseDao;
import pojo.Admin;

import java.util.List;

/**
 * @author Su yufan
 * @create 2020-12-31 9:27
 */
public class AdminDaoImpl extends BaseDao implements AdminDao {
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
    public Admin queryUserByUsername(String Guser){
        String sql = "select * from admin where Guser = ? ";
        return queryForone(Admin.class, sql,Guser);
    }
    @Override
    public Admin queryUserByUsernameAndPassword(String Guser, String Gpassword) {
        String sql = "select * from admin where Guser = ? and Gpassword = ?";
        return queryForone(Admin.class, sql,Guser,Gpassword);
    }

    @Override
    public int saveAdmin(Admin admin) {
        String sql = "insert into admin(Guser,Gpassword,Gemail) values(?,?,?)";
        return update(sql, admin.getGuser(),admin.getGpassword(),admin.getGemail());
    }
}
