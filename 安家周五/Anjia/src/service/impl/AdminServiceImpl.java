package service.impl;

import dao.AdminDao;
import dao.UserDao;
import dao.impl.AdminDaoImpl;
import dao.impl.UserDaoImpl;
import pojo.Admin;
import pojo.Admin;
import service.AdminService;
import service.UserService;

/**
 * @author Su yufan
 * @create 2020-12-31 9:50
 */
public class AdminServiceImpl implements AdminService {
        private AdminDao adminDao = new AdminDaoImpl();

    @Override
    public void registAdmin(Admin admin) {
        adminDao.saveAdmin(admin);
    }

        @Override
        public Admin login(Admin admin) {
            return adminDao.queryUserByUsernameAndPassword(admin.getGuser(),admin.getGpassword());
        }

        @Override
        public boolean existsAdminname(String Guser) {

            if (adminDao.queryUserByUsername(Guser) == null) {
                // 等于null,说明没查到，没查到表示可用
                return false;
            }

            return true;

        }
    }
