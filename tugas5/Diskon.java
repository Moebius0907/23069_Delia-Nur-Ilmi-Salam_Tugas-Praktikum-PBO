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
public class Diskon {
    //deklarasi atribut-atribut yang akan digunakan pada class Diskon
    int pembelian;
    double diskon, total;
    
    double getHasil(){//Method untuk mendapatkan hasil diskon dan total yang harus dibayar
        if(pembelian < 50000){
            diskon = 0.05 * pembelian;
            total = pembelian - diskon;
        }else{
            diskon = 0.20 * pembelian;
            total = pembelian - diskon;
        }
        return total;
    }
    
    void getDetail(){//Method untuk menampilkan detail pembelian
     System.out.println("Besarnya Potongan = " + diskon);
     System.out.println("Jumlah yang harus dibayarkan = " + getHasil());   
    }
}
