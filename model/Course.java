/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author windari
 * 
 */
public class Course {
    private String code;
    private String courseName;
    private int sks;
    private int semester;
    
    public Course(String code,
                  String courseName,
                  int sks,
                  int semester){
     this.code=code;
     this.courseName=courseName;
     this.sks=sks;
     this.semester=semester;
    }
    public String toString(){
        return this.courseName;
    }
    public String getCode(){
        return code;
    }
    public String getCourseName(){
        return courseName;
    }
    public int getSKS(){
        return sks;
    }
    public int getSemester(){
    return semester;
    }
}
