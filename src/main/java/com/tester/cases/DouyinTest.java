package com.tester.cases;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class DouyinTest {
    @Test(groups = "douyin")
    public void get_feed() throws IOException {
        //热门事件
        String result;
        String url = "http://47.97.206.10/api/douyin/get_feed";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }

    @Test(groups = "douyin")
    public void get_share_video_detail() throws IOException {
        //获取分享视频连接的详情
        String result;
        String url = "http://47.97.206.10/api/douyin/get_share_video_detail?url=http://v.douyin.com/UyrYGY/";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_nearby_feed() throws IOException {
        //获取该城市的热门信息
        String result;
        String url = "http://47.97.206.10/api/douyin/get_nearby_feed?city_id=110000";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_user_info() throws IOException {
        //获取用户信息
        String result;
        String url = "http://47.97.206.10/api/douyin/get_user_info?user_id=102388086611";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_user_post() throws IOException {
        //获取用户post的视频
        String result;
        String url = "http://47.97.206.10/api/douyin/get_user_post?user_id=102388086611&max_cursor=0&count=20";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_user_forward_list() throws IOException {
        //获取用户发布的动态列表
        String result;
        String url = "http://47.97.206.10/api/douyin/get_user_forward_list?user_id=102388086611&max_cursor=0&count=20";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_user_following_list() throws IOException {
        //获取用户关注的列表
        String result;
        String url = "http://47.97.206.10/api/douyin/get_user_following_list?user_id=102388086611&max_cursor=0&count=20";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_user_follower_list() throws IOException {
        //获取用户粉丝的列表
        String result;
        String url = "http://47.97.206.10/api/douyin/get_user_follower_list?user_id=102388086611&max_cursor=0&count=20";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_hot_search_list() throws IOException {
        //获取热搜列表
        String result;
        String url = "http://47.97.206.10/api/douyin/get_hot_search_list";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_hot_video_list() throws IOException {
        //获取热门视频列表
        String result;
        String url = "http://47.97.206.10/api/douyin/get_hot_video_list";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_hot_music_list() throws IOException {
        //获取热门音乐列表
        String result;
        String url = "http://47.97.206.10/api/douyin/get_hot_music_list";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }

    @Test(groups = "douyin")
    public void get_hot_positive_energy_list() throws IOException {
        //获取正能量列表
        String result;
        String url = "http://47.97.206.10/api/douyin/get_hot_positive_energy_list";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_hot_category_list() throws IOException {
        //获取热门分类列表
        String result;
        String url = "http://47.97.206.10/api/douyin/get_hot_category_list?cursor=0&count=20";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_general_search_ret() throws IOException {
        //获取综合搜索的结果
        String result;
        String url = "http://47.97.206.10/api/douyin/get_general_search_ret?keyword=美食&offset=0&count=10";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_video_search() throws IOException {
        //获取视频搜索的结果
        String result;
        String url = "http://47.97.206.10/api/douyin/get_video_search?keyword=养生&offset=0&count=10";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_user_search() throws IOException {
        //获取用户搜索的结果
        String result;
        String url = "http://47.97.206.10/api/douyin/get_user_search?keyword=养生&offset=0&count=10";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_video_comment_list() throws IOException {
        //获取评论列表
        String result;
        String url = "http://47.97.206.10/api/douyin/get_video_comment_list?aweme_id=6619905376009587972&offset=0&count=20";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_video_detail() throws IOException {
        //获取视频详情
        String result;
        String url = "http://47.97.206.10/api/douyin/get_video_detail?aweme_id=6645546646287420686";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_music_detail() throws IOException {
        //获取音乐详情
        String result;
        String url = "http://47.97.206.10/api/douyin/get_music_detail?music_id=6673679720980269831";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_music_videos() throws IOException {
        //获取音乐对应的视频列表
        String result;
        String url = "http://47.97.206.10/api/douyin/get_music_videos?music_id=6673679720980269831&cursor=0&count=20";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }

    @Test(groups = "douyin")
    public void get_promotion_list() throws IOException {
        //获取商品橱窗列表
        String result;
        String url = "http://47.97.206.10/api/douyin/get_promotion_list?user_id=105621336289&cursor=0&count=20";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_webcast_room_info() throws IOException {
        //获取直播房间信息
        String result;
        String url = "http://47.97.206.10/api/douyin/get_webcast_room_info?room_id=6731613896211188484";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_webcast_user_info() throws IOException {
        //获取直播用户信息
        String result;
        String url = "http://47.97.206.10/api/douyin/get_webcast_user_info?room_id=6731613896211188484&user_id=108160072764";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
    @Test(groups = "douyin")
    public void get_webcast_ranklist() throws IOException {
        //获取直播本场榜
        String result;
        String url = "http://47.97.206.10/api/douyin/get_webcast_ranklist?room_id=6731613896211188484&anchor_id=108160072764";
        HttpGet get = new HttpGet(url);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        int StatusCode = response.getStatusLine().getStatusCode();
        JSONObject jsonObject = JSONObject.parseObject(result);
        Integer code = jsonObject.getInteger("code");
        if(code == -200){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (code == -1){
            System.out.println(result);
            throw new RuntimeException(result+"\n"+"请求url："+url);
        }
        if (StatusCode != 200){
            System.out.println(result);
            throw new RuntimeException("失败，"+"请求url："+url);
        }
        else{
            System.out.println("成功，"+"请求url："+url);

        }

    }
}