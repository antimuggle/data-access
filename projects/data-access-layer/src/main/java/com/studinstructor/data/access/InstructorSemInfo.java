package com.studinstructor.data.access;

import java.io.Serializable;
import java.util.*;

public class InstructorSemInfo implements Serializable{
    private Instructor inst = null;
    private Semester sem = null;
    private List<Unit> unitsTaught;

    public InstructorSemInfo(Instructor inst, Semester sem){

        this.inst = inst;
        this.sem = sem;
    }

    public Instructor getInstructor(){
        return this.inst;
    }

    public void setInstructor(Instructor inst){
    
        this.inst = inst;
    }

    public Semester getSem(){

        return this.sem;
    }

    public void setSem(Semester sem){

        this.sem = sem;
    }

    public List<Unit> getUnits(){

        return Collections.unmodifiableList(this.unitsTaught);
    }

}
