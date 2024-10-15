/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_6.Tugas;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Action2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tabel generator = new Tabel();
        Perkalian printer = new Perkalian();

        System.out.print("Masukkan nilai n (1-10): ");
        int n = input.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Nilai n harus antara 1 dan 10.");
            return;
        }

        int[][] tabel = generator.generateTabel(n);
        printer.printTabel(tabel);

        input.close();
    }
}