package com.studinstructor.services;

import java.util.Hashtable;
import java.util.Properties;
import java.sql.*;
import jakarta.annotation.*;
import jakarta.ejb.*;
import javax.naming.*;
import javax.sql.*;

@Remote
@Stateful(name = "myservice")
public class StudentService implements studentservices{
   
private String name;

Context context;
@PostConstruct
public void deploued(){
        try{
            Properties env = new Properties();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
            env.put(Context.PROVIDER_URL, "ldap://localhost:389");
            env.put(Context.SECURITY_AUTHENTICATION,"simple");
            env.put(Context.SECURITY_CREDENTIALS, "secret");

            env.put(Context.SECURITY_PRINCIPAL, "cn=authenticate,dc=schoolname,dc=org");
            context = new InitialContext(env);
            


            Connection con = dSource.getConnection();

String sql = "INSERT INTO ADMIN(Name,Occupation) VALUES('Oyelowo','sweeper')";
    PreparedStatement  stmt = con.prepareStatement(sql);
          stmt.execute();
        } 
        catch(SQLException ex){
        ex.printStackTrace();
            }
        catch(NamingException ex){
            ex.printStackTrace();
        }

}
@Resource(lookup = "jdbc/schoolproj")
private  DataSource dSource;

public String getname(){
 
    return this.name;
}
}
         
 
