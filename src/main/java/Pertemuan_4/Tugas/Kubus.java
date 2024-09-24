/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_4.Tugas;

/**
 *
 * @author USER
 */
public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double volume() {
        return sisi * sisi * sisi;
    }

    @Override
    public double luasPermukaan() {
        return 6 * (sisi * sisi);
    }
}

