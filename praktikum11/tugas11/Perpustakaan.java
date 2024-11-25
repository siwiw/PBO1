/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas11;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

class Perpustakaan {
    private String namaPerpustakaan;
    private List<Buku> bukuList;

    public Perpustakaan(String namaPerpustakaan) {
        this.namaPerpustakaan = namaPerpustakaan;
        this.bukuList = new ArrayList<>();
    }

    public void tambahBuku(String judul, String pengarang) {
        Buku buku = new Buku(judul, pengarang); 
        bukuList.add(buku);
    }

    public void infoPerpustakaan() {
        System.out.println("Nama Perpustakaan: " + namaPerpustakaan);
        System.out.println("Daftar Buku:");
        for (Buku buku : bukuList) {
            buku.infoBuku();
            System.out.println();
        }
    }

    public void hapusPerpustakaan() {
        bukuList.clear();
        System.out.println("Perpustakaan \"" + namaPerpustakaan + "\" beserta semua buku telah dihapus.");
    }
}

