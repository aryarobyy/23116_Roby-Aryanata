package Pertemuan_9.Tugas;

public class Mahasiswa {
    private String npm, nama, alamat, mataKuliah;
    private double nilaiAkhir;

    public Mahasiswa(String npm, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        this.npm = npm;
        this.nama = nama;
        this.alamat = alamat;
        this.mataKuliah = mataKuliah;
        this.nilaiAkhir = nilaiAkhir;
    }

    public String getAlamat() { return alamat; }
    public String getNPM() { return npm; }
    public String getNama() { return nama; }
    public String getMataKuliah() { return mataKuliah; }
    public double getNilaiAkhir() { return nilaiAkhir; }
}
