package com.studinstructor.data.access;

import java.util.*;

public class ReplyPost extends Post{
    public Post parent; 
    public List<ReplyPost> children = Collections.emptyList();

    public ReplyPost(){
        super();
    }

    public Post getParent(){

        return this.parent;
    }

    public List<ReplyPost> getChildren(){

        return this.children;
    }

}

