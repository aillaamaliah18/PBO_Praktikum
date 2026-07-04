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
public class MainPoint {

    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("P1 = " + p1);
        System.out.println("P2 = " + p2);

        System.out.println("Jarak ke (0,0): " + p1.distance());
        System.out.println("Jarak ke (6,8): " + p1.distance(6, 8));
        System.out.println("Jarak ke P2   : " + p1.distance(p2));
    }
}
