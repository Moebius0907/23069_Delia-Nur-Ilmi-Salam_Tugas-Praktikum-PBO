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
public class DiskonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputPembelian = new Scanner(System.in);//membuat object scanner untuk input user
        Diskon beli1 = new Diskon();//membuat object dari class Diskon
        
        //Input total pembelian 
        System.out.print("Total Pembelian : Rp. = ");
        beli1.pembelian = inputPembelian.nextInt();
        
        //Memanggil method getHasil dan getDetail untuk menghitung dan menampilkan detal pembelian
        beli1.getHasil();
        beli1.getDetail();
    }
    
}
