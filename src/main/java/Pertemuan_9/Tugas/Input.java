package Pertemuan_9.Tugas;

import java.util.ArrayList;

public class Input {
    private ArrayList<Mahasiswa> listMahasiswa;

    public Input() {
        listMahasiswa = new ArrayList<>();
    }

    public void insertData(String npm, String nama, String alamat, String mataKuliah, double nilaiAkhir) {
        Mahasiswa mhs = new Mahasiswa(npm, nama, alamat, mataKuliah, nilaiAkhir);
        listMahasiswa.add(mhs);
    }

    public ArrayList<Mahasiswa> getALL() {
        return listMahasiswa;
    }

    public void deleteData(int index) {
        if (index >= 0 && index < listMahasiswa.size()) {
            listMahasiswa.remove(index);
        }
    }
}
