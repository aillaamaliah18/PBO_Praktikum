/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_18052026;

/**
 *
 * @author ASUS VIVOBOOK
 */
public class PembayaranTunai extends Pembayaran {
    private double uang;

    public PembayaranTunai(double uang, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.uang = uang;
    }

    public double getUang() {
        return uang;
    }

    public void setUang(double uang) {
        this.uang = uang;
    }
    

    @Override
    public void prosesPembayaran() {
        if(uang>=jumlahBayar){
            double kembalian = uang-jumlahBayar;
            System.out.println("Pembayaran Berhasil!!!");
            System.out.println("Uang Kembalian = Rp. "+kembalian);
        }
        else {
            double kekurangan = jumlahBayar-uang;
            System.out.println("Pembayaran Gagal, uang anda kurang!!");
            System.out.println("Kekurangan Sebesar = Rp. "+kekurangan);
        }
    }
    
    public void CetakStruk(){
        System.out.println("\n---BUKTI PEMBAYARAN TUNAI---");
        System.out.println("ID Transaksi = "+idTransaksi);
        System.out.println("Total pembayaran = Rp. "+jumlahBayar);
        System.out.println("Pembayaran dilakukan secara cash");  
    }
}
