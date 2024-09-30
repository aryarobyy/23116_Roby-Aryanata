package Pertemuan_5.Tugas;

import java.util.Scanner;

public class InputMhs {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NPM: ");
        String NPM = input.next();
        System.out.print("Masukkan Nama: ");
        String Nama = input.next();
        System.out.print("Masukkan Nilai Kehadiran: ");
        int NilaiK = input.nextInt();
        System.out.print("Masukkan Nilai Tugas: ");
        int NilaiT = input.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int NilaiUTS = input.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int NilaiUAS = input.nextInt();
        
        if (NilaiUTS > 100 || NilaiUTS < 0 || NilaiUAS > 100 || NilaiUAS < 0) {
            System.out.println("Nilai salah, silakan masukkan nilai antara 0 dan 100.");
            return; 
        }
        
        int NilaiAkhir = (NilaiK * 10 / 100) + (NilaiT * 20 / 100) + (NilaiUTS * 30 / 100) + (NilaiUAS * 40 / 100);
        
        String grade;
        String keterangan;
        
        if (NilaiAkhir >= 76 && NilaiAkhir <= 100) {
            grade = "A";
            keterangan = "ISTIMEWA";
        } else if (NilaiAkhir >= 66 && NilaiAkhir <= 75) {
            grade = "B";
            keterangan = "BAIK";
        } else if (NilaiAkhir >= 56 && NilaiAkhir <= 65) {
            grade = "C";
            keterangan = "CUKUP";
        } else if (NilaiAkhir >= 46 && NilaiAkhir <= 55) {
            grade = "D";
            keterangan = "KURANG";
        } else {
            grade = "E";
            keterangan = "KURANG SEKALI";
        }
        
        System.out.println("\nNPM: " + NPM);
        System.out.println("Nama: " + Nama);
        System.out.println("Nilai Kehadiran: " + NilaiK);
        System.out.println("Nilai Tugas: " + NilaiT);
        System.out.println("Nilai UTS: " + NilaiUTS);
        System.out.println("Nilai UAS: " + NilaiUAS);
        System.out.println("Nilai Akhir: " + NilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
}
