package com.tester.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tester.db.TestResultDBManger;
import com.tester.model.TestResult;
import com.tester.utils.HttpClientResult;
import com.tester.utils.HttpClientUtils;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public class TestResultDao {

    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public  List<TestResult> find(){
        List<TestResult> list=new ArrayList<TestResult>();
        String sql = "select * from test_result where code != 200 and code != 500 and `start_time` > CONCAT(DATE_SUB(CURDATE(), INTERVAL 1 DAY), ' 10:00:00') and `start_time`< CONCAT(CURDATE(), ' 09:20:00');";
        conn= TestResultDBManger.getConn();
        try {
            ps=(PreparedStatement) conn.prepareStatement(sql);
            System.out.println(ps.toString());
            rs=ps.executeQuery();
            while (rs.next()) {
                TestResult tr=new TestResult();
                tr.setId(rs.getInt(1));
                tr.setStart_time(rs.getString(2));
                tr.setCode(rs.getString(3));
                tr.setItem(rs.getString(4));
                tr.setMethod(rs.getString(5));
                tr.setResult(rs.getString(6));
                tr.setUrl(rs.getString(7));
                tr.setResponse(rs.getString(8));

                list.add(tr);

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }

    String token = "clzqM9hHqWv6VpGjBtYQt10yrTCe474KgaDi0zUkjrn/6EYbz1xtrWLtUmsZcKreD414vCh5NP+ONq0y8wKO2Gwkn3P4qEETj1BGiE26SPygGJWx+CO30jwNj8adE2RbhKKjKua1HXZI4nFfSSEElNjYSKOciHxdVbVUCs8e0XxzmSMhh4yz5T5v7WXfH4E/0e9jxBIGAkbOtb+gFUJwqNtXDfo/+AftAlSxpQ1suH6orxIqfB1+CcM3o50V8HNIQk0KnvYE6qNzvpCCY+SegOEQ83CBmbNEXtRVYmOx0IqM7EO6mB/XrD8ftzlxtaSh";

    //用户17788559179调用详情
    public StringBuilder Detail20833() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20833");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        String date = null;
        String interfaceName = null;
        StringBuilder detail20833 = new StringBuilder();
        List<String> list=new ArrayList<String>();
        list.add(date);
        list.add(interfaceName);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject job = jsonArray.getJSONObject(i);
            date =  job.getString("date");
            interfaceName =  job.getString("interfaceName");
            detail20833.append(date+"\t");
            detail20833.append(interfaceName+"\r\n").append("<br/>") ;
        }
        return detail20833;
    }


    //用户17788559179调用次数
    public int Size20833() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20833");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        int size20833= jsonArray.size();
        return size20833;
    }


    //用户17816853090调用详情
    public StringBuilder Detail20886() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20886");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        String date = null;
        String interfaceName = null;
        StringBuilder detail20886 = new StringBuilder();
        List<String> list=new ArrayList<String>();
        list.add(date);
        list.add(interfaceName);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject job = jsonArray.getJSONObject(i);
            date =  job.getString("date");
            interfaceName =  job.getString("interfaceName");
            detail20886.append(date+"\t");
            detail20886.append(interfaceName+"\r\n").append("<br/>") ;
        }
        return detail20886;
    }


    //用户17816853090调用次数
    public int Size20886() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20886");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        int size20886 = jsonArray.size();
        return size20886;
    }



    //用户13250810885调用详情
    public StringBuilder Detail20887() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20887");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        String date = null;
        String interfaceName = null;
        StringBuilder detail20887 = new StringBuilder();
        List<String> list=new ArrayList<String>();
        list.add(date);
        list.add(interfaceName);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject job = jsonArray.getJSONObject(i);
            date =  job.getString("date");
            interfaceName =  job.getString("interfaceName");
            detail20887.append(date+"\t");
            detail20887.append(interfaceName+"\r\n").append("<br/>") ;
        }
        return detail20887;
    }


    //用户13250810885调用次数
    public int Size20887() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20887");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        int size20887 = jsonArray.size();
        return size20887;
    }



    //用户15958101905调用详情
    public StringBuilder Detail20888() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20888");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        String date = null;
        String interfaceName = null;
        StringBuilder detail20888 = new StringBuilder();
        List<String> list=new ArrayList<String>();
        list.add(date);
        list.add(interfaceName);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject job = jsonArray.getJSONObject(i);
            date =  job.getString("date");
            interfaceName =  job.getString("interfaceName");
            detail20888.append(date+"\t");
            detail20888.append(interfaceName+"\r\n").append("<br/>") ;
        }
        return detail20888;
    }


    //用户15958101905调用次数
    public int Size20888() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20888");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        int size20888 = jsonArray.size();
        return size20888;
    }



    //用户13957169665调用详情
    public StringBuilder Detail20889() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20889");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        String date = null;
        String interfaceName = null;
        StringBuilder detail20889 = new StringBuilder();
        List<String> list=new ArrayList<String>();
        list.add(date);
        list.add(interfaceName);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject job = jsonArray.getJSONObject(i);
            date =  job.getString("date");
            interfaceName =  job.getString("interfaceName");
            detail20889.append(date+"\t");
            detail20889.append(interfaceName+"\r\n").append("<br/>") ;
        }
        return detail20889;
    }


    //用户13957169665调用次数
    public int Size20889() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20889");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        int size20889 = jsonArray.size();
        return size20889;
    }


    //用户15990717557调用详情
    public StringBuilder Detail20890() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20890");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        String date = null;
        String interfaceName = null;
        StringBuilder detail20890 = new StringBuilder();
        List<String> list=new ArrayList<String>();
        list.add(date);
        list.add(interfaceName);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject job = jsonArray.getJSONObject(i);
            date =  job.getString("date");
            interfaceName =  job.getString("interfaceName");
            detail20890.append(date+"\t");
            detail20890.append(interfaceName+"\r\n").append("<br/>") ;
        }
        return detail20890;
    }


    //用户15990717557调用次数
    public int Size20890() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20890");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        int size20890 = jsonArray.size();
        return size20890;
    }


    //用户18867517074调用详情
    public StringBuilder Detail20891() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20891");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        String date = null;
        String interfaceName = null;
        StringBuilder detail20891 = new StringBuilder();
        List<String> list=new ArrayList<String>();
        list.add(date);
        list.add(interfaceName);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject job = jsonArray.getJSONObject(i);
            date =  job.getString("date");
            interfaceName =  job.getString("interfaceName");
            detail20891.append(date+"\t");
            detail20891.append(interfaceName+"\r\n").append("<br/>") ;
        }
        return detail20891;
    }


    //用户18867517074调用次数
    public int Size20891() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20891");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        int size20891 = jsonArray.size();
        return size20891;
    }


    //用户18757558032调用详情
    public StringBuilder Detail20892() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20892");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        String date = null;
        String interfaceName = null;
        StringBuilder detail20892 = new StringBuilder();
        List<String> list=new ArrayList<String>();
        list.add(date);
        list.add(interfaceName);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject job = jsonArray.getJSONObject(i);
            date =  job.getString("date");
            interfaceName =  job.getString("interfaceName");
            detail20892.append(date+"\t");
            detail20892.append(interfaceName+"\r\n").append("<br/>") ;
        }
        return detail20892;
    }


    //用户18757558032调用次数
    public int Size20892() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20892");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        int size20892 = jsonArray.size();
        return size20892;
    }



    //用户13031013505调用详情
    public StringBuilder Detail20893() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20893");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        String date = null;
        String interfaceName = null;
        StringBuilder detail20893 = new StringBuilder();
        List<String> list=new ArrayList<String>();
        list.add(date);
        list.add(interfaceName);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject job = jsonArray.getJSONObject(i);
            date =  job.getString("date");
            interfaceName =  job.getString("interfaceName");
            detail20893.append(date+"\t");
            detail20893.append(interfaceName+"\r\n").append("<br/>") ;
        }
        return detail20893;
    }


    //用户13031013505调用次数
    public int Size20893() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20893");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        int size20893 = jsonArray.size();
        return size20893;
    }



    //用户16601890722调用详情
    public StringBuilder Detail20877() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20877");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        String date = null;
        String interfaceName = null;
        StringBuilder detail20877 = new StringBuilder();
        List<String> list=new ArrayList<String>();
        list.add(date);
        list.add(interfaceName);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject job = jsonArray.getJSONObject(i);
            date =  job.getString("date");
            interfaceName =  job.getString("interfaceName");
            detail20877.append(date+"\t");
            detail20877.append(interfaceName+"\r\n").append("<br/>") ;
        }
        return detail20877;
    }


    //用户16601890722调用次数
    public int Size20877() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        Map<String, String> params = new HashMap<String, String>();
        headers.put("x-authtoken",token);
        params.put("userId", "20877");
        HttpClientResult result = HttpClientUtils.doPost("http://admin.qingbaomofang.com/api/authority/consumer/getUserProductPathList", headers, params);
        JSONObject jsonObject = JSONObject.parseObject(String.valueOf(result));
        String data = jsonObject.getString("data");
        JSONArray jsonArray = JSONArray.parseArray(data);
        int size20877 = jsonArray.size();
        return size20877;
    }

}