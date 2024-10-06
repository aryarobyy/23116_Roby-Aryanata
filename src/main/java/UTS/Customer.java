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

public class Customer extends User {
    public Customer(String username, String password) {
        super(username, password);
    }

    @Override
    public void displayMenu() {
        System.out.println("\nCustomer Menu:");
        System.out.println("1. Pesan kamar");
        System.out.println("2. Lihat pesanan saya");
        System.out.println("3. Keluar");
    }

    @Override
    public void CustomerService(int list) {
        switch (list) {
            case 1:
                bookRoom();
                break;
            case 2:
                viewMyReservations();
                break;
            case 3:
                System.out.println("Keluar dari menu customer.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    private void bookRoom() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor kamar yang ingin dipesan: ");
        int roomNumber = input.nextInt();
        Hotel.getInstance().bookRoom(this, roomNumber);
    }

    private void viewMyReservations() {
        Hotel.getInstance().viewReservations(this);
    }
}
