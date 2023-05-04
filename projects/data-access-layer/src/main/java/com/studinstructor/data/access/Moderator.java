package com.studinstructor.data.access;

import java.util.*;

public interface Moderator{
    public String getUserName();
    public default void getBadges(){};
    public default boolean addReply(Thread Thread, ReplyThread thread){
        return false;
    }
    
};