/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;
import java.util.Scanner;

/**
 *
 * @author delia
 */
public class IMTMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//membuat object scanner untuk input user
        IMT person = new IMT();//Membuat object dari class IMT
        
        System.out.print("Masukkan Berat Badan (kg) : ");//Input berat badan
        person.beratBadan = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan (m) : ");//input tinggi badan
        person.tinggiBadan = input.nextDouble();
        
        person.getOutput();//Memanggil Method getOutput
    }
    
}
