/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas12;

/**
 *
 * @author User
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemManajemenBuku {
    private static final String TEXT_FILE_PATH = "buku.txt";
    private static final String SERIAL_FILE_PATH = "buku.ser";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        while (true) {
            System.out.println("\n=== Sistem Manajemen Buku ===");
            System.out.println("1. Tambah buku baru dan simpan ke buku.txt");
            System.out.println("2. Simpan objek Buku ke buku.ser");
            System.out.println("3. Tampilkan daftar buku dari buku.txt");
            System.out.println("4. Tampilkan daftar buku dari buku.ser");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    // Tambah buku baru
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan pengarang buku: ");
                    String pengarang = scanner.nextLine();
                    System.out.print("Masukkan tahun terbit buku: ");
                    int tahunTerbit = scanner.nextInt();
                    scanner.nextLine(); // Konsumsi newline

                    Buku bukuBaru = new Buku(judul, pengarang, tahunTerbit);
                    daftarBuku.add(bukuBaru);

                    // Simpan ke file teks
                    try (FileWriter writer = new FileWriter(TEXT_FILE_PATH, true)) {
                        writer.write(bukuBaru.toString() + "\n");
                        System.out.println("Buku berhasil disimpan ke buku.txt.");
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan saat menyimpan ke buku.txt.");
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    // Simpan objek Buku ke buku.ser
                    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE_PATH))) {
                        oos.writeObject(daftarBuku);
                        System.out.println("Daftar buku berhasil disimpan ke buku.ser.");
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan saat menyimpan ke buku.ser.");
                        e.printStackTrace();
                    }
                    break;

                case 3:
                    // Tampilkan daftar buku dari buku.txt
                    System.out.println("\nDaftar Buku dari buku.txt:");
                    try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE_PATH))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan saat membaca buku.txt.");
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    // Tampilkan daftar buku dari buku.ser
                    System.out.println("\nDaftar Buku dari buku.ser:");
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE_PATH))) {
                        ArrayList<Buku> bukuTersimpan = (ArrayList<Buku>) ois.readObject();
                        for (Buku buku : bukuTersimpan) {
                            System.out.println(buku);
                        }
                    } catch (IOException | ClassNotFoundException e) {
                        System.out.println("Terjadi kesalahan saat membaca buku.ser.");
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan Sistem Manajemen Buku.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}