/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_25052026;

/**
 *
 * @author ASUS VIVOBOOK
 */
public class MainMusik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek statis
        Gitar gitar = new Gitar(6,"Klasik","Petik");
        Keyboard keyboard = new Keyboard(true,"Yamaha","Elektronik");
       
        System.out.println("\n Alat Musik Gitar");
        gitar.info();
        gitar.mainkan();
        gitar.stem();
        
        System.out.println("\n---Info Alat Musik Keyboard---");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();
    }
    
}
