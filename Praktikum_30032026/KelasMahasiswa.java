/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : KelasMahasiswa
 */
package PraktekPBO30;


public class KelasMahasiswa {
    String nim;
    String nama;
    double tugas;
    double uts;
    double uas;
    
    KelasMahasiswa(){
        
    }
    
    KelasMahasiswa(String a, String b, double c, double d, double e){
        nim = a;
        nama = b;
        tugas = c;
        uts = d;
        uas = e;
    }
    
    double hitungNilaiAkhir(){
        return(0.25*tugas) + (0.35*uts) + (0.4*uas);
    }
}
