package com.studinstructor.data.access;

import java.util.*;
import java.io.Serializable;
import java.time.*;

public class Club implements Tag,Serializable{
    private String name = null;
    private LocalDate formed = null;
    private Moderator currentCust = null;

    public Club(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public LocalDate getformed(){

        return this.formed;
    }
    
    public void setFormed(LocalDate formed){

        this.formed = formed;
    }

    public void setCustodian(Moderator cust){

        this.currentCust = cust;
    
    }

    public Moderator getModerator(){

        return this.currentCust;
    }



}
