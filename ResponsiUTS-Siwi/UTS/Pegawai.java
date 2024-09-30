/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author ASUS
 */
public class Pegawai {
    private String nama;
    private double gaji;
    
    public Pegawai(String nama, double gaji) {
    this.nama = nama;
    this.gaji = gaji;
    }
    
    public String getnama(){
    return nama;
    } 
    
    public void setnama(String nama){
    this.nama = nama;
    }
    
    public double gaji(){
    return gaji;
    }
    
    public void setgaji(double gaji){
    this.gaji = gaji;
    }
    
    public void tampilkanInfo(){
        System.out.println("Nama Pegawai: " + nama);
        System.out.println("Gaji: " + gaji);
    }
}
