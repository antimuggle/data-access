package com.studinstructor.data.access;

import com.studinstructor.data.access.Student;
import com.studinstructor.data.access.*;

public class StudentThreadModerator extends Student implements ThreadModerator{
    


    private StudentThreadModerator(Student stud){
        
        super(stud.getStudId());
        
    }

    protected static synchronized StudentThreadModerator createThreadModerator(ForumModerator mod,Student assignee, Thread thread){

            StudentThreadModerator newnod= new StudentThreadModerator(assignee);
        
            return newnod;
    } 

}