package com.asiainfo.oss.dao;

import com.asiainfo.oss.entity.WO_CRM;
import com.asiainfo.oss.entity.WO_NEA;
import com.asiainfo.oss.entity.WO_OLC;
import com.asiainfo.oss.entity.WO_TIME;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository(value="woDao")
public interface WoDao {
  public List<WO_CRM> getCrm();

  public List<WO_NEA> getNea();

  public List<WO_OLC>  getOlc();

  public  List<WO_TIME> getTime();

}
