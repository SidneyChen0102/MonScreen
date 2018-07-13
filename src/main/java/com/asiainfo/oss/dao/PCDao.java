package com.asiainfo.oss.dao;

import com.asiainfo.oss.entity.PC;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository(value="pcDao")
public interface PCDao {
  public List<PC> getCpu();

  public List<PC> getMemroy();



}
