package tugasKuliah.tugaspemrogramankomputer.UASPemKom;

public class SoalNomorTujuh {
    // Atribut buku
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean sedangDipinjam;

    // Konstruktor untuk inisialisasi buku
    public SoalNomorTujuh(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.sedangDipinjam = false;
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Penulis : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Status Peminjaman : " + (sedangDipinjam ? "Sedang Dipinjam" : "Tersedia"));
        System.out.println();
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (!sedangDipinjam) {
            sedangDipinjam = true;
            System.out.println("Buku berhasil dipinjam.");
        } else {
            System.out.println("Maaf, buku sedang dipinjam.");
        }
        System.out.println();
    }

    // Metode untuk mengembalikan buku
    public void kembalikanBuku() {
        if (sedangDipinjam) {
            sedangDipinjam = false;
            System.out.println("Buku berhasil dikembalikan.");
        } else {
            System.out.println("Maaf, buku tidak sedang dipinjam.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Buku
        SoalNomorTujuh buku1 = new SoalNomorTujuh ("No Longer Human", "Osamu Dazai", 1948);
        SoalNomorTujuh buku2 = new SoalNomorTujuh ("Cosmos", "Carl Sagan", 1980);
        SoalNomorTujuh buku3 = new SoalNomorTujuh ("Filosofi Teras", "Henry Manampiring", 2018);

        // Menampilkan informasi buku sebelum dipinjam
        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();
        buku3.tampilkanInformasi();

        // Meminjam buku
        buku1.pinjamBuku();
        buku2.pinjamBuku();
        buku3.pinjamBuku();

        // Menampilkan informasi buku setelah dipinjam
        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();
        buku3.tampilkanInformasi();

        // Mengembalikan buku
        buku1.kembalikanBuku();
        buku2.kembalikanBuku();
        buku3.kembalikanBuku();

        // Menampilkan informasi buku setelah dikembalikan
        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();
        buku3.tampilkanInformasi();

    }
}