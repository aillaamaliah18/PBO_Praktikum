/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : PersegiPanjangEnkapsulasi
 */
package PBO_06042026;

public class PersegiPanjangEnkapsulasi {
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;
    
    public PersegiPanjangEnkapsulasi(){
        jumlahObjek++;
    }
    
    public PersegiPanjangEnkapsulasi(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        jumlahObjek++;
    }
    
    public void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
    
    public int getPanjang(){
        return panjang;
    }
    
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    public int getLebar(){
        return lebar;
    }
    
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
    
    public int hitungLuas(){
        return panjang * lebar;
    }
    
    public int hitungKeliling(){
        return 2 * (panjang + lebar);
    }
}
