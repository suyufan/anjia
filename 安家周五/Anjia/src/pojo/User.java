package pojo;

/**
 * @author Su yufan
 * @create 2020-12-31 9:15
 */
public class User {
    public String Uuser;
    public String Upassword;
    public String email;

    public String getUuser() {
        return Uuser;
    }

    public void setUuser(String uuser) {
        Uuser = uuser;
    }

    public String getUpassword() {
        return Upassword;
    }

    public void setUpassword(String upassword) {
        Upassword = upassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public User(String uuser, String upassword, String email) {
        Uuser = uuser;
        Upassword = upassword;
        this.email = email;
    }
    public User(){

    }
    @Override
    public String toString() {
        return "User{" +
                "Uuser=" + Uuser +
                ", Upassword='" + Upassword + '\'' +
                '}';
    }
}
