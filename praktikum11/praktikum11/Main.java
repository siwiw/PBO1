/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();

        // Membuat beberapa objek buku
        Buku buku1 = new Buku("Gadis Kretek", "Ratih Kumala");
        Buku buku2 = new Buku("Cantik Itu Luka", "Eka Kurniawan");
        Buku buku3 = new Buku("laut Bercerita", "Leila S.Chudori");

        // Menambahkan buku ke perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan informasi perpustakaan
        System.out.println("Daftar Buku di Perpustakaan:");
        perpustakaan.infoPerpustakaan();
    }
}

