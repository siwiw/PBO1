/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Hewan("Joni", 1);
        kucing.info();
        kucing.suara();
        kucing.berlari();
        
        Hewan anjing = new Hewan("Jontor", 1);
        anjing.info();
        anjing.suara();
        anjing.berlari();
        
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Putih");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2019, "Merah");

        mobil1.displayInfo();
        mobil1.startEngine();
        System.out.println(); 

        mobil2.displayInfo();
        mobil2.startEngine();
        System.out.println(); 

        mobil1.setWarna("Hitam");
        System.out.println("Setelah warna mobil diubah:");
        mobil1.displayInfo();
    }
}
