package tugasKuliah.tugaspemrogramankomputer.UASPemKom;

import java.util.Scanner;

public class SoalNomorDua {

    public static void main(String[] args) {

        // Menentukan nilai username dan password yang benar
        String usernameBenar = "Valzi";
        String passwordBenar = "Wh0Ar3you?";

        // Membuat Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan username dan password
        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        // Memeriksa apakah username dan password sesuai
        if (usernameInput.equals(usernameBenar) && passwordInput.equals(passwordBenar)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        scanner.close();

    }
}