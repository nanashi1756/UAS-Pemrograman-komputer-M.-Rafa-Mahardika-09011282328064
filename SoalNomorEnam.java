package tugasKuliah.tugaspemrogramankomputer.UASPemKom;

import java.util.Scanner;

public class SoalNomorEnam {

    public static void main(String[] args) {

        // Membuat Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan kata atau frase
        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        // Memanggil metode untuk mengecek apakah palindrom atau tidak
        if (isPalindrom(input)) {
            System.out.println("'" + input + "' adalah palindrom.");
        } else {
            System.out.println("'" + input + "' bukan palindrom.");
        }

        // Menutup Scanner
        scanner.close();
    }

    // Metode untuk mengecek apakah suatu kata atau frase adalah palindrom
    private static boolean isPalindrom(String str) {
        // Menghapus spasi dan mengubah huruf menjadi huruf kecil
        str = str.replaceAll("\\s", "").toLowerCase();
        // Memeriksa palindrom dengan menggunakan dua pointer
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
        
    }
}