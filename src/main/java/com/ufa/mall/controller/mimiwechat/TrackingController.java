package com.ufa.mall.controller.mimiwechat;

import com.ufa.mall.entity.Tracking;
import com.ufa.mall.entity.TrackingHome;
import com.ufa.mall.entity.UfaUser;
import com.ufa.mall.mapper.TrackingMapper;
import com.ufa.mall.mapper.UfaUserMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;

@Controller
public class TrackingController {

    @Autowired
    TrackingMapper trackingMapper;
    @Autowired
    UfaUserMapper ufaUserMapper;

    private static final Logger logger = LoggerFactory.getLogger(TrackingController.class);

    @RequestMapping("/tracking")
    @ResponseBody
    public List<TrackingHome> getTracking(){
        List<Tracking> listTracking = trackingMapper.queryALl();
        List<TrackingHome> listTrackingHome = new ArrayList<TrackingHome>();
        TrackingHome trackingHome;
        for (int i=0;i<listTracking.size();i++) {
            trackingHome = new TrackingHome();
            System.out.println("list is : " + listTracking.get(i).getDescription());
            //设置跟踪表
            trackingHome.setTracking(listTracking.get(i));
            //设置图片地址
            if(listTracking.get(i).getFollowresult().equals("解决中")){
                trackingHome.setImgUrl("/pages/index/img/open.png");
            }else {
                trackingHome.setImgUrl("/pages/index/img/close.png");
            }
            //获取电话号码
            trackingHome.setTelephone(ufaUserMapper.queryTele(listTracking.get(i).getFeedbackman()));
            //将实体类注入list
            listTrackingHome.add(trackingHome);
        }
        return listTrackingHome;
    }

    @RequestMapping("/trackingid/{id:\\d+}")
    @ResponseBody
    public Tracking getTrackingById(@PathVariable int id){
        Tracking tracking = trackingMapper.queryById(id);
        return tracking;
    }

    @RequestMapping("/trackingnumber/{number:\\d+}")
    @ResponseBody
    public Tracking getTrackingByNumber(@PathVariable int number){
        return trackingMapper.queryByNumber(number);
    }

    @PostMapping("/trackingfeedbackman")
    @ResponseBody
    public List<TrackingHome> getTrackingByFeedbackman(String feedbackman){
        System.out.println("-----getTrackingByFeedbackman----------" + feedbackman);
        List<Tracking> listTracking = trackingMapper.queryByFeedbackman(feedbackman);
        List<TrackingHome> listTrackingHome = new ArrayList<TrackingHome>();
        TrackingHome trackingHome;
        for (int i=0;i<listTracking.size();i++) {
            trackingHome = new TrackingHome();
            System.out.println("list is : " + listTracking.get(i).getDescription());
            //设置跟踪表
            trackingHome.setTracking(listTracking.get(i));
            //设置图片地址
            if(listTracking.get(i).getFollowresult().equals("解决中")){
                trackingHome.setImgUrl("/pages/index/img/open.png");
            }else {
                trackingHome.setImgUrl("/pages/index/img/close.png");
            }
            //获取电话号码
            trackingHome.setTelephone(ufaUserMapper.queryTele(listTracking.get(i).getFeedbackman()));
            //将实体类注入list
            listTrackingHome.add(trackingHome);
        }
        return listTrackingHome;
    }

    @PostMapping("/trackinglikefeedbackman")
    @ResponseBody
    public List<TrackingHome> getTrackingByLikeFeedbackman(String feedbackman){
        System.out.println("-----getTrackingByLikeFeedbackman----------" + feedbackman);
        List<Tracking> listTracking = trackingMapper.queryLikeFeedbackman(feedbackman);
        List<TrackingHome> listTrackingHome = new ArrayList<TrackingHome>();
        TrackingHome trackingHome;
        for (int i=0;i<listTracking.size();i++) {
            trackingHome = new TrackingHome();
            System.out.println("list is : " + listTracking.get(i).getDescription());
            //设置跟踪表
            trackingHome.setTracking(listTracking.get(i));
            //设置图片地址
            if(listTracking.get(i).getFollowresult().equals("解决中")){
                trackingHome.setImgUrl("/pages/index/img/open.png");
            }else {
                trackingHome.setImgUrl("/pages/index/img/close.png");
            }
            //获取电话号码
            trackingHome.setTelephone(ufaUserMapper.queryTele(listTracking.get(i).getFeedbackman()));
            //将实体类注入list
            listTrackingHome.add(trackingHome);
        }
        return listTrackingHome;
    }


    @PostMapping("/trackingfollowman")
    @ResponseBody
    public List<Tracking> getTrackingByFollowman(String followman){
        System.out.println("-----getTrackingByFollowman----------" + followman);
        return trackingMapper.queryByFollowman(followman);
    }

    @PostMapping("/trackingfollowresult")
    @ResponseBody
    public List<Tracking> getTrackingByFollowresult(String followresult){
        System.out.println("-----getTrackingByFollowresult----------" + followresult);
        return trackingMapper.queryByFollowresult(followresult);
    }


}
