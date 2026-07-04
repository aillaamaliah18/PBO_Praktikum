/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : MainPersegiPanjangEnkapsulasi
 */
package PBO_06042026;

import java.util.Scanner;
public class MainPersegiPanjangEnkapsulasi {

    public static void main(String[] args) {
        // objek pertama
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        pp1.setPanjang(20);
        pp1.setLebar(10);

        System.out.println("Objek Persegi Panjang Pertama");
        System.out.println("Panjang = " +pp1.getPanjang());
        System.out.println("Lebar = " +pp1.getLebar());
        System.out.println("Luas = " +pp1.hitungLuas());
        System.out.println("Keliling = " +pp1.hitungKeliling());
        System.out.println("Jumlah objek = " +PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        // objek kedua
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(10, 5);

        System.out.println("\nObjek Persegi Panjang Kedua");
        System.out.println("Panjang = " +pp2.getPanjang());
        System.out.println("Lebar = " +pp2.getLebar());
        System.out.println("Luas = " +pp2.hitungLuas());
        System.out.println("Keliling = " +pp2.hitungKeliling());
        System.out.println("Jumlah objek = " +PersegiPanjangEnkapsulasi.getJumlahObjek());
        
        // objek ketiga
        Scanner input = new Scanner(System.in);
        System.out.println("\nObjek Persegi Panjang Ketiga");
        System.out.print("Panjang = ");
        int pj = input.nextInt();
        System.out.print("Lebar = ");
        int lb = input.nextInt();

        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(pj, lb);
        System.out.println("Luas = " +pp3.hitungLuas());
        System.out.println("Keliling = " +pp3.hitungKeliling());
        System.out.println("Jumlah objek = " +PersegiPanjangEnkapsulasi.getJumlahObjek());
    }
}