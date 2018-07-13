package com.asiainfo.oss.dao;
import com.asiainfo.oss.entity.NE_STATE;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-mybatis.xml")

public class NeDaoTest {
   @Autowired
   public   NeDao neDao;
    @Test
    public void getRate() {
     List<NE_STATE> rate = neDao.getRate();
     System.out.print(rate);
    }

    @Test
    public void getSucess() {
     List<NE_STATE> sucess = neDao.getSucess();
     System.out.print(sucess);
    }

    @Test
    public void getConnection() {
     List<NE_STATE> connection = neDao.getConnection();
     System.out.print(connection);
    }

  /*  @Test
    public void getNeTime() {
     List<NE_STATE> neTime = neDao.getNeTime();
     System.out.print(neTime);
    }

    @Test
    public void getIpname() {
     List<NE_STATE> ipname = neDao.getIpname();
     System.out.print(ipname);
    }*/
}