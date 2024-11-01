/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas9;
import java.util.ArrayList;

/**
 *
 * @author delia
 */
public class DataNilaiMhs {
    //Membuat arrayList dengan tipe data mahasiswa 
    ArrayList <Mahasiswa> listNilaiMahasiswa;
    
    //Konstruktor kelas DataNilaiMhs
    public DataNilaiMhs(){
       listNilaiMahasiswa = new ArrayList();
    }
    
    //Method untuk insert data ke dalam arayList
    public void insertData(String NIM, String Nama, String Alamat, String MataKuliah, double nilai1, double nilai2, double nilai3, double nilai4, double nilai5){
        Mahasiswa mhs = new Mahasiswa (NIM, Nama, Alamat, MataKuliah, nilai1, nilai2, nilai3, nilai4, nilai5);
        listNilaiMahasiswa.add(mhs);
    }
    
    //Method untuk delete data di arrayList
    public void deleteData(int index) {
        listNilaiMahasiswa.remove(index);
    }
    
    //getter
    public ArrayList<Mahasiswa> getALL(){
        return listNilaiMahasiswa;
    }
    
   
}
