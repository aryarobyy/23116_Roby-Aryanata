/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_7.Tugas;
/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Action {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataArr listData = new DataArr();

        listData.display();

        int totalBayar = 0;
        boolean selesaiBelanja = false;
        int counter = 0; 

        StringBuilder tableOutput = new StringBuilder();

        while (!selesaiBelanja) {
            System.out.print("Masukkan Kode Barang (atau ketik 'selesai' untuk mengakhiri): ");
            String kodeInput = input.nextLine();

            if (kodeInput.equalsIgnoreCase("selesai")) {
                selesaiBelanja = true;
                break;
            }

            Data barang = listData.getDataByKode(kodeInput);
            if (barang == null) {
                System.out.println("Kode barang tidak ditemukan. Silakan coba lagi.");
                continue;
            }

            int jumlahBeli = 0;
            while (true) {
                try {
                    System.out.print("Masukkan Jumlah Beli untuk " + barang.getNama() + ": ");
                    jumlahBeli = Integer.parseInt(input.nextLine());
                    if (jumlahBeli <= 0) {
                        throw new NumberFormatException(); 
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Jumlah beli harus berupa angka yang valid dan lebih dari 0. Silakan coba lagi.");
                }
            }

            int jumlahBayar = barang.getHarga() * jumlahBeli;
            totalBayar += jumlahBayar;

            counter++;
            tableOutput.append(String.format("%-3d %-7s %-10s %-8d %-12d %-12d\n", counter, barang.getKode(), barang.getNama(), barang.getHarga(), jumlahBeli, jumlahBayar));
        }

        if (counter == 0) {
            System.out.println("Tidak ada barang yang dipilih.");
        } else {
            System.out.println("\nNo  Kode    Nama       Harga   Jumlah Beli  Jumlah Bayar");
            System.out.println("========================================================");
            System.out.print(tableOutput.toString());
            System.out.println("========================================================");
            System.out.printf("Total bayar%38d\n", totalBayar);
        }
    }
}
