/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.oop.studentDB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Vivobook
 */
public class StudentDB {
    
    static Connection con;
    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost/studentifo";
    static String uname = "root";
    static String pass = "1234";
    
    
    public static Connection getConnection()throws Exception{
        if(con == null){
            Class.forName(driver);
            con = DriverManager.getConnection(url, uname, pass);
        }
        return con;
        
    }
    
}
