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

public class Action1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu(input);
        menu.tampilkanMenu();
        input.close();
    }
}