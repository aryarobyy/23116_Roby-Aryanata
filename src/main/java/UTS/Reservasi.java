/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author USER
 */

public class Reservasi {
    private Customer customer;
    private Room room;

    public Reservasi(Customer customer, Room room) {
        this.customer = customer;
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }
}