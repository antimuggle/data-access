package com.studinstructor.data.access;

import java.io.Serializable;

public class Unit implements Serializable {
    private String  uname = null;
    private String unitId = null;
    private  Department dept = null;
    private Course course = null;
    
    public Unit(String uname,String unitId){
        
        this.uname = uname;
        this.unitId = unitId;   

    }

    public String getName(){

        return this.uname;        
    }

    public String getUnitId(){

        return this.unitId;
    }

    public Department getDept(){

        return this.dept;
    }

    public Course getCourse(){

        return this.course;
    }

    public static synchronized void refresh(){

        
    }

    public static synchronized void update(){


    }


}
