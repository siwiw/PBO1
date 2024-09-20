/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

/**
 *
 * @author User
 */
public class HewanDarat extends Hewan {
    String habitat;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Habitat : " + habitat);
    }
}
