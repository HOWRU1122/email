package com.tester.db;

import java.sql.*;

public class TestResultDBManger{
    private static Connection conn = null;
    private  static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public static Connection getConn() {
        String url = "jdbc:mysql://47.111.14.225:3306/jiradb?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try {
                conn = (Connection) DriverManager.getConnection(url, "jirauser", "jira");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void close() {
        try {
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.getMessage();
        }
    }

}