/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
    Produk produk1 = new Elektronik("HP Samsung", 9000000, 3);
    Produk produk2 = new Makanan ("Mie Instan Sekerdus", 400000, "2024-01-01");
    
    produk1.tampilkanInfo();
    System.out.println();
    produk2.tampilkanInfo();
    System.out.println();
    
    Pegawai pegawai1 = new PegawaiTetap("Budi Kopling", 8000000, 5500000);
    Pegawai pegawai2 = new PegawaiKontrak("Siti Redvelvet", 5000000, 12);

    pegawai1.tampilkanInfo();
    System.out.println();
    pegawai2.tampilkanInfo();
    }
    
}
