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
public class MainLine {

    public static void main(String[] args) {
        Line line = new Line(1, 2, 4, 6);

        System.out.println(line);
        System.out.println("Panjang garis: " + line.getLength());

        line.setBeginX(3);
        line.setEndY(10);

        System.out.println("Setelah diubah:");
        System.out.println(line);
        System.out.println("Panjang garis: " + line.getLength());
    }
}
