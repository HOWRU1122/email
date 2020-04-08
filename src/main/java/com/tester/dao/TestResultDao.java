package com.tester.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tester.db.TestResultDBManger;
import com.tester.model.TestResult;
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
        String sql = "select * from test_result where code != 200 and `start_time` > CONCAT(DATE_SUB(CURDATE(), INTERVAL 1 DAY), ' 10:00:00') and `start_time`< CONCAT(CURDATE(), ' 09:20:00');";
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


    public Integer findFailCount(String name){
        int i = 10;
        try {
            String sql = "select count(id) as numb from test_result where item = ? and code != 200 and `start_time` > CONCAT(DATE_SUB(CURDATE(), INTERVAL 1 DAY), ' 10:00:00') and `start_time`< CONCAT(CURDATE(), ' 09:20:00');";
            conn = TestResultDBManger.getConn();

            ps = (PreparedStatement)conn.prepareStatement(sql);
            ps.setString(1, name);

            System.out.println(ps.toString());
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1));
                i = rs.getInt("numb");


            }


        }catch (Exception e){
            e.printStackTrace();
        }finally{
            //释放资源
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return i;

    }

    public Integer findCount(String name){
        int i = 10;
        try {
            String sql = "select count(id) as numb from test_result where item = ? and `start_time` > CONCAT(DATE_SUB(CURDATE(), INTERVAL 1 DAY), ' 10:00:00') and `start_time`< CONCAT(CURDATE(), ' 09:20:00');";
            conn = TestResultDBManger.getConn();

            ps = (PreparedStatement)conn.prepareStatement(sql);
            ps.setString(1, name);


            rs = ps.executeQuery();
            while(rs.next()){
                i = rs.getInt("numb");
                System.out.println(rs.getInt(1));

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            //释放资源
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return i;

    }

    public Integer findNullCount(String name){
        int i = 10;
        try {
            String sql = "select count(id) as numb from test_result where item = ? and code = 300 and `start_time` > CONCAT(DATE_SUB(CURDATE(), INTERVAL 1 DAY), ' 10:00:00') and `start_time`< CONCAT(CURDATE(), ' 09:20:00');";
            conn = TestResultDBManger.getConn();

            ps = (PreparedStatement)conn.prepareStatement(sql);
            ps.setString(1, name);

            System.out.println(ps.toString());
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1));
                i = rs.getInt("numb");


            }


        }catch (Exception e){
            e.printStackTrace();
        }finally{
            //释放资源
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return i;

    }
    public Integer normalCount(String name){
        int i = 10;
        try {
            String sql = "select count(id) as numb from test_result where item = ? and code = 400 and `start_time` > CONCAT(DATE_SUB(CURDATE(), INTERVAL 1 DAY), ' 10:00:00') and `start_time`< CONCAT(CURDATE(), ' 09:20:00');";
            conn = TestResultDBManger.getConn();

            ps = (PreparedStatement)conn.prepareStatement(sql);
            ps.setString(1, name);

            System.out.println(ps.toString());
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1));
                i = rs.getInt("numb");


            }


        }catch (Exception e){
            e.printStackTrace();
        }finally{
            //释放资源
            if(rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return i;

    }
}