/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas9;

/**
 *
 * @author delia
 */
public class Mahasiswa {
    private String NIM, Nama, Alamat, MataKuliah;
    private double nilai1, nilai2, nilai3, nilai4, nilai5;
    
    //Konstruktor kelas Mahasiswa
    public Mahasiswa(String NIM, String Nama, String Alamat,String MataKuliah, double nilai1, double nilai2, double nilai3, double nilai4, double nilai5){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MataKuliah = MataKuliah;
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
        this.nilai5 = nilai5;
    }
    
    
    //getter
    public String getNIM(){
        return NIM;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public String getAlamat() {
        return Alamat;
    }
    
    public String getMataKuliah() {
        return MataKuliah;
    }
    
     
    public double getNilai1() {
        return nilai1;
    }
    
    public double getNilai2() {
        return nilai2;
    }
    
    public double getNilai3() {
        return nilai3;
    }
    
    public double getNilai4() {
        return nilai4;
    }
    
    public double getNilai5() {
        return nilai5;
    }
    
    public double getNilaiAkhir() {
        return (nilai1 * 0.1) + (nilai2 * 0.15) + (nilai3 * 0.25) + (nilai4 * 0.15) + (nilai5 * 0.35) ;//rumus nilaiAkhir
    }
}
