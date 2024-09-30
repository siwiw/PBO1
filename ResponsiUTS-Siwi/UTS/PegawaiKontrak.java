/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author ASUS
 */
public class PegawaiKontrak extends Pegawai {
    private int lamaKontrak;
    
    public PegawaiKontrak(String nama, double gaji, int lamaKontrak){
    super(nama, gaji);
    this.lamaKontrak = lamaKontrak;
    }
    
    public int getlamaKontrak() {
    return lamaKontrak;
    }
    
    public void setlamaKontrak() {
    this.lamaKontrak = lamaKontrak;
    }
    
    @Override
    public void tampilkanInfo() {
    super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak);
    }
    
    
    
}
