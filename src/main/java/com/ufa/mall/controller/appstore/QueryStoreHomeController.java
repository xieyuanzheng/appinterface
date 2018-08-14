package com.ufa.mall.controller.appstore;

import com.alibaba.fastjson.JSON;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.Map;

@Controller
public class QueryStoreHomeController {
    //店铺首页接口
    @ResponseBody
    @RequestMapping("/postQueryStoreHome")
    public String QueryStoreHome(){
        String url = "https://www.ufa.hk/app-web/store/storeHome.pub";
        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("stoId","2398804494008320")
                .build();
        Request request = new Request.Builder()
                .url(url)
                .addHeader("platform","android")
                .addHeader("timestamp","1522748144000")
                .addHeader("version","v2.0")
                .addHeader("token","")
                .addHeader("sign","")
                .addHeader("Accept","application/json")
                .addHeader("Content-Type","application/x-www-form-urlencoded")
                .post(formBody)
                .build();
        Response response ;
        try  {
            response = okHttpClient.newCall(request).execute();
            if(response.isSuccessful()){
                String str = response.body().string();
                System.out.println(str);
                Map map = JSON.parseObject(str,Map.class);
                System.out.println(map.get("msg"));
            }else {
                System.out.println("调用接口失败");
            }
        }catch (IOException e) {
            System.out.println("111111111");
            e.printStackTrace();
        }

        return "QueryStoreHome()：查询店铺首页 post Http请求";
    }

}
