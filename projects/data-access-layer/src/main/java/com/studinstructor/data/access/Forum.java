package com.studinstructor.data.access;

import java.io.Serializable;
import java.util.*;


public  abstract class Forum implements Tag,Serializable{
private int forumId = 0;
private String forumName = null;
private List<String> associatedField = Collections.emptyList();
private User subforumMediator = null;
private int subforumCount = 0; 
private List<SubForum> subforums = Collections.emptyList();

public int getsubforumCount(){

    return this.subforumCount;
}

public List<SubForum> subforums(){

    return this.subforums;
}

public User getForumMediator(){

    return this.subforumMediator;
}
 


public String getForumName(){

    return this.forumName;
}

public List<String> getAssocFields(){

    return this.associatedField;
}
}

