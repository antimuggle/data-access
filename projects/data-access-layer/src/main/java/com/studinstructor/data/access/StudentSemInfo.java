package com.studinstructor.data.access;

import java.io.Serializable;
import java.util.*;

public class StudentSemInfo implements Serializable{
    private Student stud = null;
    private Semester sem = null;
    private  List<Unit> currentUnits = Collections.emptyList(); 
    

    public StudentSemInfo(Student stud, Semester sem){

        this.stud = stud;
        this.sem = sem;
    }

    public Student getStudent(){
        return this.stud;
    }

    public void setStudent(Student stud){
    
        this.stud = stud;
    }

    public Semester getSem(){

        return this.sem;
    }

    public void setSem(Semester sem){

        this.sem = sem;
    }

    public List<Unit> getUnits(){

        return Collections.unmodifiableList(this.currentUnits);
    }

    public synchronized void refresh(){

    }

    public synchronized void update(){
        
    }

}
