/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_2.Latihan;

import Pertemuan_2.Latihan.Lampu;

/**
 *
 * @author USER
 */
public class LampuAction {

    /**LampuAction
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lampu lampuKamar = new Lampu();  
 	 	 	 
System.out.println("Status Lampu Saat Ini: Mati"); 
 	 	 	 
lampuKamar.hidupkan(); //Hidupkan Lampu  
 	 	 	lampuKamar.matikan(); //Matikan Lampu   	 	 	
                        lampuKamar.matikan(); //Matikan Lampu   	 	 	
                        lampuKamar.hidupkan(); //Hidupkan Lampu   	 	 	
                        lampuKamar.hidupkan(); //Hidupkan Lampu  

    }
    
}
