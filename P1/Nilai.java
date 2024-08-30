/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author delia
 */
public class Nilai {
    
    //Deklarasi attribute
    String nim,nama ;
    double nilaiAbsen, nilaiTugas, nilaiUts, nilaiUas, nilaiAkhir;
    
    
    public Nilai(String nim, String nama, double nilaiAbsen,double nilaiTugas, double nilaiUts, double nilaiUas) {
      //Konstruktor = Method yang digunakan untuk memberi nilai awal pada saat object diciptakan dan namanya sama dengan class
      this.nim = nim;
      this.nama = nama;
      this.nilaiAbsen = nilaiAbsen;
      this.nilaiTugas = nilaiTugas;
      this.nilaiUts = nilaiUts;
      this.nilaiUas = nilaiUas;
      
      this.nilaiAkhir = (nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.4);//rumus nilaiAkhir
    }
    
    
    void cetakNilai() {
        System.out.println("NIM               : " + nim);
        System.out.println("Nama              : " + nama);
        System.out.println("Nilai Absen [10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS [30%]   : " + nilaiUts);
        System.out.println("Nilai UAS [40%]   : " + nilaiUas);
        System.out.println("Nilai Akhir       : " + nilaiAkhir);
    }
}
