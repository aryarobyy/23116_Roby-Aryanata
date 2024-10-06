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
public class Perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Pertama: ");
        int bilangan1 = masukan.nextInt();
        
        
        System.out.print("Masukkan Bilangan Kedua: ");
        int bilangan2 = masukan.nextInt();
        System.out.print("Hasil perkalian " + (bilangan1 * bilangan2));
    }
    
}
