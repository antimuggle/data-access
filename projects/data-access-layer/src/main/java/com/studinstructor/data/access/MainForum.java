package com.studinstructor.data.access;

import java.io.Serializable;
import java.util.*;
import java.util.concurrent.*;

public class  MainForum extends Forum implements Serializable{

    public List<SubForum> subforums = Collections.emptyList();
    public List<ForumModerator> moderators = Collections.emptyList();
     
    public List<SubForum> getForumList(){

        return this.subforums;
    }

}
