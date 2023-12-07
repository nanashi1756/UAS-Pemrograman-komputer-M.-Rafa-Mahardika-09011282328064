package tugasKuliah.tugaspemrogramankomputer.UASPemKom;

import java.util.Scanner;

public class SoalNomorDelapan {
    private String username;
    private String password;
    private boolean isActive;

    public SoalNomorDelapan(String username, String password) {
        this.username = username;
        this.password = password;
        this.isActive = false; // Awal mula akun dianggap tidak aktif saat dibuat
    }

    // Method untuk mengecek kebenaran username dan password
    public boolean checkCredentials(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    // Method untuk mengaktifkan akun
    public void activateAccount() {
        this.isActive = true;
        System.out.println("Akun " + username + " berhasil diaktifkan.");
    }

    // Method untuk menonaktifkan akun
    public void deactivateAccount() {
        this.isActive = false;
        System.out.println("Akun " + username + " berhasil dinonaktifkan.");
    }

    // Method untuk mendapatkan status akun
    public boolean isActive() {
        return isActive;
    }

    // Method untuk mendapatkan username
    public String getUsername() {
        return username;
    }

    // Method untuk mendapatkan password
    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Contoh penggunaan
        SoalNomorDelapan User1 = new SoalNomorDelapan("Valzi", "Wh0Ar3you?");
        System.out.println("Username : " + User1.getUsername());

        // Meminta inputan username dan password dari pengguna
        System.out.print("Masukkan username : ");
        String inputUsername = scanner.next();
        System.out.print("Masukkan password : ");
        String inputPassword = scanner.next();

        // Memeriksa kebenaran username dan password
        if (User1.checkCredentials(inputUsername, inputPassword)) {
            System.out.println("Status Akun: " + (User1.isActive() ? "Aktif" : "Nonaktif"));

            // Pilihan untuk mengaktifkan atau menonaktifkan akun
            System.out.print("Pilih tindakan (1: Nonaktifkan, 2: Aktifkan): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                User1.deactivateAccount();
            } else if (choice == 2) {
                User1.activateAccount();
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            // Menampilkan status akun setelah tindakan
            System.out.println("Status Akun setelah tindakan: " + (User1.isActive() ? "Aktif" : "Nonaktif"));
        } else {

            System.out.println("Username atau password yang anda input salah. Tidak dapat mengakses akun.");

        }
    }
}