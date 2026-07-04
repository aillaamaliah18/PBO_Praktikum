package Praktikum_18052026;

import java.util.Scanner;
public class MainPembayaran {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pembayaran pembayaran = null;

        System.out.println("===== Sistem Pembayaran Toko Online =====");

        System.out.print("Masukkan ID Transaksi : ");
        String id = scanner.nextLine();

        System.out.print("Masukkan Jumlah Bayar : ");
        double jumlah = scanner.nextDouble();

        System.out.println("\nPilih Metode Pembayaran");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.println("4. Tunai");
        System.out.print("Pilihan Anda : ");

        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {

            case 1:
                System.out.print("Masukkan Nama Bank : ");
                String bank = scanner.nextLine();
                pembayaran = new PembayaranTransfer(bank, jumlah, id);
                break;

            case 2:
                System.out.print("Masukkan Nomor Kartu Kredit : ");
                String noKartu = scanner.nextLine();
                pembayaran = new PembayaranKartuKredit(noKartu, jumlah, id);
                break;

            case 3:
                System.out.print("Masukkan Nama E-Wallet : ");
                String ewallet = scanner.nextLine();
                pembayaran = new PembayaranEWallet(ewallet, jumlah, id);
                break;

            case 4:
                System.out.print("Masukkan Jumlah Uang Tunai : ");
                double uangTunai = scanner.nextDouble();
                pembayaran = new PembayaranTunai(uangTunai, jumlah, id);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
        }

        System.out.println("\n===== Bukti Pembayaran =====");
        pembayaran.prosesPembayaran();
    }
}