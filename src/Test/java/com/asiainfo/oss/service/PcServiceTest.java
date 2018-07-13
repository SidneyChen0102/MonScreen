package com.asiainfo.oss.service;

import com.asiainfo.oss.dao.PCDao;
import com.asiainfo.oss.entity.PC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-service.xml","classpath:spring/spring-mybatis.xml","classpath:spring/spring-web.xml"})
public class PcServiceTest {
    @Autowired
private PCDao pcDao;
    @Test
    public void getCpu() {
        List<PC> cpu = pcDao.getCpu();
        System.out.println("==================");
        System.out.println(cpu);

    }

    @Test
    public void getMemroy() {
        List<PC> memroy = pcDao.getMemroy();
        System.out.println("=================");
        System.out.println(memroy);
    }
}