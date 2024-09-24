/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_4.Tugas;

/**
 *
 * @author USER
 */
public class Action {
    public static void main(String[] args) {
        Balok balok = new Balok(5, 3, 4);
        System.out.println("Balok:");
        System.out.println("Volume Balok: " + balok.volume());
        System.out.println("Luas Permukaan Balok: " + balok.luasPermukaan());

        Kubus kubus = new Kubus(4);
        System.out.println("\nKubus:");
        System.out.println("Volume Kubus: " + kubus.volume());
        System.out.println("Luas Permukaan Kubus: " + kubus.luasPermukaan());
    }
}
