/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_9.Latihan;
   import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class InputData {
    ArrayList<Mahasiswa>listmahasiswa;

    public InputData(){
        listmahasiswa = new ArrayList();
    }
    
    public void insertData(String NIM, String Nama, String Alamat){
        Mahasiswa mhs = new Mahasiswa(NIM,Nama,Alamat);
        listmahasiswa.add(mhs);
    }
    public ArrayList<Mahasiswa>getALL(){
        return listmahasiswa;
    }
    public void deleteData(int index){
        listmahasiswa.remove(index);
    }
}
