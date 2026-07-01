/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Course;

/**
 *
 * @author windzri
 */
public    class KRS {
    private  Course  Course;
    private  double  score;
    private  String  grade;
    private Lecturer lecturer;
    private int semester;
    
    public KRS(Course course, double score) {
        this.Course = course;
        this.score = score;
        this.grade = setGrade();
    }
    public void setLecturer(Lecturer lecturer){
        this.lecturer = lecturer;
    }
    public void setSemester(int semester){
        this.semester = semester;
    }
    public Lecturer getLecturer(){
        return lecturer;
    }
    public Course getCourse(){
        return Course;
    }
    public double getScore(){
        return score;
    }
    public String getGrade(){
        return grade;
    }

    private String setGrade() {
        if (score >=85)
            return "A";
        else if (score >= 75)
            return "B";
        else if (score >= 60)
            return "C";
        else 
            return "D";        
    }
}
