package com.asiainfo.oss.service;

import com.asiainfo.oss.entity.WO_CRM;
import com.asiainfo.oss.entity.WO_NEA;
import com.asiainfo.oss.entity.WO_OLC;
import com.asiainfo.oss.entity.WO_TIME;

import java.util.List;

public interface WoService  {

    public List<WO_CRM> getCrm();

    public List<WO_NEA> getNea();

    public List<WO_OLC>  getOlc();

    public  List<WO_TIME> getTime();

}
