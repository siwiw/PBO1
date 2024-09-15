/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author User
 */
public class praktikumPBO4 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota", 180, "Bensin", 4);

        // Menampilkan data awal
        mobil.tampilkanInfoMobil();

        // Mengubah jumlah pintu
        mobil.jumlahPintu(5);

        // Menampilkan data setelah perubahan
        System.out.println("Jumlah Pintu baru: " + mobil.getjumlahPintu());
    }
}

