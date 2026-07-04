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
public class Book {
    //The private instance variable
    private final String name;
    private final Author author;
    private double price;
    private int qty;
    
    /** Constructs a book instance with the given author */
    public Book (String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    /** Return the name of this book */
    public String getName(){
        return name;
    }
    /** Return the author instance of this book */
    public Author getAuthor(){
        return author; // return member author, which is an
    }
    /** Return the price */
    public double getPrice(){
        return price;
    }
    /** Sets the price */
    public void setPrice(double price){
        this.price = price;
    }
    /** Return the quantity */
    public int getQty(){
        return qty;
    }
    /** Sets the quantity */
    public void setQty(int qty){
        this.qty = qty;
    }
    /** Return a self-descriptive String */
    public String toString(){
        return " ' " + name + " ' by\t" + author; // author.toString
    }
}
