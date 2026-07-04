/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_13042026;

public class KueEnkapsulasi {
    private String namaKue;
    private double harga;
    private int jumlah;
    private String kategori;
    
    public KueEnkapsulasi(String namaKue, double harga, int jumlah, String kategori){
        this.namaKue = namaKue;
        this.harga = harga;
        this.jumlah = jumlah;
        this.kategori = kategori;
    }
    
    public String getNamaKue(){
        return namaKue;
    }
    
    public double getHarga(){
        return harga;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    public String getKategori(){
        return kategori;
    }
    
    public void setNamaKue(String namaKue){
        this.namaKue = namaKue;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
     
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    
    public double hitungTotal(){
        return harga * jumlah;
    }
    
    public void tampilInfo(){
        System.out.println("Nama Kue   : " + namaKue);
        System.out.println("Kategori   : " + kategori);
        System.out.println("Harga      : " + harga);
        System.out.println("Jumlah     : " + jumlah);
        System.out.println("Total Jual : " + hitungTotal());
    }
}
 