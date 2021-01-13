package test;

import java.lang.reflect.Method;

/**
 * @author Su yufan
 * @create 2020-12-31 12:39
 */
public class LoginServletTest {
        public void login() {
            System.out.println("这是login()方法调用了");
        }

        public void regist() {
            System.out.println("这是regist()方法调用了");
        }

        public void updateUser() {
            System.out.println("这是updateUser()方法调用了");
        }

        public void updateUserPassword() {
            System.out.println("这是updateUserPassword()方法调用了");
        }


        public static void main(String[] args) {
            String action = "regist";

            try {
                // 获取action业务鉴别字符串，获取相应的业务 方法反射对象
                Method method = LoginServletTest.class.getDeclaredMethod(action);

//            System.out.println(method);
                // 调用目标业务 方法
                method.invoke(new LoginServletTest() );

            } catch (Exception e) {
                e.printStackTrace();
            }


        }


    }


