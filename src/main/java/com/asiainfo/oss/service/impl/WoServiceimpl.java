package com.asiainfo.oss.service.impl;

import com.asiainfo.oss.dao.WoDao;
import com.asiainfo.oss.entity.WO_CRM;
import com.asiainfo.oss.entity.WO_NEA;
import com.asiainfo.oss.entity.WO_OLC;
import com.asiainfo.oss.entity.WO_TIME;
import com.asiainfo.oss.service.WoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WoServiceimpl implements WoService {
    @Autowired
    @Qualifier("woDao")
    private WoDao woDao;

    @Override
    public List<WO_CRM> getCrm() {
        return woDao.getCrm();
    }

    @Override
    public List<WO_NEA> getNea() {
        return woDao.getNea();
    }

    @Override
    public List<WO_OLC> getOlc() {
        return woDao.getOlc();
    }

    @Override
    public List<WO_TIME> getTime() {
        return woDao.getTime();
    }
}
