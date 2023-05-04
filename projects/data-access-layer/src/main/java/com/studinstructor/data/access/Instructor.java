package com.studinstructor.data.access;

import java.io.Serializable;
import java.util.*;

public class Instructor extends User implements Serializable{
    private String id;
    private String name;
    private List<Email> email;
    private List<Contact> contacts; 
    private List<Unit> currteaching;

    public Instructor(String id,String password){
        super();
        //initialise database info

    }

    public void setName(String name){

        this.name = name;
    }
    public String getName(){

        return this.name;
    }


    public void setEmail(List<Email> email){

        this.email = email;
    }
    public boolean getEmail(){

        return this.email.addAll(email);
    }

    public void setContacts(List<Contact> contacts){

        this.contacts.addAll(contacts);
    }

    public List<Unit> getUnits(){

        return Collections.unmodifiableList(this.currteaching);
    }
//ADD ROOM TYPES,
    public static void createRoom(){

    }
    public static void splitRoom(){

    }

    public static void getDocuments(){

    }

    public static void getRoomInfo(){}

}