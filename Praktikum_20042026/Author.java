/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_20042026;
 
/**
 *
 * @author ASUS VIVOBOOK
 */
public class Author {
    private final String name;
    private String email;
    private final char gender; // 'm' or 'f'
    
    /** Constructs a Author instance with the given inputs */
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    // The public getters and setters for the private instance
    // No stter for name and gender as they are not desigen to
    /** Return the name */
    public String getName(){
        return name;
    }
    /** Return the gender */
    public char getGender(){
        return gender;
    }
    /** Return the email */
    public String getEmail(){
        return email;
    }
    /** Sets the email */
    public void setEmail(String email){
        this.email = email;
    }
    /** Return a self-descriptive String */
    public String toString(){
        return name + " (" + gender + ") at\t" + email;
    }
}
