package com.tester.cases;


import com.tester.dao.TestResultDao;
import com.tester.model.TestResult;
import com.tester.utils.DateUtils;
import com.tester.utils.OhMyEmail;

import com.tester.utils.TsvUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.*;

import static com.tester.utils.DateUtils.PATTERN_DAY;
import static com.tester.utils.DateUtils.PATTERN_STRING_DAY;
import static com.tester.utils.OhMyEmail.SMTP_QQ;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailTest {

    @Autowired
    private TestResultDao testResultDao;


    @Before
    public void before() throws GeneralSecurityException {


        OhMyEmail.config(SMTP_QQ(false), "yaokai@kanda-data.com", "join7Kc2KkWnpTbH");


    }

    static List<String> list = new ArrayList();

    static {
        list = new ArrayList();
        list.add("DouyinShare");
        list.add("DouyinLite");
        list.add("DouyinAwe");
        list.add("Douyin");
        list.add("XHSv1");
        list.add("XHSv2");
        list.add("KaoLa");
        list.add("KuaiShou");
        list.add("JingDong");
        list.add("JingDongCPS");
        list.add("Pdd");
        list.add("Du");
        list.add("Douyinv1");
    }



    @Test
    public void testSendAttach() throws Exception {

        StringBuffer sb = new StringBuffer();
        sb.append("<h1 font=red>你好：</h1>").append("API接口当日统计：").append("<br/>").append("<br/>");
        String reduceDay = DateUtils.parseDate(DateUtils.reduceDays(new Date(), 1), PATTERN_DAY);
        String toDay = DateUtils.parseDate(new Date(), PATTERN_DAY);
        sb.append("时间:").append(reduceDay).append(" 10:00:00~").append(toDay).append(" 09:10:00").append("<br/>").append("<br/>");
        for (String name : list) {
//            //查询单个失败次数
            Integer failCount = testResultDao.findFailCount(name);
//            Random failCount = new Random(1);
            Integer count = testResultDao.findCount(name);

            sb.append(name).append("   调用 ").append(count).append("次   失败 " + failCount + "次").append("<br/>");
        }
        List<TestResult> testResults = testResultDao.find();
        List<String> list = new ArrayList<>();
        List<List<String>> listList = new ArrayList<>();
        list.add("id");
        list.add("start_time");
        list.add("code");
        list.add("item");
        list.add("method");
        list.add("result");
        list.add("url");
        list.add("response");
        listList.add(list);
        for (TestResult testResult : testResults) {
            List<String> testResultlist = new ArrayList<>();
            testResultlist.add(testResult.getId() + "");
            testResultlist.add(testResult.getStart_time());
            testResultlist.add(testResult.getCode());
            testResultlist.add(testResult.getItem());
            testResultlist.add(testResult.getMethod());
            testResultlist.add(testResult.getResult());
            testResultlist.add(testResult.getUrl());
            testResultlist.add(testResult.getResponse());
            listList.add(testResultlist);
        }
        String filePath = "/Users/yaokai/";
        String fileName = "test_result" + DateUtils.parseDate(new Date(), PATTERN_STRING_DAY);

        File csvFile = null;
        File file = new File(filePath);
        if (!file.exists()) {
            file.mkdir();
        }
        // 定义文件名格式并创建
        csvFile = File.createTempFile(fileName, ".tsv", new File(filePath));

        TsvUtil.writeCSV(listList, filePath, fileName, true);

        OhMyEmail.subject("api接口每日任务")
                .from("yaokai")
                .to("1193906652@qq.com , 1782211705@qq.com , yaokai@kanda-data.com")
                .html(sb.toString())
                .attach(new File(filePath + fileName), fileName + ".tsv")
                .send();
    }
}