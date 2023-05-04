package com.studinstructor.data.access;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.Serializable;
import java.time.*;

public class Activity implements Tag,Serializable{
    private String name = null;
    private LocalDate formed = null;
    private  Moderator currentcust = null;
    private List<Student> members = Collections.emptyList();

     public Activity(String name){
        this.name = name;

    }
    public Activity(String name, LocalDate formed){
        this(name);
        this.formed = formed;
    }
    public Activity(String name, LocalDate formed, Student currentcust){
        this.name = name;
        this.formed = formed;
        this.currentcust = currentcust;
    }
    public Activity(String name, LocalDate formed, Student currentcust, List<Student> members){
        this.name = name;
        this.formed = formed;
        this.currentcust = currentcust;
        this.members = members;
    }

    public static boolean persist(){

        return true;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public LocalDate getDateFormed(){
        
        return formed;

    }
    public void setDateFormed(LocalDate dateformed){

        this.formed =dateformed;
    }
    public List<Student> getMembers(){
        
        return this.members;
    }
    public boolean addMembers(List<Student> stud){

        return this.members.addAll(stud);

    }
    public void removeMembers(List<Student> stud){
        List<Student> toremove = null;
        for(Student  memb : this.members)
         toremove = stud.stream().filter(f -> f.getStudId() == memb.getStudId()).collect(Collectors.toList());
        this.members.removeAll(toremove);
    }

    public Moderator currcust(){

        return this.currentcust;
    }
    

}
