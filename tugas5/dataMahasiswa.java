/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;

/**
 *
 * @author delia
 */
public class dataMahasiswa {
    //Deklarasi atribut-atribut yang akan digunakan di class dataMahasiswa
    String nama,NPM,keterangan;
    double nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS;
    private double nilaiAkhir;
    private String grade;
    
    double hitungNilaiAkhir(){//Method untuk menghitung nilai akhir 
        nilaiAkhir = (0.1 * nilaiAbsen) +(0.2 * nilaiTugas)+(0.3 * nilaiUTS) + (0.4*nilaiUAS);
        
        return nilaiAkhir;
    }
    
    String getGrade() {//Method untuk menentukan grade 
        //Statement di dalamnya berisi pengkondisian if-else
        if (nilaiAkhir >= 76 && nilaiAkhir <= 100){
            grade = "A";
            keterangan = "ISTIMEWA";
        }else if(nilaiAkhir >= 66 && nilaiAkhir <= 75){
            grade = "B";
            keterangan = "BAIK";
        }else if(nilaiAkhir >= 56 && nilaiAkhir <= 65){
            grade = "C";
            keterangan = "CUKUP";
        }else if(nilaiAkhir >= 46 && nilaiAkhir <= 55){
            grade = "D";
            keterangan = "KURANG";
        }else if(nilaiAkhir >= 0 && nilaiAkhir <= 45){
            grade = "E";
            keterangan = "KURANG SEKALI";
        }
        return grade;//mengembalikan nilai grade
    }
    
   void getOutput(){//Method untuk menampilkan outputnya
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NPM Mahasiswa : " + NPM);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
        System.out.println("Grade : " + getGrade());
        System.out.println("Keterangan : " + keterangan);
   }
   
}
