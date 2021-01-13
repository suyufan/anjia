package dao;

import pojo.User;

/**
 * @author Su yufan
 * @create 2020-12-31 9:20
 */
public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param Uuser 用户名
     * @return 如果返回null,说明没有这个用户。反之亦然
     */
    public User queryUserByUsername(String Uuser);
    /**
     * 根据 用户名和密码查询用户信息
     * @param Uuser
     * @param Upassword
     * @return 如果返回null,说明用户名或密码错误,反之亦然
     */
    public User queryUserByUsernameAndPassword(String Uuser, String Upassword);

    /**
     * 保存用户信息
     * @param user
     * @return 返回-1表示操作失败，其他是sql语句影响的行数
     */
    public int saveUser(User user);


}
