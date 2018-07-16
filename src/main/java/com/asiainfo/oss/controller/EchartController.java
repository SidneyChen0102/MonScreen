package com.asiainfo.oss.controller;

import com.asiainfo.dto.*;
import com.asiainfo.oss.entity.*;
import com.asiainfo.oss.service.NeService;
import com.asiainfo.oss.service.PcService;
import com.asiainfo.oss.service.WoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@Controller
public class EchartController {

    @Autowired
    private  NeService neService;

    @Autowired
    private  WoService woService;

    @Autowired
    private  PcService pcService;

    @RequestMapping("getsucess" )
    @ResponseBody()
    public List<SucRestful> getSucess(){
        List<NE_STATE> sucess=neService.getSucess();
        List<SucRestful> result =new ArrayList<SucRestful>();
        for (NE_STATE ne_state:sucess){
            SucRestful sucRestful=new SucRestful(ne_state.getNAME(),ne_state.getSUCESS());
            result.add(sucRestful);
        }
        return  result;

}

   @RequestMapping("getRate")
    @ResponseBody()
    public   List<RateRestful>  getRate(){
       List<NE_STATE> rate=neService.getRate();
       List<RateRestful> result =new ArrayList<RateRestful>();
       for (NE_STATE ne_state:rate){
           RateRestful rateRestful=new RateRestful(ne_state.getNAME(),ne_state.getRATE());
           result.add(rateRestful);
       }
       return  result;

   }

   @RequestMapping("getConnections")
    @ResponseBody()
   public  List<Conrestful> getConnection(){
       List<NE_STATE> connect = neService.getConnect();
       List<Conrestful> result =new ArrayList<Conrestful>();
       for (NE_STATE ne_state:connect){
           Conrestful conrestful=new Conrestful(ne_state.getNAME(),ne_state.getCONNECTIONS(),ne_state.getUPPER_LIMIT());
           result.add(conrestful);

       }
       return  result;


   }


   @RequestMapping("getCpu")
    @ResponseBody()
    public  List<CpuRestful>  getCpu(){
        List<PC> cpu = pcService.getCpu();
       ArrayList<CpuRestful> result = new ArrayList<>();
       for (PC  pc:  cpu){
           CpuRestful cpuRest = new CpuRestful(pc.getIP(), pc.getCPU_AMOUNT());
           result.add(cpuRest);


       }
       return  result;


   }
   @RequestMapping("getMemory")
    @ResponseBody()
    public  List<MeRestful> getMemory(){
         List<PC> memroy = pcService.getMemroy();
         ArrayList<MeRestful> result = new ArrayList<>();
         for (PC pc:memroy){
             MeRestful meRestful = new MeRestful(pc.getIP(), pc.getMEMORY_AMOUNT());
             result.add(meRestful);
         }
         return  result;

     }



     @RequestMapping("getCRM")
     @ResponseBody()
     public  List<CrmRestful> getCRM(){
         List<WO_CRM> crm = woService.getCrm();
         ArrayList<CrmRestful> result = new ArrayList<>();
         for (WO_CRM wo_crm:crm){
             CrmRestful crmRestful = new CrmRestful(wo_crm.getCRM_AMOUNT(),wo_crm.getCRM_COMPLETE(),wo_crm.getCRM_EXCEPTION());
             result.add(crmRestful);

         }
         return  result;

     }

     @RequestMapping("getNea")
     @ResponseBody()
     public List<NeaRestful> getNea(){
         List<WO_NEA> nea = woService.getNea();
         ArrayList<NeaRestful> result = new ArrayList<>();
         for (WO_NEA wo_nea:nea){
             NeaRestful neaRestful = new NeaRestful(wo_nea.getNEA_AMOUNT(),wo_nea.getNEA_COMPLETE(),wo_nea.getNEA_EXCEPTION());
             result.add(neaRestful);

         }
            return   result;

     }

    @RequestMapping("getOlc")
    @ResponseBody
    public  List<OlcRestful>  getOlc(){
        List<WO_OLC> olc = woService.getOlc();
        ArrayList<OlcRestful> result = new ArrayList<>();
        for (WO_OLC wo_olc:olc){
            OlcRestful olcRestful = new OlcRestful(wo_olc.getOLC_AMOUNT(),wo_olc.getOLC_COMPLETE(),wo_olc.getOLC_EXCEPTION());
            result.add(olcRestful);
        }
         return  result;
    }


  @RequestMapping("getTime")
    @ResponseBody()
    public  List <TimeRestful>  getTime(){
      List<WO_TIME> time = woService.getTime();
      ArrayList<TimeRestful> timeRestfuls = new ArrayList<>();
      for (WO_TIME wo_time:time){
          TimeRestful timeRestful = new TimeRestful(wo_time.getCRM_TIME(),wo_time.getNEA_TIME(),wo_time.getOLC_TIME());
          timeRestfuls.add(timeRestful);
          System.out.println(timeRestful.toString());

      }
        return  timeRestfuls;

  }


}