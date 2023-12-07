package tugasKuliah.tugaspemrogramankomputer.UASPemKom;

import java.util.Scanner;

public class SoalNomorEmpat {
    
    public static void main(String[] args) {

        // Membuat Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk memasukkan bilangan bulat positif
        System.out.print("Masukkan bilangan bulat positif yang ingin difaktorisasi: ");
        int bilangan = scanner.nextInt();

        // Menampilkan faktorisasi bilangan
        System.out.print("Faktorisasi " + bilangan + ": ");
        faktorisasi(bilangan);

        // Menutup Scanner
        scanner.close();
    }

    // Metode untuk melakukan faktorisasi bilangan
    public static void faktorisasi(int bilangan) {
        for (int i = 2; i <= bilangan; i++) {
            while (bilangan % i == 0) {
                System.out.print(i);
                bilangan /= i;
                if (bilangan > 1) {
                    System.out.print(" * ");
                }
            }
        }

        System.out.println(); // Pindah ke baris baru setelah faktorisasi selesai

    }
}