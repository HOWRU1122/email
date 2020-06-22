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

import javax.lang.model.type.ArrayType;
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
        list.add("Douyinv1");
        list.add("DouyinIOS");
        list.add("XHSv1");
        list.add("XHSv2");
        list.add("KuaiShouV1");
        list.add("KuaiShouV2");
        list.add("JingDong");
        list.add("JingDongCPS");
        list.add("KaoLa");
        list.add("Pdd");
        list.add("Du");
        list.add("TB");
        list.add("TBAPP");
        list.add("TBV");
        list.add("MeiTuanV2");
        list.add("Sumaitong");
        list.add("Alibaba");
        list.add("Shopee");
    }



    @Test
    public void testSendAttach() throws Exception {

        StringBuffer content = new StringBuffer();
        content.append("<h1 font=red>你好：</h1>").append("API接口当日统计：").append("<br/>").append("<br/>");
        String reduceDay = DateUtils.parseDate(DateUtils.reduceDays(new Date(), 1), PATTERN_DAY);
        String toDay = DateUtils.parseDate(new Date(), PATTERN_DAY);
        content.append("时间:").append(reduceDay).append(" 10:00:00~").append(toDay).append(" 09:10:00").append("<br/>").append("<br/>");
        for (String name : list) {
            Integer count = testResultDao.findCount(name);

            Integer failCount = testResultDao.findFailCount(name);

            Integer NUllCount = testResultDao.findNullCount(name);

            Integer normalCount = testResultDao.normalCount(name);

            content.append("<table border=\"5\" style=\"border:solid 1px #E8F2F9;font-size=14px;;font-size:18px;\">");
            content.append("<tr style=\"background-color: #428BCA; color:#ffffff\"><th align=\"center\">"+name+"</th></tr>");
            content.append("<tr><th align=\"center\">调用次数</th><td align=\"center\">"+count+"</td></tr>");
            content.append("<tr><th align=\"center\">失败次数</th><td align=\"center\">"+failCount+"</td></tr>");
            content.append("<tr><th align=\"center\">为空次数</th><td align=\"center\">"+NUllCount+"</td></tr>");
            content.append("<tr><th align=\"center\">返回结果失败属于正常情况次数</th><td align=\"center\">"+normalCount+"</td></tr>");
            content.append("</table>");
            content.append("&nbsp;&nbsp;&nbsp;");
            content.append("</body></html>");
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
                //.to("wangzhou@kanda-data.com , linyuanying@kanda-data.com , yaokai@kanda-data.com , jinzewei@kanda-data.com")
                .to("yaokai@kanda-data.com")
                .html(content.toString())
                .attach(new File(filePath + fileName), fileName + ".tsv")
                .send();
    }
}