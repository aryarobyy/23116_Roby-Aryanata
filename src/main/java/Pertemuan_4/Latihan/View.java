/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_4.Latihan;

/**
 *
 * @author USER
 */
public class View {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee em = new Employee("Dilan", 40000);
        Manager mn = new Manager("Milea", 500000, "Marketing");
        
        System.out.println("Data employe: \n" + em.getDetails());
        em.cetak();
        System.out.println("\nData Manager  : \n"+mn.getDetails());                  	 	
        mn.cetak();       
    }
    
}
