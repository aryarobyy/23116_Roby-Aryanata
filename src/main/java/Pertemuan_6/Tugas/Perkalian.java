package Pertemuan_6.Tugas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Perkalian {
    public void printTabel(int[][] tabel) {
        int n = tabel.length;

        System.out.print("   ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.print("   ");
        for (int i = 1; i <= n; i++) {
            System.out.print("----");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.printf("%2d |", i + 1);
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", tabel[i][j]);
            }
            System.out.println();
        }
    }
}