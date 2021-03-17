package pojo;

/**
 * @author Su yufan
 * @create 2020-12-31 9:12
 */
public class Admin {
    public String Guser;
    public String Gpassword;
    public String Gemail;

    public String getGuser() {
        return Guser;
    }

    public void setGuser(String guser) {
        Guser = guser;
    }

    public String getGpassword() {
        return Gpassword;
    }

    public void setGpassword(String gpassword) {
        Gpassword = gpassword;
    }

    public String getGemail() {
        return Gemail;
    }

    public void setGemail(String gemail) {
        Gemail = gemail;
    }

    public Admin() {
    }

    public Admin(String guser, String gpassword) {
        Guser = guser;
        Gpassword = gpassword;
    }

    public Admin(String guser, String gpassword, String gemail) {
        Guser = guser;
        Gpassword = gpassword;
        Gemail = gemail;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "Guser='" + Guser + '\'' +
                ", Gpassword='" + Gpassword + '\'' +
                ",Gemail='"+Gemail+'\''+
                '}';
    }
}
