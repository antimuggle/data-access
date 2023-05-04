package com.studinstructor.data.access;

import java.util.*;
import java.io.Serializable;
import java.time.*;

public abstract class Room implements Serializable{
    protected Instructor owner = null;
    protected Unit unit = null;
    protected List<Student> students = Collections.emptyList();
    protected List<RoomModerator> mediators = Collections.emptyList();
    protected LocalDate formed = null;
    protected LocalDate expires = null;
    protected Room parentroom = null;
    protected List<Post> posts = Collections.emptyList();


    protected Room(Instructor owner){

        this.owner = owner;
        
    }
    public Instructor getOwner(){

        return this.owner;
    }

    public  Unit getUnit(){
        
        return this.unit;
    }
    protected List<Student> getStudentList(){

        return Collections.unmodifiableList(this.students);
    }

    protected List<RoomModerator> getModeratorList(){

        return  Collections.unmodifiableList(this.mediators);
    }

    protected LocalDate created(LocalDate formed){

        return this.formed;
    }

    protected LocalDate expires(LocalDate expires){

        return this.expires;
    }

    protected List<Post> getPosts(){

        return this.posts;
    }

    public static synchronized void refresh(){


    }
    public  synchronized static void update(){

    }




}
