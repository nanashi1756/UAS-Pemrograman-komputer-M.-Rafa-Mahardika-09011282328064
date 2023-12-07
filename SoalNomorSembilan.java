package tugasKuliah.tugaspemrogramankomputer.UASPemKom;

import java.util.Stack;

public class SoalNomorSembilan{

    public static boolean periksaUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (char karakter : ekspresi.toCharArray()) {
            if (karakter == '(' || karakter == '[' || karakter == '{') {
                // Push kurung buka ke dalam stack
                stack.push(karakter);
            } else if (karakter == ')' || karakter == ']' || karakter == '}') {
                // Periksa jika stack kosong atau kurung tutup tidak sesuai dengan kurung buka teratas di stack
                if (stack.isEmpty() || !pasanganKurung(stack.pop(), karakter)) {
                    return false;
                }
            }
        }
        
        // Pastikan stack kosong setelah memeriksa seluruh ekspresi
        return stack.isEmpty();
    }
    private static boolean pasanganKurung(char buka, char tutup) {
        return (buka == '(' && tutup == ')') ||
               (buka == '[' && tutup == ']') ||
               (buka == '{' && tutup == '}');
    }

    public static void main(String[] args) {
        String ekspresi1 = "((a + b) * c)"; // Urutan kurung benar
        String ekspresi2 = "((a + b) * c";   // Urutan kurung salah

        if (periksaUrutanKurung(ekspresi1)) {
            System.out.println("Urutan kurung pada ekspresi 1 benar.");
        } else {
            System.out.println("Urutan kurung pada ekspresi 1 salah.");
        }

        if (periksaUrutanKurung(ekspresi2)) {
            System.out.println("Urutan kurung pada ekspresi 2 benar.");
        } else {
            System.out.println("Urutan kurung pada ekspresi 2 salah.");

        }
    }
}