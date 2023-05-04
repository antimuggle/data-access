package com.studinstructor.data.access;

import java.io.Serializable;
import java.util.*;

enum ThreadState{
    Closed, Open, Pending;

}
public class ProblemThread extends Thread implements Tag{
    private ReplyThread solution = null;
    private ThreadState state = null;
    private String title = null;
    
    public ProblemThread(){
        super();
    }

    public ReplyThread getSolution(){

        return this.solution;
    }

    public ThreadState getThreadState(){

        return this.state;
    }

    public String getTitle(){

        return this.title;
    }
    
}

