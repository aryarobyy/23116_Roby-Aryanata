/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_6.Latihan;

/**
 *
 * @author USER
 */
public class Segitiga {
    private int lebar;

    public Segitiga(int lebar) {
        this.lebar = lebar;
    }

    public String gambarSegitiga() {
        StringBuilder r = new StringBuilder();
        
        for (int i = 1; i <= lebar; i++) {
            for (int j = 1; j <= i; j++) {
                r.append("[]");
            }
            r.append("\n");
        }
        
        return r.toString();
    }

    
}
