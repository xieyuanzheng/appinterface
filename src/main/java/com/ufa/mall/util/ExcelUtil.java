package com.ufa.mall.util;

import com.ufa.mall.dao.TrackingDao;
import com.ufa.mall.entity.Tracking;
import com.ufa.mall.mapper.TrackingMapper;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtil {
    //记录类的输出信息
    private static final Logger log = LoggerFactory.getLogger(ExcelUtil.class);
    @Autowired
    private TrackingDao trackingDao;
    @Autowired
    private TrackingMapper trackingMapper;

    //获取Excel文档的路径
    //public static String filePath = "E:\\files\\svn\\Tech Center\\01-文档\\04-测试文档\\05-质量管理\\UFA问题反馈跟进表.xlsx";
    public List<Tracking> saveTracking(String filename) {

        List<Tracking> list = new ArrayList<Tracking>();
        //String filename = "F:\\UFA问题反馈跟进表1.xlsx";
        Workbook xssfWorkbook = null;
        //TrackingDao trackingDao = new TrackingDaoImpl();
        try {
            InputStream is = new FileInputStream(filename);
            xssfWorkbook = new XSSFWorkbook(is);
             // 获取每一个工作薄
            for (int numSheet = 0; numSheet < xssfWorkbook.getNumberOfSheets(); numSheet++) {
                XSSFSheet xssfSheet = (XSSFSheet) xssfWorkbook.getSheetAt(numSheet);
                if (xssfSheet == null) {
                    continue;
                }
                // 获取当前工作薄的每一行
                //for (int rowNum = 2; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
                for (int rowNum = 2; rowNum <= xssfSheet.getLastRowNum(); rowNum++) {
                    XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                    if (xssfRow != null) {
                        XSSFCell number = xssfRow.getCell(0);
                        //读取第一列数据
                        XSSFCell date = xssfRow.getCell(1);
                        //读取第二至十三列数据
                        XSSFCell feedbackman = xssfRow.getCell(2);
                        XSSFCell feedbackdept = xssfRow.getCell(3);
                        XSSFCell feedbacktype = xssfRow.getCell(4);
                        XSSFCell item = xssfRow.getCell(5);
                        XSSFCell module = xssfRow.getCell(6);
                        XSSFCell description = xssfRow.getCell(7);
                        XSSFCell reason = xssfRow.getCell(8);
                        XSSFCell followman = xssfRow.getCell(9);
                        XSSFCell followresult = xssfRow.getCell(10);
                        XSSFCell chandaono = xssfRow.getCell(11);
                        XSSFCell remark = xssfRow.getCell(12);
                        //读取第三列数据
                        //需要转换数据的话直接调用getValue获取字符串
                        //写入实体类
                        Tracking tracking = new Tracking();
                        if(number == null || getValue(number).isEmpty()){
                            log.info("number : 等于null或为空 ");
                        }else {
                            tracking.setNumber((int)Float.parseFloat(getValue(number)));
                            tracking.setDate(getValue(date));
                            tracking.setFeedbackman(getValue(feedbackman));
                            tracking.setFeedbackdept(getValue(feedbackdept));
                            tracking.setFeedbacktype(getValue(feedbacktype));
                            tracking.setItem(getValue(item));
                            tracking.setModule(getValue(module));
                            tracking.setDescription(getValue(description));
                            tracking.setReason(getValue(reason));
                            tracking.setFollowman(getValue(followman));
                            tracking.setFollowresult(getValue(followresult));
                            if(chandaono != null){
                                tracking.setChandaono(getValue(chandaono));
                            }
                            if(remark != null){
                                tracking.setRemark(getValue(remark));
                            }
                            log.info("tracking.getDescription() :  " + tracking.getDescription() + rowNum);
                            list.add(tracking);
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }//end of main()

    //转换数据格式
    private static String getValue(XSSFCell xssfRow) {

        if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
            return String.valueOf(xssfRow.getBooleanCellValue());
        } else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
            return String.valueOf(xssfRow.getNumericCellValue());
        } else {
            return String.valueOf(xssfRow.getStringCellValue());
        }
    }
    }
