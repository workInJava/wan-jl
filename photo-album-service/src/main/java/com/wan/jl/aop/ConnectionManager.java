package com.wan.jl.aop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    //声明Connection对象
    private Connection con;
    //驱动程序名
    private static String driver = "com.mysql.jdbc.Driver";
    //URL指向要访问的数据库名mydata
    private static String url = "jdbc:mysql://localhost:3306/sqltestdb";
    //MySQL配置时的用户名
    private  static String user = "root";
    //MySQL配置时的密码
    private static String password = "123456";


    static{
        try{
            Class.forName(driver);
        }catch (Exception e){

        }

    }

    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(url,user,password);
    }

    public static Connection getConnection(String url,String user,String password){
        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
