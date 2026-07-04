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
public class ElektronikDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SmartWatch sw = new SmartWatch();

        sw.setMerek("Samsung");
        sw.setTahunProduksi(2025);
        sw.setGaransi(2);
        sw.setKapasitasBaterai(500);
        sw.setJumlahKamera(1);
        sw.setUkuranLayar(2);
        sw.setTahanAir(true);

        System.out.println("===== DATA SMARTWATCH =====");
        System.out.println("Merek              : " + sw.getMerek());
        System.out.println("Tahun Produksi     : " + sw.getTahunProduksi());
        System.out.println("Garansi            : " + sw.getGaransi() + " Tahun");
        System.out.println("Kapasitas Baterai  : " + sw.getKapasitasBaterai() + " mAh");
        System.out.println("Jumlah Kamera      : " + sw.getJumlahKamera());
        System.out.println("Ukuran Layar       : " + sw.getUkuranLayar() + " Inch");

        if (sw.isTahanAir()) {
            System.out.println("Tahan Air          : Ya");
        } else {
            System.out.println("Tahan Air          : Tidak");
        }
    }
    
}
