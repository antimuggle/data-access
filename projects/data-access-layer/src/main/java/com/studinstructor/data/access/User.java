package com.studinstructor.data.access;

import java.lang.*;
import java.util.*;

public abstract class  User {

    protected volatile List<Email> email;
    protected volatile List<Contact> contacts;
    protected  String username = null;
    protected volatile byte[] profile;
    protected volatile Set<ModeratorValue> modvalue;
    
    public User(){}
    public User (String username){
        
        this.username = username;
    }

    public String getUserName(){
        
        return this.username;
    }
    public byte[] getProfile(){

        //fill logic to get profile pic
        return null;
    }

    public Set<ModeratorValue> getModValue(){

        return this.modvalue;
    }

//to be used by threads and posts
}
 