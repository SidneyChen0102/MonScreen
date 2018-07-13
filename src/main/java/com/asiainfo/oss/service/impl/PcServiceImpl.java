package com.asiainfo.oss.service.impl;

import com.asiainfo.oss.dao.PCDao;
import com.asiainfo.oss.entity.PC;
import com.asiainfo.oss.service.PcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("PcService")
public class PcServiceImpl implements PcService {
    @Autowired
    private PCDao pcDao;

    @Override
    public List<PC> getCpu() {
        return pcDao.getCpu();
    }

    @Override
    public List<PC> getMemroy() {
        return pcDao.getMemroy();
    }
}
