/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_08062026;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS VIVOBOOK
 */
public class CekAngkaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner input = new Scanner (System.in);
        try {
        System.out.print("Masukkan pembilang = ");
        a = input.nextInt();
        System.out.print("Masukkan penyebut = ");
        b = input.nextInt();
        int hasil = a/b;
        System.out.println("Hasil pembagi = "+hasil); 
        } catch(InputMismatchException ex){
            System.out.println("Harus input angka");
        } catch(ArithmeticException e){
            System.out.println("Tidak boleh ada pembagi dengan 0");
        } finally{
            System.out.println("Pengecekkan angka sukses");
        }
    }
    
}
