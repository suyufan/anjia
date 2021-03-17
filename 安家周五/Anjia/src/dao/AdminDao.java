package dao;

import pojo.Admin;
import pojo.User;

/**
 * @author Su yufan
 * @create 2020-12-31 9:19
 */
public interface AdminDao {
    /**
     * 根据用户名查询用户信息
     * @param Guser 用户名
     * @return 如果返回null,说明没有这个用户。反之亦然
     */
    public Admin queryUserByUsername(String Guser);
    /**
     * 根据 用户名和密码查询用户信息
     * @param Guser
     * @param Gpassword
     * @return 如果返回null,说明用户名或密码错误,反之亦然
     */
    public Admin queryUserByUsernameAndPassword(String Guser, String Gpassword);

    /**
     * 保存用户信息
     * @param admin
     * @return 返回-1表示操作失败，其他是sql语句影响的行数
     */
    public int saveAdmin(Admin admin);


}
