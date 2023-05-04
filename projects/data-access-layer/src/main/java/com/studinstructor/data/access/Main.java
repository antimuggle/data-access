package com.studinstructor.data.access;

import java.io.*;
import java.nio.file.*;

public class Main{
    public static void main(String[] args){
        Admin adm = new Admin();
        Activity act = new Activity("sports");
        Association ass = new Association();
        Club  club = new Club("club");
        Contact cont = new Contact();

        adm.adminId =23;
        adm.name = "salam";

        try{
            
            
             Path filepath = Paths.get("store.txt");

             File   store = new File(filepath.toString());
            FileOutputStream outstream = new FileOutputStream(store);
            ObjectOutputStream out= new ObjectOutputStream(outstream);
        
            out.writeObject(adm);

            out.close();
            outstream.close();
            

        }
        catch(IOException ex){

            System.out.println(ex.toString());

        }

        Admin adm1 = null;

        try{
            
             
 
             Path filepath = Paths.get("store.txt");

             File   store = new File(filepath.toString());

            FileInputStream instream = new FileInputStream(store);
            ObjectInputStream in = new ObjectInputStream(instream);
             
            adm1 = (Admin) in.readObject();
            
            instream.close();
            in.close();

            System.out.println(adm1.name + "  " + adm1.adminId);


        }
        catch(IOException in){
            System.out.println(in.toString());
        }
        catch(ClassNotFoundException ex){

            System.out.println(ex.toString());
        }

    }
    
}
