/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_UTS;

/**
 *
 * @author ASUS VIVOBOOK
 */
public class SmartWatch extends Smartphone {
    int ukuranLayar;
    boolean tahanAir;
    
    public SmartWatch(){
        
    }
    
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }
    
    public boolean isTahanAir(){
        return tahanAir;
    }
    
    public void setTahanAir(boolean tahanAir){
        this.tahanAir = tahanAir;
    }    
}
