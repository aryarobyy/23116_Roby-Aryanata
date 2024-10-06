/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author USER
 */

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private static Hotel instance = null;
    private List<Room> rooms;
    private List<Reservasi> reservations;

    private Hotel() {
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public static Hotel getInstance() {
        if (instance == null) {
            instance = new Hotel();
        }
        return instance;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void bookRoom(Customer customer, int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber && room.isAvailable()) {
                room.setAvailable(false);
                reservations.add(new Reservasi(customer, room));
                System.out.println("Kamar berhasil dipesan.");
                return;
            }
        }
        System.out.println("Kamar tidak tersedia atau nomor kamar tidak valid.");
    }

    public void viewReservations(Customer customer) {
        boolean found = false;
        for (Reservasi reservation : reservations) {
            if (reservation.getCustomer().getUsername().equals(customer.getUsername())) {
                System.out.println("Pesanan: Kamar " + reservation.getRoom().getRoomNumber() + 
                                   ", Harga: $" + reservation.getRoom().getPrice()); //ngambil data ruangan sama harga
                found = true;
            }
        }
        if (!found) {
            System.out.println("Anda belum memiliki pesanan.");
        }
    }

    public void viewAllReservations() {
        if (reservations.isEmpty()) {
            System.out.println("Tidak ada reservasi saat ini.");
        } else {
            for (Reservasi reservation : reservations) {
                System.out.println("Pelanggan: " + reservation.getCustomer().getUsername() + 
                                   ", Kamar: " + reservation.getRoom().getRoomNumber());
            }
        }
    }
}
