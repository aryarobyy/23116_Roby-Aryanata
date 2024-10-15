/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Tugas;

/**
 *
 * @author USER
 */
public class Tabel {
    public int[][] generateTabel(int n) {
        int[][] tabel = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tabel[i][j] = (i + 1) * (j + 1);
            }
        }
        return tabel;
    }
}
