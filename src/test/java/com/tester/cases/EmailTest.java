package com.tester.cases;


import com.tester.dao.TestResultDao;
import com.tester.utils.DateUtils;
import com.tester.utils.OhMyEmail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.security.GeneralSecurityException;
import java.util.*;

import static com.tester.utils.DateUtils.PATTERN_DAY;
import static com.tester.utils.OhMyEmail.SMTP_163;


@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailTest {

    @Autowired
    private TestResultDao testResultDao;


    @Before
    public void before() throws GeneralSecurityException {


        OhMyEmail.config(SMTP_163(false), "13750856517@163.com", "VPAUITGNHJFNRVLN");


    }

    @Test
    public void testSendAttach() throws Exception {
        StringBuffer content = new StringBuffer();


        content.append("<h1 font color =red>你好：</h1>").append("本日数据源抓取量监控：").append("<br/>").append("<br/>");
        String toDay = DateUtils.parseDate(new Date(), PATTERN_DAY);
        content.append("时间:").append(toDay).append("<br/>").append("<br/>");

        //用户17788559179
        int size20833 = testResultDao.Size20833();
        StringBuilder detail20833 = testResultDao.Detail20833();
        content.append("<table border=\"5\" style=\"border:solid 1px #E8F2F9;font-size=14px;;font-size:18px;\">");
        content.append("<tr><th align=\"center\">用户17788559179调用次数</th><td align=\"center\">" + size20833 + "</td></tr>");
        content.append("<tr><th align=\"center\">用户17788559179调用详情</th><td align=\"center\">" + detail20833 +"</td></tr>");
        content.append("&nbsp;&nbsp;&nbsp;");
        content.append("</body></html>");

        //用户17816853090
        int size20886 = testResultDao.Size20886();
        StringBuilder detail20886 = testResultDao.Detail20886();
        content.append("<table border=\"5\" style=\"border:solid 1px #E8F2F9;font-size=14px;;font-size:18px;\">");
        content.append("<tr><th align=\"center\">用户17816853090调用次数</th><td align=\"center\">" + size20886 + "</td></tr>");
        content.append("<tr><th align=\"center\">用户17816853090调用详情</th><td align=\"center\">" + detail20886 +"</td></tr>");
        content.append("&nbsp;&nbsp;&nbsp;");
        content.append("</body></html>");

        //用户13250810885
        int size20887 = testResultDao.Size20887();
        StringBuilder detail20887 = testResultDao.Detail20887();
        content.append("<table border=\"5\" style=\"border:solid 1px #E8F2F9;font-size=14px;;font-size:18px;\">");
        content.append("<tr><th align=\"center\">用户13250810885调用次数</th><td align=\"center\">" + size20887 + "</td></tr>");
        content.append("<tr><th align=\"center\">用户13250810885调用详情</th><td align=\"center\">" + detail20887 +"</td></tr>");
        content.append("&nbsp;&nbsp;&nbsp;");
        content.append("</body></html>");

        //用户15958101905
        int size20888 = testResultDao.Size20888();
        StringBuilder detail20888 = testResultDao.Detail20888();
        content.append("<table border=\"5\" style=\"border:solid 1px #E8F2F9;font-size=14px;;font-size:18px;\">");
        content.append("<tr><th align=\"center\">用户15958101905调用次数</th><td align=\"center\">" + size20888 + "</td></tr>");
        content.append("<tr><th align=\"center\">用户15958101905调用详情</th><td align=\"center\">" + detail20888 +"</td></tr>");
        content.append("&nbsp;&nbsp;&nbsp;");
        content.append("</body></html>");

        //用户13957169665
        int size20889 = testResultDao.Size20889();
        StringBuilder detail20889 = testResultDao.Detail20889();
        content.append("<table border=\"5\" style=\"border:solid 1px #E8F2F9;font-size=14px;;font-size:18px;\">");
        content.append("<tr><th align=\"center\">用户13957169665调用次数</th><td align=\"center\">" + size20889 + "</td></tr>");
        content.append("<tr><th align=\"center\">用户13957169665调用详情</th><td align=\"center\">" + detail20889 +"</td></tr>");
        content.append("&nbsp;&nbsp;&nbsp;");
        content.append("</body></html>");

        //用户15990717557
        int size20890 = testResultDao.Size20890();
        StringBuilder detail20890 = testResultDao.Detail20890();
        content.append("<table border=\"5\" style=\"border:solid 1px #E8F2F9;font-size=14px;;font-size:18px;\">");
        content.append("<tr><th align=\"center\">用户15990717557调用次数</th><td align=\"center\">" + size20890 + "</td></tr>");
        content.append("<tr><th align=\"center\">用户15990717557调用详情</th><td align=\"center\">" + detail20890 +"</td></tr>");
        content.append("&nbsp;&nbsp;&nbsp;");
        content.append("</body></html>");

        //用户18867517074
        int size20891 = testResultDao.Size20891();
        StringBuilder detail20891 = testResultDao.Detail20891();
        content.append("<table border=\"5\" style=\"border:solid 1px #E8F2F9;font-size=14px;;font-size:18px;\">");
        content.append("<tr><th align=\"center\">用户18867517074调用次数</th><td align=\"center\">" + size20891 + "</td></tr>");
        content.append("<tr><th align=\"center\">用户18867517074调用详情</th><td align=\"center\">" + detail20891 +"</td></tr>");
        content.append("&nbsp;&nbsp;&nbsp;");
        content.append("</body></html>");

        //用户18757558032
        int size20892 = testResultDao.Size20892();
        StringBuilder detail20892 = testResultDao.Detail20892();
        content.append("<table border=\"5\" style=\"border:solid 1px #E8F2F9;font-size=14px;;font-size:18px;\">");
        content.append("<tr><th align=\"center\">用户18757558032调用次数</th><td align=\"center\">" + size20892 + "</td></tr>");
        content.append("<tr><th align=\"center\">用户18757558032调用详情</th><td align=\"center\">" + detail20892 +"</td></tr>");
        content.append("&nbsp;&nbsp;&nbsp;");
        content.append("</body></html>");

        //用户13031013505
        int size20893 = testResultDao.Size20893();
        StringBuilder detail20893 = testResultDao.Detail20893();
        content.append("<table border=\"5\" style=\"border:solid 1px #E8F2F9;font-size=14px;;font-size:18px;\">");
        content.append("<tr><th align=\"center\">用户13031013505调用次数</th><td align=\"center\">" + size20893 + "</td></tr>");
        content.append("<tr><th align=\"center\">用户13031013505调用详情</th><td align=\"center\">" + detail20893 +"</td></tr>");
        content.append("&nbsp;&nbsp;&nbsp;");
        content.append("</body></html>");

        //用户16601890722
        int size20877 = testResultDao.Size20877();
        StringBuilder detail20877 = testResultDao.Detail20877();
        content.append("<table border=\"5\" style=\"border:solid 1px #E8F2F9;font-size=14px;;font-size:18px;\">");
        content.append("<tr><th align=\"center\">用户16601890722调用次数</th><td align=\"center\">" + size20877 + "</td></tr>");
        content.append("<tr><th align=\"center\">用户16601890722调用详情</th><td align=\"center\">" + detail20877 +"</td></tr>");
        content.append("&nbsp;&nbsp;&nbsp;");
        content.append("</body></html>");


        //发送邮件

        OhMyEmail.subject("森马监控")
                .from("森马监控")
                //.to("yanglei@kanda-data.com , yaokai@kanda-data.com")
                .to("yaokai@kanda-data.com")
                .html(content.toString())
                .send();

    }
}


