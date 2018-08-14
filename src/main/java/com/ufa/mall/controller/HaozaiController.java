package com.ufa.mall.controller;


import com.ufa.mall.entity.Details;
import com.ufa.mall.entity.ResponseData;
import com.ufa.mall.entity.Table;
import com.ufa.mall.entity.Tracking;
import com.ufa.mall.mapper.DetailsMapper;
import com.ufa.mall.mapper.TrackingMapper;
import com.ufa.mall.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HaozaiController {

    @GetMapping("/haozai")
    public String getHaozai(){
        return "haozai";
    }

    @GetMapping("/warn")
    public String getQRCode(){
        return "QRCode";
    }

    @GetMapping("/downloadapk")
    public String getdownloadapk(){
        return "downloadapk";
    }

    @GetMapping("/zhuang")
    public String getZhuang(){
        return "index";
    }


    /*@GetMapping("/tracking")
    @ResponseBody
    public String getTracking(){
        ExcelUtil excelUtil = new ExcelUtil();
        return "tracking";
    }*/

 /*   @ResponseBody
    @RequestMapping("/demand")
    public Demand getDemand(int id){
        Demand demand = new Demand();
        demand.setId(1);
        demand.setName("Testin兼容性测试");
        demand.setStatus("云测中");
        demand.setOnlineTime("2018-07-04");
        return demand;
    }*/

    /*@Autowired
    DetailsDao detailsDao;*/

   /* @RequestMapping("/details")
    @ResponseBody
    public Details getDetail(int id){
        Details details = detailsDao.findById(id);
        if(details == null){
            details.setId(9999);
            details.setName("空数据");
            details.setDescription("detail is null");
            return details;
        }
        return details;
    }*/

   @Autowired
    DetailsMapper detailsMapper;

    @ResponseBody
    @RequestMapping("/queryDetail")
    public Details getDetails(int id){
        System.out.println("----------");
        return detailsMapper.queryById(id);
    }

    @Autowired
    TrackingMapper trackingMapper;

    @ResponseBody
    @RequestMapping("/addTracking")
    public String addTracking(int id){
        System.out.println("----- add tracking only primary key");
        System.out.println("id : " + id);
        Tracking tracking = new Tracking();
        tracking.setId(id);
        return (trackingMapper.addTracking(tracking)==1)?"insert success":"insert failed";
    }

    @GetMapping("/echart")
    public String getEchart(){
        System.out.println("Echart Example.");
        return "echart";
    }

    @GetMapping("/layui")
    public String getLayUI(){
          return "layui";
    }

    @GetMapping("/getTableData")
    @ResponseBody
    public ResponseData getTableData(){
        Table table1 = new Table(10000,"user-0","女","城市-0","签名-0","255","57","作家","82830700");
        Table table2 = new Table(10001,"user-1","男","城市-1","签名-1","255","57","作家","82830700");
        Table table3 = new Table(10002,"user-2","女","城市-2","签名-2","255","57","作家","82830700");
        ResponseData responseData = new ResponseData();
        List<Table> list = new ArrayList<Table>();
        list.add(table1);
        list.add(table2);
        list.add(table3);
        responseData.setCode(0);
        responseData.setMsg("success");
        responseData.setCount(1000);
        responseData.setData(list);


        return responseData;
    }

}
