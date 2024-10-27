/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_7.Latihan;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class ArrayKota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String []kota = {"Banyuwangi", "Jakarta", "Karawang"};
//        String[] kota = {"Karawang", "Bekasi"};
        String[] angka = new String[5];
        
//        for(int i=0; i<kota.length; i++){
//            System.out.println(kota[i]);
//        }

        System.out.println("Masukkan jumlah data: ");
        int jml = input.nextInt();
        for(int i=0; i<jml; i++){
            System.out.println("Masukkan data ke= " + i + ":"  );
            kota[i] = input.next();
        }

        for(String nama: kota){
            System.out.println(nama);
        }
        
    }
    
}
