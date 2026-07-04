/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : PersegiPanjang
 */
package PraktekPBO30;


public class PersegiPanjang {
    int panjang; //atribut
    int lebar;
    
    //konstruktor
    PersegiPanjang(){
        
    }
    
    PersegiPanjang(int a,int b){
        panjang = a;
        lebar = b;
    }
    
    //method
    int hitungLuas(){
        return (panjang*lebar);
    }
    
    int hitungKeliling(){
        return (2* (panjang*lebar));
    }
}
