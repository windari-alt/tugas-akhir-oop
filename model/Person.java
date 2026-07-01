/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author windari
 */
public class Person {
    protected String idCard;
    protected String name;

    public Person() {
    }

    public Person(String idCard, String name) {
        this.idCard = idCard;
        this.name = name;
    }
    public String getIdCatd(){
        return idCard;
    }
            
    public String getName() {
        return name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setName(String name) {
        this.name = name;
    }
}