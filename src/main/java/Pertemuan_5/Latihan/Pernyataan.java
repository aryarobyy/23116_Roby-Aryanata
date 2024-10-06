/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_5.Latihan;

/**
 *
 * @author USER
 */
public class Pernyataan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diskon = 0, totalBelanja = 30000;
        
        if(totalBelanja >= 50000){
            diskon = totalBelanja/10;
        } else if (totalBelanja <= 30000){
            diskon = totalBelanja*5/100;
        }
        
        System.out.println("Diskon =" + diskon);
    }
    
}
