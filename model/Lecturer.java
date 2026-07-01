 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author windari
 */
public class Lecturer extends Person {

    private String nidn;
    private String expertise;

    public Lecturer() {
    }

    public Lecturer(String idCard, String name, String nidn, String expertise) {
        super(idCard, name);
        this.nidn = nidn;
        this.expertise = expertise;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String displayInfo() {
        return "ID Card : " + idCard +
               "\nNama : " + name +
               "\nNIDN : " + nidn +
               "\nKeahlian : " + expertise;
    }

    @Override
    public String toString() {
        return name;
    }
}