package com.studinstructor.data.access;

import java.io.Serializable;
import java.util.*;

public class Department implements Serializable{
 private String deptname = null;
 private Instructor depthead = null;
 private List<Course> courses = Collections.emptyList();
 
 public Department(String name){
    
    this.deptname = name;
}

 public Instructor getDeptHead(){

    return this.depthead;
 }

 public String getDeptName(){

    return this.deptname;
 }

 public List<Course> getCourseList(){

    return Collections.unmodifiableList(this.courses);
 }
 


}
