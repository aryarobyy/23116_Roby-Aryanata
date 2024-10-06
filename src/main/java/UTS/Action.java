/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS;

/**
 *
 * @author USER
 */

import java.util.Scanner;

public class Action {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hotel hotel = Hotel.getInstance();
        UserManager userManager = UserManager.getInstance();

        // Inisialisasi kamar
        hotel.addRoom(new Room(101, 100));
        hotel.addRoom(new Room(102, 120));
        hotel.addRoom(new Room(201, 150));

        User currentUser = null;

        while (true) {
            System.out.println("\nSelamat datang di Aplikasi Reservasi Hotel");
            System.out.println("1. Login Admin");
            System.out.println("2. Login Customer");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            
            int option = input.nextInt();
            input.nextLine(); 

            if (option == 3) {
                System.out.println("Terima kasih telah menggunakan aplikasi kami.");
                break;
            }

            System.out.print("Masukkan username: ");
            String username = input.nextLine();
            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            if (option == 1) {
                currentUser = userManager.authenticateAdmin(username, password);
            } else if (option == 2) {
                currentUser = userManager.authenticateCustomer(username, password);
            }

            if (currentUser == null) {
                System.out.println("Login gagal. Username atau password salah.");
                continue;
            }

            while (currentUser != null) {
                currentUser.displayMenu();
                System.out.print("Pilihan Anda: ");
                int userOption = input.nextInt();
                if (userOption == 3) {
                    currentUser = null;
                } else {
                    currentUser.CustomerService(userOption);
                }
            }
        }

        input.close();
    }
}