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
public class IMT {
    //deklarasi atribut-atribut yang digunakan pada class IMT
    double beratBadan, tinggiBadan;
    private double IMT;
    private String kriteria;
    
    double HitungIMT(){//Method untuk menghitung IMT
        IMT = beratBadan/(tinggiBadan * tinggiBadan);
        
        return IMT;//Mengembalikan nilai IMT
    }
    
    String getKriteria(){//Method untuk mengetahui kriteria dari IMT yang sudah diitung di method HitungIMT
        //Statement berisi pengkondisian IF-ELSE
        if(IMT <= 18.4){
            kriteria = "Berat Badan Kurang";
        }else if(IMT >= 18.5 && IMT <= 24.9){
            kriteria = "Berat Badan Ideal";
        }else if(IMT >= 25 && IMT <= 29.9){
            kriteria = "Berat Badan Lebih";
        }else if(IMT >= 30 && IMT <= 39.9){
            kriteria = "Gemuk";
        }else if(IMT >= 40){
            kriteria = "Sangat Gemuk";
        }
        
        return kriteria;//Mengembalikan kriteria yang berupa String
    }
    
    void getOutput(){//Method untuk menampilkan output program
        System.out.println("Nilai IMT  : " + HitungIMT());
        System.out.println("Kriteria : " + getKriteria());
    }
}
