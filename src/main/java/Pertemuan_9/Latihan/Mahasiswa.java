/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_9.Latihan;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    private String NIM, Nama, Alamat;
    
        public Mahasiswa(String NIM, String Nama, String Alamat){
            this.NIM = NIM;
            this.Nama = Nama;
            this.Alamat = Alamat;
        }
        
        public String getAlamat(){
            return Alamat;
        }
        
        public String getNIM(){
            return NIM;
        }
        
        public String getNama(){
            return Nama;
        }
}
