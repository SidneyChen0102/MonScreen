package com.asiainfo.oss.service.impl;

import com.asiainfo.oss.dao.NeDao;
import com.asiainfo.oss.entity.NE_STATE;
import com.asiainfo.oss.service.NeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class NeServiceImpl  implements NeService {

    //@Resource
    @Autowired
    @Qualifier("neDao")
    private NeDao neDao;

    @Override
    public List<NE_STATE> getRate() {
        return neDao.getRate() ;
    }

    @Override
    public List<NE_STATE> getConnect() {
        return neDao.getConnection();
    }

    @Override
    public List<NE_STATE> getIpName() {
        return neDao.getIpname();
    }

    @Override
    public List<NE_STATE> getSucess() {
        return neDao.getSucess();
    }

    @Override
    public List<NE_STATE> getNeTime() {
        return neDao.getNeTime();
    }
}
