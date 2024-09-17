/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_3.Tugas;

/**
 *
 * @author USER
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KonversiSuhu2 konversi = new KonversiSuhu2();

        // Memanggil method dari KonversiSuhu (inherited)
        System.out.println("Celcius ke Fahrenheit: 25 C = " + konversi.celciusToFahrenheit(25) + " F");
        System.out.println("Celcius ke Reamur: 25 C = " + konversi.celciusToReamur(25) + " R");

        // Memanggil method dari KonversiSuhu2
        System.out.println("Fahrenheit ke Reamur: 77 F = " + konversi.fahrenheitToReamur(77) + " R");
    }
    
}
