/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author USER
 */

import java.util.Scanner;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void displayMenu() {
        System.out.println("\nAdmin Menu:");
        System.out.println("1. Lihat semua reservasi");
        System.out.println("2. Tambah kamar");
        System.out.println("3. Keluar");
    }

    @Override
    public void CustomerService(int list) {
        switch (list) {
            case 1:
                Hotel.getInstance().viewAllReservations();
                break;
            case 2:
                addRoom();
                break;
            case 3:
                System.out.println("Keluar dari menu admin.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    private void addRoom() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor kamar: ");
        int roomNumber = input.nextInt();
        System.out.print("Masukkan harga kamar: ");
        double price = input.nextDouble();
        Hotel.getInstance().addRoom(new Room(roomNumber, price));
        System.out.println("Kamar berhasil ditambahkan.");
    }
}