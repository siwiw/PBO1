/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        // Menambahkan beberapa produk
        Produk buku = new Buku("Buku Java", 100000);
        Produk elektronik = new Elektronik("Smartphone", 5000000);
        Produk pakaian = new Pakaian("Jaket", 300000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        keranjang.tampilkanProduk();
        System.out.println("Total harga setelah diskon: " + keranjang.hitungTotalHargaSetelahDiskon());
    }
}

