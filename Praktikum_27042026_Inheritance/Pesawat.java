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
public class Pesawat extends Udara {
    private int muatan;
    
    public int getMuatan(){
        return muatan;
    }
    
    public void setMuatan(int muatan){
        this.muatan = muatan;
    }
    
    public Pesawat(){
    
    }
    
    public Pesawat(String nama, int tahunProduksi, boolean mesin, int muatan){
    
    }
    
    public void reset(String nama, int tahunProduksi, boolean mesin, int muatan){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }
    
    public String kategori(int muatan){
        if (muatan<=50)
            return "Bobot Kecil";
        else if (muatan<=100)
            return "Bobot Menengah";
        else
            return "Bobot Besar";
    }
}
