package com.asiainfo.oss.service;

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

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={ "classpath:spring/spring-service.xml","classpath:spring/spring-mybatis.xml","classpath:spring/spring-web.xml"})
public class WoServiceTest {
@Autowired
private  WoService woService;
    @Test
    public void getCrm() {
        List<WO_CRM> crm = woService.getCrm();
        System.out.println("==============");
        System.out.println(crm);
    }

    @Test
    public void getNea() {
        List<WO_NEA> nea = woService.getNea();
        System.out.println("================");
        System.out.println(nea);
    }

    @Test
    public void getOlc() {
        List<WO_OLC> olc = woService.getOlc();
        System.out.println("===============");
        System.out.println(olc);

    }

    @Test
    public void getTime() {
        List<WO_TIME> time = woService.getTime();
        System.out.println("==============");
        System.out.println(time);
    }
}