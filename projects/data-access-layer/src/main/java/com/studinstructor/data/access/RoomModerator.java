package com.studinstructor.data.access;

import com.studinstructor.data.access.Moderator;
import java.nio.file.*;
import java.nio.file.Path;
import java.util.*; 
import java.io.*;

public interface RoomModerator extends Moderator{
    
    public default List<Room> getRooms(){
    
        return Collections.emptyList();
    }

    public default boolean submitAssignment(Path file, Room room){

        return false;
    }

    public default List<User> getMembers(Room room){

        return Collections.emptyList();
    } 

    public default List<Student> getMemberInfo(User user){
        
        return Collections.emptyList();
    }
 }