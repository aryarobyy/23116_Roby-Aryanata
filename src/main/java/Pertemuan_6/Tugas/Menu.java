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

//pake 1 aja biar gk ribet

public class Menu {
    private Scanner input;
    private BilanganOperasi bilanganOperasi;
    private CekHuruf cekHuruf;
    private LaguAnakAyam laguAnakAyam;

    public Menu(Scanner input) {
        this.input = input;
        this.bilanganOperasi = new BilanganOperasi();
        this.cekHuruf = new CekHuruf();
        this.laguAnakAyam = new LaguAnakAyam(input);
    }

    public void tampilkanMenu() {
        int pilihan;
        do {
            System.out.println("\nMenu Latihan Perulangan:");
            System.out.println("1. Menghitung Deret bilangan prima dan bukan dari 0 - 20");
            System.out.println("2. Menghitung Deret bilangan ganjil dan genap dari 0 - 20");
            System.out.println("3. Huruf Z - A");
            System.out.println("4. Lagu \"Anak Ayam Turun N\"");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    bilanganOperasi.prima();
                    break;
                case 2:
                    bilanganOperasi.ganjilGenap();
                    break;
                case 3:
                    cekHuruf.cekHurufZA();
                    break;
                case 4:
                    laguAnakAyam.mainkanLagu();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
    }
}