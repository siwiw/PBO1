/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11_2;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Klub klub = new Klub("Klub Sepak Bola");

        Anggota anggota1 = new Anggota("Siwi");
        Anggota anggota2 = new Anggota("Jeki");
        Anggota anggota3 = new Anggota("Joni");

        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        klub.tambahAnggota(anggota3);

        System.out.println("Informasi Klub:");
        klub.infoKlub();

        System.out.println("\nInformasi Anggota di luar klub:");
        anggota1.infoAnggota(); 
    }
}

