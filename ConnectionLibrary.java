/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;

/**
 *
 * @author Ruvinya
 */
public class ConnectionLibrary {

    public static Connection getCon() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost/lmsdb","root","");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
