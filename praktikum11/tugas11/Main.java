/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas11;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan Kota");

        // Menambahkan buku ke perpustakaan
        perpustakaan.tambahBuku("Bumi Manusia", "Pramoedya Ananta Toer");
        perpustakaan.tambahBuku("Laskar Pelangi", "Andi Alexander");
        perpustakaan.tambahBuku("Saman", "Ayu Utami");

        // Menampilkan informasi perpustakaan
        System.out.println("Informasi Perpustakaan:");
        perpustakaan.infoPerpustakaan();

        // Menghapus perpustakaan beserta buku
        System.out.println("\nMenghapus Perpustakaan...");
        perpustakaan.hapusPerpustakaan();
    }
}
