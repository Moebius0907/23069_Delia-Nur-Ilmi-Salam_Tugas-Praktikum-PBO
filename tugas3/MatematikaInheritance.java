/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author delia
 */
public class MatematikaInheritance {

    public static void main(String[] args) {
        
        // Membuat object dari Matematika2 yang merupakan turunan dari Matematika
        Matematika2 hitung = new Matematika2();
        
        System.out.println("================================");//Judul Program
        System.out.println("\tOPERASI MATEMATIKA 2");
        System.out.println("================================");
        System.out.println(" Nilai a : 25");
        System.out.println(" Nilai b : 10");
      
        
        // Menggunakan method pertambahan dari class Matematika
        int hasilTambah = hitung.pertambahan(25, 10);
        System.out.println(" Hasil Pertambahan : " + hasilTambah);
        
        // Menggunakan method pengurangan dari class Matematika
        int hasilKurang = hitung.pengurangan(25, 10);
        System.out.println(" Hasil Pengurangan : " + hasilKurang);
        
        // Menggunakan method perkalian dari class Matematika
        int hasilKali = hitung.perkalian(25, 10);
        System.out.println(" Hasil Perkalian : " + hasilKali);
        
        // Menggunakan method pembagian dari Matematika
        int hasilBagi = hitung.pembagian(25, 10);
        System.out.println(" Hasil Pembagian : " + hasilBagi);
        
        // Menggunakan method modulus dari Matematika2
        int hasilModulus = hitung.modulus(25, 10);
        System.out.println(" Hasil Modulus : " + hasilModulus);
    }
}
   
