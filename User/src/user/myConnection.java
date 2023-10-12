/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * MYSQL Connectivity File
 * @author Shrey
 */
public class myConnection {
    static Connection getConnection;
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/USER","root","root@123");
            System.out.println("mySQL Connected");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("mySQL Connection Error");
        }
        return con;
    }
}
