/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_20042026;
 
public class MainBook {

    public static void main(String[] args) {
        //  We need an author instance to create a book instance
        Author Rin = new Author("Rinaldi Munir", "rinaldi@gmail.com", 'm');
        System.out.println(Rin); //Author's to String()
        //Rinaldi Munor (m) at rinaldi@gmail.com
        
        //Test Book's constructor and toString()
        Book dummyBook = new Book("Algoritma dan Pemrograman", Rin, 98000, 99);
        System.out.println(dummyBook); //Book's toString
        
        //Test Setters and Getters
        dummyBook.setPrice(120000);
        dummyBook.setQty(88);
        System.out.println("name is: " + dummyBook.getName());
        //name is: Algoritma and Pemrograman
        System.out.println("price is: " + dummyBook.getPrice());
        //price is: 120000
        System.out.println("qty is: " + dummyBook.getQty());
        //qty is: 88
        System.out.println("author is: " + dummyBook.getAuthor());
        //author is: Rinaldi Munir (m) at rinaldi@gmail.com
        System.out.println("author's name is: " + dummyBook.getAuthor().getName());
        //author's name is: Rinaldi Munir
        System.out.println("author's email is: " + dummyBook.getAuthor().getEmail());
        //author's email is: rinaldi@gmail.com
        System.out.println("author's gender is: " + dummyBook.getAuthor().getGender());
        //author's gender is: m
        
        Book moreDummyBook = new Book("Java for more dummies", new Author("Peter Lee", "peter@nowhere.com", 'm'),19.99, 8);
        System.out.println(moreDummyBook); //Book's toString()
    }
    
}
