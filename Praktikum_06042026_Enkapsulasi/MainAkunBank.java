/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : MainAkunBank
 */
package PBO_06042026;

import java.util.Scanner;
public class MainAkunBank {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan No Rekening: ");
        String norek = input.nextLine();
        
        System.out.print("Masukkan Nama Nasabah: ");
        String nama = input.nextLine();
        
        AkunBank akun = new AkunBank(norek, nama);
        
        System.out.println("\nDATA AWAL ");
        System.out.println("No Rekening : " +akun.getNoRekening());
        System.out.println("Nama        : " +akun.getNamaNasabah());
        System.out.println("Saldo Awal  : " +akun.getSaldo());
        
        System.out.print("\nMasukkan jumlah deposit: ");
        double dep = input.nextDouble();
        akun.deposit(dep);
        System.out.println("Saldo setelah deposit: " +akun.getSaldo());
        
        System.out.print("\nMasukkan jumlah withdraw: ");
        double wd = input.nextDouble();
        akun.withdraw(wd);
        System.out.println("Saldo setelah withdraw: " +akun.getSaldo());
    }
}