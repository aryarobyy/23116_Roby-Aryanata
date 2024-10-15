/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6.Tugas;

/**
 *
 * @author USER
 */
public class BilanganOperasi {
    public void prima() {
        System.out.println("Deret bilangan prima dan bukan dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (isPrima(i)) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " bukan bilangan prima");
            }
        }
    }

    private boolean isPrima(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public void ganjilGenap() {
        System.out.println("Deret bilangan ganjil dan genap dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
        }
    }
}