/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_27042026;

/**
 *
 * @author ASUS VIVOBOOK
 */
public class PesawatMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pesawat p1 = new Pesawat("Boeing", 2010, true, 40);
        
        System.out.println("Nama = " + p1.getNama());
        System.out.println("Tahun Produksi = " + p1.getTahunProduksi());
        System.out.println("Muatan = " + p1.getMuatan());
        System.out.println("Kategori = " + p1.kategori(p1.getMuatan()));
        p1.cetak();
    }
    
}