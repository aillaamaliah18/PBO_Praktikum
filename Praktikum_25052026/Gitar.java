/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_25052026;

/**
 *
 * @author ASUS VIVOBOOK
 */
public class Gitar extends AlatMusik {
    private int jumlahSenar;

    public Gitar(int jumlahSenar, String nama, String jenis) {
        super(nama, jenis);
        this.jumlahSenar = jumlahSenar;
    }
    
    @Override
    public void mainkan(){
        System.out.println(nama+" dipetik dengan "+jumlahSenar+ " senar. ");
    }

    @Override
    public void stem() {
        System.out.println(" Menyetem gitar "+nama+ " dilakukan manual ");
    }

    public int getJumlahSenar() {
        return jumlahSenar;
    }
     
}
