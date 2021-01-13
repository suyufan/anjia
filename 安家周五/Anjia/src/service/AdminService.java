package service;

import pojo.Admin;
import pojo.User;

/**
 * @author Su yufan
 * @create 2020-12-31 9:51
 */
public interface AdminService {
    /**
     * 注册用户
     * @param admin
     */
      public void registAdmin(Admin admin);

        /**
         * 登录
         * @param admin
         * @return 如果返回null，说明登录失败，返回有值，是登录成功
         */
        public Admin login(Admin admin);

        /**
         * 检查 用户名是否可用
         * @param Guser
         * @return 返回true表示用户名已存在，返回false表示用户名可用
         */
        public boolean existsAdminname(String Guser);
    }


