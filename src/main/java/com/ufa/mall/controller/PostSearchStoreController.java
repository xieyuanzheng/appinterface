package com.ufa.mall.controller;

import com.ufa.mall.entity.Autotestcase;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class PostSearchStoreController {
    //店铺搜索接口
    @ResponseBody
    @RequestMapping("/postSearchStore")
    public String postSearchStore() {
        String url = "https://www.ufa.hk/app-web/shop/searchStore.pub";
        OkHttpClient okHttpClient = new OkHttpClient();
        RequestBody formBody = new FormBody.Builder()
                .add("sk","")
                .add("pageNo","1")
                .add("pageSize","10")
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
        Autotestcase autotestcase;
        try {
            response = okHttpClient.newCall(request).execute();
            if(response.isSuccessful()){
               String str = response.body().string();
//                JSONArray jsonArray = new JSONArray( '[' + response.body().string() +']');
                JSONObject jsonObject = new JSONObject(str);
                System.out.println(jsonObject);
                String msg = jsonObject.get("msg").toString();
                System.out.println(jsonObject.get("msg"));
                JSONObject data = jsonObject.getJSONObject("data");
                JSONObject page = data.getJSONObject("page");
                System.out.println("page : " + page);
                String totalSize = page.get("totalSize").toString();
                System.out.println("totalSize : " + totalSize);
                JSONArray list = data.getJSONArray("list");
               for(int i=0;i<list.length();i++){
                   JSONObject list1 = list.getJSONObject(i);
                   String name = list1.get("name").toString();
                   System.out.println("name : " + name);
                }

            }else {
                System.out.println("调用接口失败");
            }
        } catch (IOException e) {
            System.out.println("111111111");
            e.printStackTrace();
        }
        return "postSearchStore()：查询所有店铺 post Http请求";
    }//end of postSearchStore()

}
