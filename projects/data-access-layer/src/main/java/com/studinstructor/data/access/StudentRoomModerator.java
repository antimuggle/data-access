package com.studinstructor.data.access;

import com.studinstructor.data.access.RoomModerator;
import com.studinstructor.data.access.Student;

public class StudentRoomModerator extends Student implements RoomModerator{
    


    private StudentRoomModerator(Student stud){
        super(stud.getStudId());
        
    }

    protected static synchronized RoomModerator createThreadModerator(Moderator mod,Student assignee, Thread thread){

            StudentRoomModerator newnod=new  StudentRoomModerator(assignee);
        
            return newnod;
    } 

 
}