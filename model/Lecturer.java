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

    private final String nidn;
    private final String expertise;

    public Lecturer(String idCard,
                    String name,
                    String nidn,
                    String expertise) {

        super(idCard, name);

        this.nidn = nidn;
        this.expertise = expertise;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public String getName() {
        return this.name;
    }

    public String getNidn() {
        return nidn;
    }

    public String getExpertise() {
        return expertise;
    }
    
}
