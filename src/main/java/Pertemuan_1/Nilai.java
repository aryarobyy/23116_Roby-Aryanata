/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_1;

/**
 *
 * @author USER
 */
public class Nilai {
    String Npm;
    String Nama;
    double Absen;
    double Tugas;
    double UTS;
    double UAS;
    
    public Nilai(String Npm, String Nama, double Absen, double Tugas, double UTS, double UAS)
    {
        this.Npm = Npm;
        this.Nama = Nama;
        this.Absen = Absen;
        this.Tugas = Tugas;
        this.UTS = UTS;
        this.UAS = UAS;
              
    }
    
    double NilaiAkhir(){
        return (Absen * 0.1) + (Tugas * 0.2) + (UTS * 0.3) + (UAS * 0.4);
    }
    
    public void cetakNilai() {
        System.out.println("NPM:"+ Npm);
        System.out.println("Nilai Absen: "+ Absen);
        System.out.println("Nilai Tugas: " + Tugas);
        System.out.println("Nilai UTS: " + UTS);
        System.out.println("Nilai UAS: " + UAS);
        System.out.println("Nilai Akhir: " + NilaiAkhir());
    }
    
            }
