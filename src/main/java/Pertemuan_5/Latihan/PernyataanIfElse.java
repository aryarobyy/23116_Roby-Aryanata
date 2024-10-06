/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_5.Latihan;

/**
 *
 * @author USER
 */
public class PernyataanIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int skorUjian = 86;
        char nilai;
        
        if(skorUjian >= 90){
            nilai = 'A';
        } else if (skorUjian >= 80){
            nilai = 'B';
        } else if (skorUjian >= 70){
            nilai = 'C';
        } else {
            nilai = 'D';
        }
        System.out.println("Nilai = " + nilai);
    }
    
}
