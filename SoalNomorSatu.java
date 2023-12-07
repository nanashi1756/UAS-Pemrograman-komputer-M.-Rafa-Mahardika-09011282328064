package tugasKuliah.tugaspemrogramankomputer.UASPemKom;

import java.util.Scanner;

public class SoalNomorSatu {
    
      public static void main(String[] args) {

        // Membuat Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Input jumlah barang yang dibeli oleh pelanggan
        System.out.print("Masukkan jumlah barang yang dibeli oleh pelanggan: ");
        int jumlahBarang = scanner.nextInt();

        // Input harga per barang
        System.out.print("Masukkan harga per barang: ");
        double hargaPerBarang = scanner.nextDouble();

        // Hitung total harga sebelum diskon
        double totalHarga = jumlahBarang * hargaPerBarang;

        // Hitung diskon berdasarkan jumlah pembelian
        double diskon = 0.0;
        if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            diskon = 0.05; // Diskon 5% untuk pembelian 5-10 barang
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            diskon = 0.10; // Diskon 10% untuk pembelian 11-20 barang
        } else if (jumlahBarang > 20) {
            diskon = 0.20; // Diskon 20% untuk pembelian lebih dari 20 barang
        }

        // Hitung total harga setelah diskon
        double totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon);
        // Menampilkan total harga setelah diskon
        System.out.println("Total harga setelah diskon: " + "Rp" +totalHargaSetelahDiskon);
        
    }
}