/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing(); 
        kucing.jenis = "Kucing Munchkin";
        kucing.nama = "Oyen";
        kucing.warna = "Oren Putih";
        kucing.usia = "2";
        kucing.habitat = "Rumah";
        kucing.tampilkanInfo();

        Anjing anjing = new Anjing();
        anjing.jenis = "Anjing Husby Siberia";
        anjing.nama = "Pipo";
        anjing.warna = "Hitam Putih";
        anjing.kecepatan = 48;
        anjing.habitat = "Gunung Salju";
        anjing.tampilkanInfo();
    }
}
