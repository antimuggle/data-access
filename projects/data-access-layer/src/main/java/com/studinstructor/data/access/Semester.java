package com.studinstructor.data.access;

import java.util.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.*;

public class Semester implements Tag,Serializable{
    public LocalDate start = null;
    public LocalDate end = null;

    public Semester(){
        start= LocalDate.now();

        end = LocalDate.now().plusMonths(3);
    }

    public Semester(LocalDate start){
        this.start = start;

        end = start.plusMonths(3);
    }

    public Semester(LocalDate start, LocalDate end){
        this.start = start;
        this.end = end;
    }
    
    public void adjustStart(LocalDate date){
        
        this.start = date;
    }
    
    public void adjustEnd(LocalDate date){

        this.end = date;
    }
}
