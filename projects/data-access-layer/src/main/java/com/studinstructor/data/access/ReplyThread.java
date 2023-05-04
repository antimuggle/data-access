package com.studinstructor.data.access;

import java.util.Collections;
import java.util.*;

public class ReplyThread extends Thread{
    public ProblemThread parent = null; 
    public List<ReplyThread> children = Collections.emptyList();

    public ReplyThread(){
        super();
    }

    public ProblemThread getParent(){

        return this.parent;
    }

    public List<ReplyThread> getChildren(){

        return this.children;
    }

}
