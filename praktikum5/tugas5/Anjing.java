/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author User
 */
public class Anjing extends HewanDarat {
    int kecepatan;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kecepatan Berlari: " + kecepatan + "km/jam");
    }
}
