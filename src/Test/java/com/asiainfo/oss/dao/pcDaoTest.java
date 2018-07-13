package com.asiainfo.oss.dao;

        import com.asiainfo.oss.entity.PC;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.test.context.ContextConfiguration;
        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

        import javax.annotation.Resource;
        import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-mybatis.xml")
public class PcDaoTest {

    @Resource
    private PCDao pcDao;
    @Test
    public void getCpu() {
        List<PC> cpu = pcDao.getCpu();
        System.out.print(cpu);
    }

    @Test
    public void getMemroy() {
       List<PC> memroy = pcDao.getMemroy();
        System.out.print(memroy);

    }
}