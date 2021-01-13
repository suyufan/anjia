package pojo;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import untils.JDBCUtils1;

import java.util.List;
import java.util.Map;

public class Share {
    public static JdbcTemplate template = new JdbcTemplate(JDBCUtils1.getDataSource());
    ;
//            template = new JdbcTemplate(JDBCUtils1.getDataSource());

    public static int buttom() {

        String sql = "select id from  survey order by id DESC limit 1";
        Map<String, Object> map = template.queryForMap(sql);
        int id = (int) map.get("id");
        return id;

    }

    public static int insert(String name, String value, int id) {
        String sql = "update survey set " + name + " = ? where id = ?";
        int i = template.update(sql, value, id);
        return i;
    }

    public static void insertNULL() {
        template.update("insert into survey values (null,null,null,null,null,null,null)");

    }

    public static List show(int minA, int maxA, int minY, int maxY) {
        String sql = "select Aaddress,Aheight,Ayears,Aarea,Aprice from anjuke_e where Aarea>? and Aarea<? and Ayears>? and Ayears<?";
        List<Map<String, Object>> list = template.queryForList(sql, minA, maxA, minY, maxY);
        return list;
//        select Aaddress,Aheight,Ayears,Aarea,Aprice from anjuke_e where Aarea>30 and Aarea<100 and Ayears>2010 and Ayears<2020;
    }
    public static List show1(int minA, int maxA, int minY, int maxY) {
        String sql = "select Aaddress,Apicture,Aheight,Ayears,Aarea,Aprice from anjuke_e where Aarea>? and Aarea<? and Ayears>? and Ayears<?";
        List<Map<String, Object>> list = template.queryForList(sql, minA, maxA, minY, maxY);
        return list;
//        select Aaddress,Aheight,Ayears,Aarea,Aprice from anjuke_e where Aarea>30 and Aarea<100 and Ayears>2010 and Ayears<2020;
    }

    public static Map get(int id) {
        String sql = "select *from survey where id =" + id;
        Map<String, Object> map = template.queryForMap(sql);
        return map;
    }

    @Test
    public void test() {
        Map map = Share.get(45);
        List show = show1(80, 90, 2010, 2020);




    }

}
