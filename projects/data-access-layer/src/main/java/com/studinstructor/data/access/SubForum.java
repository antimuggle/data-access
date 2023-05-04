package com.studinstructor.data.access;

import java.io.Serializable;

public class SubForum extends Forum{
    private Forum parent = null;
    private int ForumId = 0;
    
    public Forum getParent(){

        return this.parent;
    }

    public int getForumId(){

        return this.ForumId;
    }

}
