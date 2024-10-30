/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas10;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Elektronik produkElektronik = new Elektronik();
        Makanan produkMakanan = new Makanan();

        double hargaElektronik = 2500000;
        double hargaMakanan = 55000;

        double pajakElektronik = produkElektronik.hitungPajak(hargaElektronik);
        System.out.println("Pajak Elektronik: Rp " + pajakElektronik);

        double pajakMakanan = produkMakanan.hitungPajak(hargaMakanan);
        System.out.println("Pajak Makanan: Rp " + pajakMakanan);
    }
}
