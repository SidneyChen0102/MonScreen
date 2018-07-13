package com.asiainfo.oss.service;
        import com.asiainfo.oss.entity.NE_STATE;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.test.context.ContextConfiguration;
        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

        import javax.annotation.Resource;
        import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-service.xml","classpath:spring/spring-mybatis.xml","classpath:spring/spring-web.xml"})
public class NeServiceTest {
    //@Autowired
    @Resource
    private NeService neService = null;

    @Test
    public void getRate() {

        List<NE_STATE> list = neService.getRate();
        System.out.println("=======================");
        System.out.println(list);
    }

  @Test
    public void getConnect() {
      List<NE_STATE> connect = neService.getConnect();
      System.out.println("========================");
      System.out.println(connect);
  }

    @Test
    public void getSucess() {

        List<NE_STATE> sucess = neService.getSucess();
        System.out.println("======================");
        System.out.println(sucess);
    }
}