/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.studinstructor.services;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.arquillian.container.test.api.*;
import jakarta.annotation.*;
import jakarta.ejb.*;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.naming.*;
import java.util.*;

/**
 *
 * @author Munga
 */
@RunWith(Arquillian.class)
@RunAsClient
public class StudentServiceTest {
  
Context context;

    @Deployment
    public static JavaArchive createDeployment(){


        
        System.out.println("started");

        /*
         JavaArchive arch = ShrinkWrap.createFromZipFile(JavaArchive.class, new File("C:/Users/ADMIN/Documents/data-access/projects/data-access-layer/target/data-access-layer-1.1.0.jar"));
        /*  MavenResolvedArtifact arifact = Maven.resolver().loadPomFromFile("C:/Users/ADMIN/Documets/data-access/ejbs/pom.xml").resolve().withoutTransitivity().asSingleResolvedArtifact();
        
         /*
        File[] file = Maven.resolver().loadPomFromFile(new File("C:/Users/ADMIN/Documets/data-access/ejbs/pom.xml")).importDependencies(ScopeType.IMPORT,ScopeType.TEST,ScopeType.PROVIDED).resolve().withTransitivity().asFile();
        Archive arch = ShrinkWrap.create(JavaArchive.class).;
        System.out
        /**/ 
        JavaArchive arch = ShrinkWrap.create(JavaArchive.class, "myjar.jar").addPackage(StudentService.class.getPackage()).addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml").addAsManifestResource(EmptyAsset.INSTANCE, "ejb-jar.xml");
        System.out.println(arch.toString(true));
        /*JavaArchive newjar = ShrinkWrap.create(ZipImporter.class,"myjar.jar").importFrom(new File("c:/Users/ADMIN/Documents/data-access/projects/data-access-layer/target/data-access-layer-1.1.0.jar")).as(JavaArchive.class);

        System.out.println(arch.toString());
        */
        
        return arch;
    }

    @EJB
    private StudentService stu;

    private static String modulename;

    public StudentServiceTest() {
    } 
     
    @BeforeClass
    public static void setUpClass() {
    
    
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    @Before
    public void setUp() {
       
    }
     
    
    @After
    public void tearDown() {
    }
    @PostConstruct
    private void init(){

        try{
         
            Hashtable<String, Object> env = new Hashtable<>();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
            env.put(Context.PROVIDER_URL, "ldap://localhost:389");
            env.put(Context.SECURITY_AUTHENTICATION,"simple");
            env.put(Context.SECURITY_CREDENTIALS, "secret");
            env.put(Context.SECURITY_PRINCIPAL, "cn=authenticate,dc=schoolname,dc=org");
            
    
            Context context = new InitialContext(env);
            System.out.println("connected");
            context = new InitialContext(env);
    
      
    }
    
    catch(NamingException ex){
        ex.printStackTrace();
    }
    }

    /**
     * Test of deploued method, of class StudentService.
     */
@Test
public void mytest(){

    stu.deploued();
    
}  
}