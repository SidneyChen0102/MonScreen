package com.asiainfo.oss.utils;

import com.asiainfo.dto.*;
import com.asiainfo.oss.entity.NE_STATE;
import com.asiainfo.oss.entity.PC;
import com.asiainfo.oss.entity.WO_CRM;
import com.asiainfo.oss.service.NeService;
import com.asiainfo.oss.service.PcService;
import com.asiainfo.oss.service.WoService;

import java.util.ArrayList;
import java.util.List;

public class  EdUtils {
    private static NeService neService;
    private static PcService pcService;
    private static WoService woService;
    public  static List<Conrestful> getConnection(){
        List  <NE_STATE> connect = neService.getConnect();
        List<Conrestful> result =new ArrayList<Conrestful>();
        for (NE_STATE ne_state:connect){
            Conrestful conrestful=new Conrestful(ne_state.getNAME(),ne_state.getCONNECTIONS(),ne_state.getUPPER_LIMIT());
            result.add(conrestful);
        }
        return  result;
    }



    public static   List<CpuRestful>   getCpu(){
        List<PC> cpu = pcService.getCpu();
        ArrayList<CpuRestful> result = new ArrayList<>();
        for (PC  pc:  cpu){
            CpuRestful cpuRest = new CpuRestful(pc.getIP(), pc.getCPU_AMOUNT());
            result.add(cpuRest);


        }
          return  result;
    }


    public static   List<MeRestful> getMemory(){
        List<PC> memroy = pcService.getMemroy();
        ArrayList<MeRestful> result = new ArrayList<>();
        for (PC pc:memroy){
            MeRestful meRestful = new MeRestful(pc.getIP(), pc.getMEMORY_AMOUNT());
             result.add(meRestful);
        }
            return  result;
    }

/*    public  static  List<CrmRestful> getCRM(){
        List<WO_CRM> crm = woService.getCrm();
        ArrayList<CrmRestful> crmRestfuls = new ArrayList<>();
        for ()

    }
    */

}
