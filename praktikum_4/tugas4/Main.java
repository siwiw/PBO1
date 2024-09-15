/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pekerja
        Pekerja pekerja = new Pekerja("Budi", 30, "Programmer", 7500000);

        // Menampilkan informasi pekerja
        System.out.println(pekerja.toString());

        // Mengubah nama pekerja
        pekerja.setNama("Andi");

        // Menampilkan ulang informasi pekerja
        System.out.println(pekerja.toString());
    }
}
