package com.studinstructor.data.access;

import java.io.Serializable;
import java.util.*;

public class Course implements Serializable{
    private String name = null;
    private List<Unit> units = Collections.emptyList();
    private Instructor hod = null;

    public Course(String name){

        this.name = name;
    }

    public String getCourseName(){
        
        return this.name;
    }

    public List<Unit> getUnitList(){
        return Collections.unmodifiableList(units);
    }

    public Instructor getHod(){

        return this.hod;
    }
    
    
    
}
