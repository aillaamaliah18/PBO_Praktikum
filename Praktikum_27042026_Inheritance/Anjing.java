/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_27042026;

/**
 *
 * @author ASUS VIVOBOOK
 */
public class Anjing extends Hewan{
    public Anjing (String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        System.out.println(nama+"\tberkata Guk!! Guk!!");
    }
    
}
