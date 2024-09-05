/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author delia
 */
public class MatematikaBeraksi {
    public static void main(String[] args){
        //Membuat object hitung dari class Matematika
        Matematika hitung = new Matematika();
        
        System.out.println("================================");
        System.out.println("\tOPERASI MATEMATIKA");
        System.out.println("================================");
        System.out.println("Pertambahan : 20 + 10 = " + hitung.pertambahan(20, 10));
        System.out.println("Pengurangan : 10 - 5 = " + hitung.pengurangan(10, 5));
        System.out.println("Perkalian   : 10 * 3 = " + hitung.perkalian(10, 3));
        System.out.println("Pembagian   : 21 / 2 = " + hitung.pembagian(21, 2));
    }
    
}
