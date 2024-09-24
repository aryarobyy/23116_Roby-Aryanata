/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_4.Latihan;

/**
 *
 * @author USER
 */
public class Employee{ 
    private String name; 
    private double salary; 
 
    protected Employee(String name, double salary){ 
 	 	this.name = name;  	 	
                this.salary = salary; 
    }
    protected String getDetails(){ 
        return "Name: " +name+ "\nSalary: " +salary;
 	 	} 
 	 	
    public void cetak(){ 
        System.out.println("Percobaan di Class Employee");
 	 	} 
    } 
 
