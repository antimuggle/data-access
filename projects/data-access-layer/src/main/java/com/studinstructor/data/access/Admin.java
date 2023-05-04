package com.studinstructor.data.access;

import java.io.Serializable;
import java.lang.*;

public class Admin extends User implements Serializable{
   public int adminId = 0;
   public String name = null;
   public String occupation = null; 

   public Admin(){

      super();
   }



   public static void createThreadModerator(){

   }
   public static void createForumModerator(){

   }
   public static void evokeModerator(){

   }
   public static void  createBanner(){

   }
   public static void assignForum(){

   };
   public static void deassigrForum(){

   };
   public static void closeForum(){
      
   }

   
}
