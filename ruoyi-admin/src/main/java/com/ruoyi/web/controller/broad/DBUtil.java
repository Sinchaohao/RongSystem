package com.ruoyi.web.controller.broad;

/**
 * @program:控制台-摄像头数据的开发
 * @开发人员：彭茂麒
 * @开发单位：湖南农业大学物联网工程专业
 * @Data:
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    // 定义数据库连接参数
    public static final String DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/broad?useUnicode=true&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&useSSL=true&serverTimezone=GMT%2B8";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "pmq101523";
    // 注册数据库驱动
    static {
        try {
            Class.forName(DRIVER_CLASS_NAME);
        } catch (ClassNotFoundException e) {
            System.out.println("注册失败！");
            e.printStackTrace();
        }
    }

    // 获取连接
    public static Connection getConn() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    // 关闭连接
    public static void closeConn(Connection conn) {
        if (null != conn) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("关闭连接失败！");
                e.printStackTrace();
            }
        }
    }
    //测试
    public static void main(String[] args) throws SQLException {
        System.out.println(DBUtil.getConn());
    }

}
