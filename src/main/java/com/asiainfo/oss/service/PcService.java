package com.asiainfo.oss.service;

import com.asiainfo.oss.dao.PCDao;
import com.asiainfo.oss.entity.PC;

import java.util.List;

public interface PcService {

    public List<PC> getCpu();

    public List<PC> getMemroy();

}