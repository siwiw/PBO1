/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author User
 */
public class Pekerja extends Manusia {
    private double gaji; // Akses modifier private

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // Memanggil constructor dari kelas induk
        this.gaji = gaji;
    }

    // Getter dan Setter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString()
    @Override
    public String toString() {
        return "Nama: " + getNama() + ", Usia: " + usia + ", Pekerjaan: " + pekerjaan + ", Gaji: " + gaji;
    }
}
