/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Tugas;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class LaguAnakAyam {
    private Scanner input;

    public LaguAnakAyam(Scanner input) {
        this.input = input;
    }

    public void mainkanLagu() {
        System.out.print("Masukkan jumlah anak ayam (N): ");
        int n = input.nextInt();

        System.out.println("\nLagu \"Anak Ayam Turun " + n + "\"");
        for (int i = n; i > 0; i--) {
            System.out.println("Anak ayam turunlah " + i);
            if (i > 1) {
                System.out.println("Mati satu tinggallah " + (i - 1));
            } else {
                System.out.println("Mati satu tinggal induknya");
            }
        }
    }
}