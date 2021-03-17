package dao;
import com.sun.codemodel.internal.JForEach;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import untils.JDBCUtils1;
import java.util.List;
import java.util.Map;

public class SurveyHelp {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils1.getDataSource());


    public List<Map<String, Object>> func(int minarea, int maxarea, int minyear, int maxyear) {
        String sql = "SELECT Apicture,Acounty,Aaddress,Aheight,Aarea,Ayears FROM anjuke_e " +
                "where  Aarea>? and Aarea<? and Ayears>? and Ayears<?;";
        List<Map<String, Object>> list = template.queryForList(sql, minarea, maxarea, minyear, maxyear);
        //传入  地区 年份  大致面积
        return list;
    }

    public List func() {
        String sql = "SELECT Apicture,Acounty,Aaddress,Aheight,Aarea,Ayears FROM anjuke_e ";
        List<Map<String, Object>> list = template.queryForList(sql);
        //传入  地区 年份  大致面积
        return list;
    }
@Test
    public void test(){
    List func = func();
    for(Object map:func)
    {
        System.out.println(map);
    }
}
}
