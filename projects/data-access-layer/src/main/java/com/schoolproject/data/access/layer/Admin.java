/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.schoolproject.data.access.layer;
import java.sql.*;
import javax.transaction.*;

/**
 *
 * @author ADMIN
 */
public class Admin {
    public static void main(String[] args){
         try{
        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        String connectionurl = "jdbc:sqlserver://DESKTOP-8KURCBJ\\SQLEXPRESS;trustservercertificate=true;databaseName=stud_instuctor_bridge";
        String password = "letmeIn";
        Connection conn = DriverManager.getConnection(connectionurl,"Neutron","letmeIn");
        String query = "Insert INTO ADMIN(Name,Occupation) VALUES('anne','sweeper') ";
        PreparedStatement stat = conn.prepareStatement(query);
        boolean f =stat.execute();
        
        DatabaseMetaData dbMetaData= conn.getMetaData();
        System.out.println(f);
        System.out.println(dbMetaData.supportsResultSetHoldability(ResultSet.HOLD_CURSORS_OVER_COMMIT));
        System.out.println(dbMetaData.getResultSetHoldability());
        }
        catch(SQLException Sql){
            System.out.println(Sql.toString());
        }
        System.out.println("boyy");
    }
}
