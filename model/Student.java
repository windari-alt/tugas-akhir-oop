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
public class Student extends Person {

    
    public Student(){
        this.krslist = new ArrayList<>();
    }

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
        this.krslist = new ArrayList<>();
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

    
    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public void setName(String name) {
        this.name = name; // Mengubah variabel name dari class Person parent
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setNama(String string) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public String getNama() {
    return this.name;
    }
}
