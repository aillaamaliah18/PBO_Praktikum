/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_13042026;

public class MainEmployee {

    public static void main(String[] args) {
        Employee emp = new Employee(1, "Ailla", "Amaliah", 5000000);
        
        System.out.println(emp.toString());
        
        System.out.println("Gaji Bulanan : " + emp.getSalary());
        System.out.println("Gaji Tahunan : " + emp.getAnnualSalary());
        
        emp.raiseSalary(10);
        System.out.println("Setelah Naik Gaji 10% : " + emp.getSalary());
    } 
}
 