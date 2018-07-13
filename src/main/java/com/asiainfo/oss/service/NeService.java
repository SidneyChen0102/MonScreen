package com.asiainfo.oss.service;

import com.asiainfo.oss.entity.NE_STATE;


import java.util.List;
public interface NeService {

    List<NE_STATE> getRate();

    List<NE_STATE> getConnect();

    List<NE_STATE> getIpName();

    List<NE_STATE> getSucess();

    List<NE_STATE> getNeTime();

}
