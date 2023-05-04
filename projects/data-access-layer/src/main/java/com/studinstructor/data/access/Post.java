package com.studinstructor.data.access;

import java.time.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.Serializable;
import java.nio.file.Path;

public class Post implements Serializable{
    public int postId = 0;
    public Room room = null;
    public User Creator = null;
    public LocalDate posted = null;
    public Map<String,Path> files = Collections.emptyMap();
    public String text = null;
    public List<ReplyPost> replys = Collections.emptyList();

    public int getPostId(){

        return this.postId;
    }
    public void setPostId(int postId){

        this.postId =  postId;
    }

    public LocalDate getPostDate(){

        return this.posted;
    }
    public Map<String, Path> getFilePaths(){

        return this.files;
    }

    public void removeReplys(List<ReplyPost> reply){ 
        List<ReplyPost> toremove = null;
        for(ReplyPost  memb : this.replys)
        toremove = reply.stream().filter(f -> f.getPostId() == memb.getPostId()).collect(Collectors.toList());
        this.replys.removeAll(toremove);
    }


    
    
}

