package service.impl;

/**
 * @author Su yufan
 * @create 2020-12-31 9:49
 */

import dao.UserDao;
import dao.impl.UserDaoImpl;
import pojo.User;
import service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();

    @Override
    public void registUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUuser(), user.getUpassword());
    }

    @Override
    public boolean existsUsername(String Uuser) {

        if (userDao.queryUserByUsername(Uuser) == null) {
            // 等于null,说明没查到，没查到表示可用
            return false;
        }

        return true;

    }
}
