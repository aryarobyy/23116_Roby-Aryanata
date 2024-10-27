/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_7.Tugas;

/**
 *
 * @author USER
 */
public class DataArr {
    private Data[] dataArray;

    public DataArr() {
        dataArray = new Data[] {
            new Data("a001", "Buku", 3000),
            new Data("a002", "Pensil", 4000),
            new Data("a003", "Pulpen", 5000)
        };
    }

    public void display() {
        System.out.println("No  Kode    Nama       Harga");
        System.out.println("============================");
        for (int i = 0; i < dataArray.length; i++) {
            System.out.printf("%-3d %-7s %-10s %-8d\n", (i + 1), dataArray[i].getKode(), dataArray[i].getNama(), dataArray[i].getHarga());
        }
        System.out.println("============================");
    }

    public Data getDataByKode(String kode) {
        for (Data barang : dataArray) {
            if (barang.getKode().equalsIgnoreCase(kode)) {
                return barang;
            }
        }
        return null; 
    }
}
