/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : MainMahasiswaEnkapsulasi
 */
package PBO_06042026;

import java.util.Scanner;
public class MainMahasiswaEnkapsulasi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama    : ");
        String nama = input.nextLine();
        
        System.out.print("NIM     : ");
        String nim = input.nextLine();
        
        System.out.print("Jurusan : ");
        String jurusan = input.nextLine();
        
        System.out.print("Umur    : ");
        int umur = input.nextInt();
        
        System.out.print("IPK     : ");
        double ipk = input.nextDouble();
        
        MahasiswaEnkapsulasi mhs = new MahasiswaEnkapsulasi(nama, nim, jurusan, umur, ipk);
        
        System.out.println("\nDATA MAHASISWA");
        mhs.tampilInfo();
        
        System.out.println("Status  : " +mhs.statusKelulusan());
    }
}
