/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.KRS;
import java.util.ArrayList;

/**
 *
 * @author windari
 */
public class Student extends Person{

    public String getCardID() {
        return idCard;
    }
    private String nim;
    private String studyProgram;
    private ArrayList<KRS> krslist;

   public Student(String idCard,
               String name,
               String nim,
               String studyProgram) {

    super(idCard, name);

    this.nim = nim;
    this.studyProgram = studyProgram;

    krslist = new ArrayList<>();
}

 @Override
 public String toString(){
     return this.name;
 }
 public String getNim(){
     return nim;
 }
 public String getName(){
     return name;
 }
 public String getStudyProgram(){
     return studyProgram;
 }
 public void addKRS(KRS krs){
     krslist.add(krs);
 }

    
}
