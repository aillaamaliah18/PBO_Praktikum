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
public class Keyboard extends AlatMusik implements BisaDinyalakan{
    private boolean dayaTersambung;

    public Keyboard(boolean dayaTersambung, String nama, String jenis) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }

    @Override
    public void mainkan() {
        System.out.println(nama+ " dimainkan dengan menekan tuts");
    }

    @Override
    public void stem() {
        System.out.println("Keyboard "+nama+ " distem secara digital");
    }

    @Override
    public void nyalakan() {
        if(cekListrik()){
            System.out.println(nama+ " dinyalakan");
        }else {
            System.out.println(nama+ " tidak bisa dinyalakan");
        }

    }

    @Override
    public void matikan() {
        System.out.println(nama+ " dimatikan");

    }

    @Override
    public boolean cekListrik() {
        return dayaTersambung;
    }
    
    
    
}
