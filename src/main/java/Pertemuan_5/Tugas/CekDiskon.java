/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_5.Tugas;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class CekDiskon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan uang anda: ");
        int Pemasukkan = input.nextInt();
        
        
        if(Pemasukkan < 50000){
            int Diskon = Pemasukkan*5/100;
            int TotalDiskon = Pemasukkan - Diskon;
            System.out.println("Harga yang harus dibayar: " + TotalDiskon);
        } else {
            int Diskon = Pemasukkan*20/100;
            int TotalDiskon = Pemasukkan - Diskon;
            System.out.println("Harga yang harus dibayar: " + TotalDiskon);
        }
    }
    
}
