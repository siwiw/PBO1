/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas6;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> listProduk;

    public KeranjangBelanja() {
        this.listProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : listProduk) {
            total += produk.getHarga() - produk.hitungDiskon();
        }
        return total;
    }

    // Metode untuk menampilkan semua produk di keranjang
    public void tampilkanProduk() {
        System.out.println("Daftar produk di keranjang:");
        for (Produk produk : listProduk) {
            System.out.println("Nama: " + produk.getNama());
            System.out.println("Harga: Rp" + produk.getHarga());
            System.out.println("Diskon: Rp" + produk.hitungDiskon());
            System.out.println("Harga setelah diskon: Rp" + (produk.getHarga() - produk.hitungDiskon()));
            System.out.println("----------------------------");
        }
    }
}


