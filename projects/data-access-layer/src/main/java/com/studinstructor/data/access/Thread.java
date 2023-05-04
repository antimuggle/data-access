package com.studinstructor.data.access;

import java.time.*;
import java.util.*;
import java.io.Serializable;
import java.nio.*;
import java.nio.file.Path;

public abstract class Thread implements Serializable {
    protected int postId = 0;
    protected User creator = null;
    protected volatile int upVotes = 0;
    protected volatile int downVotes = 0;
    protected LocalDate posted = null;
    protected List<Path> files = Collections.emptyList();
    protected String text = null;
    protected List<ReplyThread> replys = Collections.emptyList();
    
    public Thread(){

    }
    public Thread(int postId){

        this.postId = postId;
        
    }

    protected User getCreator(){

        return this.creator;
    }

    protected int getUpvotes(){

        return this.upVotes;
    }

    protected int getDownVotes(){
        
        return this.downVotes;
    }
    //files and text 

    public static synchronized void refresh(){

    }

    public static synchronized void update(){

    }



}

