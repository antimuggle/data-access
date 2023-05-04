package com.studinstructor.data.access;

import java.util.*;

import com.studinstructor.data.access.Moderator;

public interface ForumModerator extends Moderator{
    
    public default void createSubForum(Forum forum){};
    public default void closeSubForum(Forum forum){};
    public default void sendMessage(Student stud){};
    public default void createThreadModerator(Student stud, Thread thread){};
    public default void createSubForumModerator(){};
    public default void createBanner(){};
    public default void setTags(){}; 
    
}