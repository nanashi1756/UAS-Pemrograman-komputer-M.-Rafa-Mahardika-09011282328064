package tugasKuliah.tugaspemrogramankomputer.UASPemKom;

import java.util.Scanner;

public class SoalNomorTiga {

    public static void main(String[] args) {

        // Membuat Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai n
        System.out.print("Masukkan nilai n untuk deret Fibonacci: ");
        int n = scanner.nextInt();

        // Menampilkan deret Fibonacci hingga suku ke-n
        System.out.println("Deret Fibonacci hingga suku ke-" + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Menutup Scanner
        scanner.close();
    }

    // Metode untuk menghitung suku ke-n dalam deret Fibonacci
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            
            return fibonacci(n - 1) + fibonacci(n - 2);

        }
    }
}