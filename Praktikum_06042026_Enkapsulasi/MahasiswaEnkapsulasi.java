/*
Nama : AILLA AMALIAH
NIM  : 2501082020
Program : MahasiswaEnkapsulasi
 */
package PBO_06042026;

public class MahasiswaEnkapsulasi {
    private String nama;
    private String nim;
    private String jurusan;
    private int umur;
    private double ipk;
    
    public MahasiswaEnkapsulasi() {
        
    }
    
    public MahasiswaEnkapsulasi(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    
    public MahasiswaEnkapsulasi(String nama, String nim, String jurusan, int umur, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.umur = umur;
        this.ipk = ipk;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getNim() {
        return nim;
    }
    
    public String getJurusan() {
        return jurusan;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public double getIpk() {
        return ipk;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    public void tampilInfo() {
        System.out.println("Nama    : " +nama);
        System.out.println("NIM     : " +nim);
        System.out.println("Jurusan : " +jurusan);
        System.out.println("Umur    : " +umur);
        System.out.println("IPK     : " +ipk);
    }
    
    public String statusKelulusan() {
        if(ipk >= 2.75) {
            return "Lulus";
        } else {
            return "Tidak Lulus";
        }
    }
}