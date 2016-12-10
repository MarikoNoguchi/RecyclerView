package edu.mnstate.cw3967me.recyclerview;

/**
 * Created by marikonoguchi on 11/9/16.
 */
public class Student {
    private String id, name, gpa;

    public Student(){

    }

    public Student(String id, String name, String gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGpa(){
        return gpa;
    }

    public void setGpa(String gpa){
        this.gpa = gpa;
    }
}
