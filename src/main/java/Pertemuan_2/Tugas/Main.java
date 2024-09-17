/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_2.Tugas;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika mtk = new Matematika();
        
        System.out.println("20 + 10 = " + mtk.Pertambahan(20, 10));
        System.out.println("10 - 5 = " + mtk.Pengurangan(10, 5));
        System.out.println("10 X 3 = " + mtk.Perkalian(10, 3));
        System.out.println("21 : 2 = " + mtk.Pembagian(21, 2));
        
    }
    
}
