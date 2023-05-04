/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdminTest;
import org.junit.After;
import org.junit.*;
import org.mockito.*;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.studinstructor.data.access.*;
import com.studinstructor.data.access.RegularStudent;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */

public class AdminTest {

        @Test
      public void testconnection(){
          try{
        DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
        String connectionurl = "jdbc:sqlserver://DESKTOP-8KURCBJ\\SQLEXPRESS;trustservercertificate=true;databaseName=stud_instuctor_bridge";
        String password = "letmeIn";
        Student stud = new Student(1);
        stud.setName("timo");
        
        
        Connection conn = DriverManager.getConnection(connectionurl,"Neutron","letmeIn");
        String query = "Insert INTO ADMIN(Name,Occupation) VALUES('anne','sweeper') ";
        PreparedStatement stat = conn.prepareStatement(query);
        boolean f =stat.execute();
        
        DatabaseMetaData dbMetaData= conn.getMetaData();
        System.out.println(f+ stud.getName());
        System.out.println(dbMetaData.supportsResultSetHoldability(ResultSet.HOLD_CURSORS_OVER_COMMIT));
        Assert.assertEquals(ResultSet.HOLD_CURSORS_OVER_COMMIT,dbMetaData.getResultSetHoldability());
        }
        catch(SQLException Sql){
            System.out.println(Sql.toString());
        }
        System.out.println("boyy");
    }
        
   
}
