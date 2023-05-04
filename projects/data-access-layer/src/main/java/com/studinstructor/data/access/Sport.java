package com.studinstructor.data.access;

import java.io.Serializable;
import java.util.*;
public class Sport implements Tag,Serializable{
    private String name = null;
    private ForumModerator currentCust = null;
    private List<Student> members = Collections.emptyList();

    public String getName(){

        return this.name;
    }

    public ForumModerator getCurrentModerator(){

        return this.currentCust;
    }
    public List<Student> getMembers(){

        return Collections.unmodifiableList(this.members);
    }


}
