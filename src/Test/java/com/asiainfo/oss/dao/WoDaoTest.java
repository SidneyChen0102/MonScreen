package com.asiainfo.oss.dao;
        import com.asiainfo.oss.entity.WO_CRM;
        import com.asiainfo.oss.entity.WO_NEA;
        import com.asiainfo.oss.entity.WO_OLC;
        import com.asiainfo.oss.entity.WO_TIME;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.test.context.ContextConfiguration;
        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

        import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-mybatis.xml")
public class WoDaoTest {
@Autowired
private  WoDao  woDao;
@Test
    public void getCrm() {
    List<WO_CRM> crm = woDao.getCrm();
    System.out.print(crm);

}

    @Test
    public void getNea() {
        List<WO_NEA> nea = woDao.getNea();
        System.out.print(nea);

    }

    @Test
    public void getOlc() {
        List<WO_OLC> olc = woDao.getOlc();
        System.out.print(olc);

    }

    @Test
    public void getTime() {
        List<WO_TIME> time = woDao.getTime();
        System.out.print(time);
    }
}