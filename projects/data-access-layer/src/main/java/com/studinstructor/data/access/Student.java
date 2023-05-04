
package com.studinstructor.data.access;

import java.time.*;
import java.io.Serializable;
import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;

enum ModeratorValue{
    THREAD, FORUM, SUBFORUM, ROOM;
}

//provide refresh values static method to refresh serializable values
//provide save static method to commit changes with batch updates

public  class Student extends User implements Serializable, Moderator{
    protected  int studId = 0;
    protected  LocalDate dob = null;
    protected  String courseName = null;
    protected  String name = null;
    protected  List<Club> myclubs = Collections.emptyList();
    protected  List<Sport> mysports = Collections.emptyList();
    protected  List<Activity> myacts = Collections.emptyList();
    protected  List<Association> myass = Collections.emptyList();
    

   public  Student(int studId){
        super();
        this.studId = studId;
        //FILL WITH SQL query
        
    }
    public Student(String username, String Password){
        super(username);
        
    }
//static function to check for at least one cocurricular activity
    protected Student(int studId, LocalDate dob, String courseName, 
                        String username,String name, List<Club> clubs){
        
        super();
        this.username = username;
        this.courseName = getCourse();
        this.name = getName();
        this.addClubs(clubs);

                    
    }


    public int getStudId(){
    
        return this.studId;
    }
    
    public void setStudId(int studId){
    
        this.studId = studId;
    }
    
    public String getCourse(){
    
        return this.courseName;
    }
    
    public void setUserName(String name){
    
        this.username = name;
    }

    public String getName(){
       
        return this.name;
    }
    public void setName(String name){

        this.name = name;
    }

    public List<Club> getClubs(){

        return this.myclubs;
    }

    public void addClubs(List<Club> clubs){
        
        this.myclubs.addAll(clubs);
    }

    public boolean removeClubs(List<Club> clubs){
        List<Club> toremove = null;
        for(Club clb: this.myclubs)
            toremove = clubs.stream().filter(f -> f.getName().equalsIgnoreCase(clb.getName())).collect(Collectors.toList());
        return this.myclubs.removeAll(toremove);
    }
    public List<Sport> getSports(){

        return Collections.unmodifiableList(this.mysports);
    }

    public boolean addSports(List<Sport> sports){
        return this.mysports.addAll(sports);
    }

    public boolean removeSports(List<Sport> sports){
        
        List<Sport> toremove = null;

        for(Sport sport: this.mysports)
            toremove = sports.stream().filter(f -> f.getName().equalsIgnoreCase(sport.getName())).collect(Collectors.toList());
        
        return this.mysports.removeAll(toremove);
    }

    public List<Activity> getActivities(){

        return Collections.unmodifiableList(this.myacts);
    }

    public boolean addActivities(List<Activity> acts){
        
        return this.myacts.addAll(acts);
    }

    public boolean removeActivities(List<Activity> acts){
       
        List<Activity> toremove = null;
        for(Activity activity: this.myacts)
            toremove = acts.stream().filter(f -> f.getName().equalsIgnoreCase(activity.getName())).collect(Collectors.toList());
        return myacts.removeAll(toremove);
    }
//add unmodifiable List as return datatypes
    public List<Association> getAssocs(){

        return Collections.unmodifiableList(this.myass);
    }
    
    public boolean addAssocs(List<Association> ass){
        
        return this.myass.addAll(ass);
    }

    public boolean removeAssocs(List<Association> ass){
      
        List<Association> toremove = null;
        for(Association oneass: this.myass)
            toremove = ass.stream().filter(f -> f.getName().equalsIgnoreCase(oneass.getName())).collect(Collectors.toList());
        return myass.removeAll(toremove);
    }

    protected static synchronized void refresh(){
        //get connections for values
        //override in child class to access more data
    }
    protected static synchronized void update(){

        
    }

}