
package Praktikum_13042026;

import java.util.Scanner;
public class MainKueEnkapsulasi {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama Kue   : ");
        String nama = input.nextLine();
        
        System.out.print("Kategori   : ");
        String kategori = input.nextLine();
        
        System.out.print("Harga      : ");
        double harga = input.nextDouble();
        
        System.out.print("Jumlah     : ");
        int jumlah = input.nextInt();
        
        KueEnkapsulasi kue = new KueEnkapsulasi(nama, harga, jumlah, kategori);
        
        System.out.println("\n=== DATA KUE ===");
        kue.tampilInfo();
    } 
}
 