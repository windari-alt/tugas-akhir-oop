/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.CourseDAO;
import java.util.List;
import model.Course;

/**
 *
 * @author Lenovo
 */
public class CourseController {
    private CourseDAO courseDAO = new CourseDAO();
    public List<Course>getAll(){
        return courseDAO.getAll();
    }
}

