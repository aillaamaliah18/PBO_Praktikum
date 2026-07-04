/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : MainMahasiswa
Tanggal : 30 Maret 2026
 */
package PraktekPBO30;

import java.util.Scanner;
public class MainMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("NIM = ");
        String nim = input.nextLine();
        
        System.out.print("Nama = ");
        String nama = input.nextLine();
        
        System.out.print("Nilai Tugas = ");
        double tugas = input.nextDouble();
        
        System.out.print("Nilai UTS = ");
        double uts = input.nextDouble();
        
        System.out.print("Nilai UAS = ");
        double uas = input.nextDouble();

        KelasMahasiswa mhs = new KelasMahasiswa(nim, nama, tugas, uts, uas);
            
        System.out.println("Data Mahasiswa");
        System.out.println("NIM   = " +mhs.nim);
        System.out.println("Nama  = " +mhs.nama);
        System.out.println("Nilai Tugas = " +mhs.tugas);
        System.out.println("Nilai UTS   = " +mhs.uts);
        System.out.println("Nilai UAS   = " +mhs.uas);
        System.out.println("Nilai Akhir = " +mhs.hitungNilaiAkhir());
    }
    
}
