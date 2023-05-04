package com.studinstructor.data.access;

import java.util.*;
import java.io.Serializable;
import java.time.*;

public class Association implements Tag,Serializable{
    private int assId = 0;
    private String assName = null;
    private LocalDate formed = null;
    private Student currentCust = null;
    private List<Student> members = null;  
    
    

    public int  getId(){
        return(this.assId);
    }

    public void setId(int assId)
    {
        this.assId = assId;
    }
    public String getName(){
        return this.assName; 
    }
    public void setName(String assName){
        this.assName= assName;
    }
    public LocalDate getFormed(){
        return this.formed;
    }
    public void setFormed(LocalDate formed){
        this.formed = formed;   
    }
    public List<Student> getMembers(){

        return Collections.unmodifiableList(this.members);
    }
    public boolean addMembers(List<Student> members){

        return this.members.addAll(members);
    }
    public Student getCurrentCust(){
        return this.currentCust;
    }
    public void setCurrentCust(Student stud){
        this.currentCust = stud;
    }
}
