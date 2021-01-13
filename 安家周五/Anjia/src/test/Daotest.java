package test;

import dao.SurveyDao;
import pojo.Share;

public class Daotest {
    public static void main(String[] args) {
//        Share sh = new Share();
//        Share.setYear("2015");
//        Share.setArea("90");
//        Share.setCounty("4");


//        System.out.println(sh);

        new SurveyDao().login();
    }
}
