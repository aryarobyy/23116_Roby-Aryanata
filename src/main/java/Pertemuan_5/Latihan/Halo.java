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

public class Halo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inNama = new Scanner(System.in);
        Scanner inNpm = new Scanner(System.in);

        
        System.out.print("Masukkan Nama: ");
        String nama =  inNama.nextLine();
        
        System.out.print("Masukkan NPM: ");
        String npm =  inNpm.nextLine();
        
        
        
        System.out.println("Halo, " + nama + " Selamat Datang");
        System.out.println("NPM:  " + npm );

    }
    
}