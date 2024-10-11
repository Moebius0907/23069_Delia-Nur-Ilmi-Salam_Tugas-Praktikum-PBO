/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6.no1;

/**
 *
 * @author delia
 */
public class BilanganPrima {
    
    //Metode yang digunakan untuk menentukan bilangan prima 
    private boolean iniPrima(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    //Metode untuk menampilkan bilangan Prima dan bukan dari angka 0-20 menggunakan looping for 
    public void tampilkanBilanganPrima() {
        System.out.println("Deret Bilangan Prima dan Bukan Prima dari 0 – 20:");
        for (int i = 0; i <= 20; i++) {
            if (iniPrima(i)) {
                System.out.println(i + " adalah bilangan prima.");
            } else {
                System.out.println(i + " adalah bukan bilangan prima.");
            }
        }
        System.out.println();
    }

    
}
