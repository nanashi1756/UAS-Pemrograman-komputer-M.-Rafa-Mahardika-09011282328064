package tugasKuliah.tugaspemrogramankomputer.UASPemKom;

import java.util.Scanner;

public class SoalNomorLima {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan dua bilangan yang ingin dihitung
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();

        // Menampilkan menu operasi
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        // Meminta pengguna memasukkan pilihan operasi
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = scanner.nextInt();

        // Melakukan operasi sesuai pilihan dan menampilkan hasil
        switch (pilihan) {
            case 1:
                tampilHasil("Penjumlahan", penjumlahan(bilangan1, bilangan2));
                break;
            case 2:
                tampilHasil("Pengurangan", pengurangan(bilangan1, bilangan2));
                break;
            case 3:
                tampilHasil("Perkalian", perkalian(bilangan1, bilangan2));
                break;
            case 4:
                tampilHasil("Pembagian", pembagian(bilangan1, bilangan2));
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }

    // Metode untuk penjumlahan
    public static double penjumlahan(double a, double b) {
        return a + b;
    }

    // Metode untuk pengurangan
    public static double pengurangan(double a, double b) {
        return a - b;
    }

    // Metode untuk perkalian
    public static double perkalian(double a, double b) {
        return a * b;
    }

    // Metode untuk pembagian
    public static double pembagian(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Tidak dapat melakukan pembagian oleh nol.");
            return Double.NaN; // NaN (Not a Number) untuk menandakan hasil tidak valid
        }
    }

    // Metode untuk menampilkan hasil
    public static void tampilHasil(String operasi, double hasil) {
        System.out.println("Hasil " + operasi + ": " + hasil);
        
    }
}