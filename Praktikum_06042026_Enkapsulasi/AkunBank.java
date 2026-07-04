/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : AkunBank
 */
package PBO_06042026;

public class AkunBank {
    private String noRekening;
    private String namaNasabah;
    private double saldo;
    
    public AkunBank(String norek, String nama){
        noRekening = norek;
        namaNasabah = nama;
        saldo = 1000000;
    }
    
    public String getNoRekening(){
        return noRekening;
    }
    
    public String getNamaNasabah(){
        return namaNasabah;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void deposit(double jumlah){
        saldo = saldo + jumlah;
        System.out.println("Deposit berhasil: " +jumlah);
    }
    
    public void withdraw(double jumlah){
        if(jumlah > saldo){
            System.out.println("Saldo tidak cukup!");
        } else {
            saldo = saldo - jumlah;
            System.out.println("Withdraw berhasil: " +jumlah);
        }
    }
}