/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLConnection {
    private Connection c ;
    private Statement s;
    private PreparedStatement ps ;
   public static Connection getConnection() {
       var host = "jdbc:mysql://localhost:3306/school"+"&useUnicode=true&characterEncoding=UTF-8";
       var username = "root";
       var password = "";
       String connectionString = "jdbc:mysql://localhost/" + "school"+ "?user=" + "root" + "&password=" + "" + "&useUnicode=true&characterEncoding=UTF-8";
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection(connectionString);
            //conn = DriverManager.getConnection(host,username,password);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
   
    public static void main(String[] args) {
        getConnection();
    }
}

