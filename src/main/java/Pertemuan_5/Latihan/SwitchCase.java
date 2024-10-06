/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_5.Latihan;

/**
 *
 * @author USER
 */

import java.util.Scanner;
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Menu: ");
        System.out.println("1. Ayam Goreng ");
        System.out.println("2. Ayam Madu ");
        System.out.println("3. Nasi Goreng ");
        
    int pilihan = 3;
        switch(pilihan){
        case 1 -> System.out.println("Ayam Goreng");
        case 2 -> System.out.println("Ayam Madu");
        case 3 -> System.out.println("NasiGoreng");
        default -> System.out.println("SilakanPilih 1, 2 atau 3");
        }

    }
    
}
