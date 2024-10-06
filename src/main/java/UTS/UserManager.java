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

//data di lokal
public class UserManager {
    private static UserManager instance = null;
    private List<Admin> admins;
    private List<Customer> customers;

    private UserManager() {
        admins = new ArrayList<>();
        customers = new ArrayList<>();
        initializeUsers();
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    private void initializeUsers() {
        //admin
        admins.add(new Admin("admin1", "123"));
        admins.add(new Admin("admin2", "123"));
        admins.add(new Admin("admin3", "123"));
        
        //customer
        customers.add(new Customer("roby", "123"));
        customers.add(new Customer("bayu", "123"));
        customers.add(new Customer("ilhamgo14", "windah"));
    }

    public Admin authenticateAdmin(String username, String password) {
        for (Admin admin : admins) {
            if (admin.getUsername().equals(username) && admin.authenticate(password)) { //*note, kasih hash kalo mau masukkin db
                return admin;
            }
        }
        return null;
    }

    public Customer authenticateCustomer(String username, String password) {
        for (Customer customer : customers) {
            if (customer.getUsername().equals(username) && customer.authenticate(password)) {
                return customer;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }
}