package com.asiainfo.oss.dao;

import com.asiainfo.oss.entity.NE_STATE;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository(value = "neDao")

public interface NeDao {

    public List<NE_STATE>  getRate();

    public List<NE_STATE>  getSucess();

    public List<NE_STATE> getConnection();

    public List<NE_STATE> getNeTime();

   public List<NE_STATE> getIpname();
}
