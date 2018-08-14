package com.ufa.mall.controller;

import com.ufa.mall.entity.Tracking;
import com.ufa.mall.mapper.TrackingMapper;
import com.ufa.mall.util.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FileController {
    private static final Logger logger = LoggerFactory.getLogger(FileController.class);
    @Autowired
    TrackingMapper trackingMapper;

    @PostMapping("/upload")
    @ResponseBody
    public String uploadFile(@RequestParam("test")MultipartFile file){
         if(file.isEmpty()){
            return "文件为空";
        }
        // 获取文件名
         String fileName = file.getOriginalFilename();
        logger.info("上传的文件名为：" + fileName);
        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        logger.info("上传的后缀名为：" + suffixName);
        // 文件上传后的路径
        String filePath = "E://test//";
        // 解决中文问题，liunx下中文路径，图片显示问题
        // fileName = UUID.randomUUID() + suffixName;
        File dest = new File(filePath + fileName);
        // 检测是否存在目录
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdirs();
        }
        try{
            file.transferTo(dest);
            //数据导入数据库
            ExcelUtil excelUtil = new ExcelUtil();
            List<Tracking> list = new ArrayList<Tracking>();
            list=excelUtil.saveTracking(filePath + fileName);

            for(int i=0;i<list.size();i++){
                if(trackingMapper.queryByNumber(list.get(i).getNumber()) == null){
                    trackingMapper.addTracking(list.get(i));
                }else {
                    logger.info("请不要重复插入数据！");
                }

            }
            return "上传成功";
        }catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "上传失败";
    }

    @RequestMapping("/uploadExcel")
    public String uploadExcel(){
        return "upload";
    }

    //提供tracking表的内容接口
    @RequestMapping("/getTrackings")
    @ResponseBody
    public List<Tracking> getTrackings(){
        List<Tracking> list = new ArrayList<Tracking>();
        list = trackingMapper.queryALl();
        return list;
    }

    @RequestMapping("/getTrackings/{number}")
    @ResponseBody
    public Tracking getTrackingByNumber(@PathVariable int number){
        Tracking tracking = trackingMapper.queryByNumber(number);
        return tracking;
    }

}
