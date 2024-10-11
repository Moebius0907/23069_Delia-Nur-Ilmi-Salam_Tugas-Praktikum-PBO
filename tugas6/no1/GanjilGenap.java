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
public class GanjilGenap {
    
    //Metode untuk menampilkan ganjil genap dari bilangan 0-20 menggunakan looping while 
    public void tampilkanGanjilGenap() {
        System.out.println("Deret Bilangan Ganjil dan Genap dari 0 – 20:");
        int number = 0;
        //Berjalan selama number <= 20
        while (number <= 20) {
            //pengecekan bilangan ganjil atau genap dengan if-else
            if (number % 2 == 0) {
                System.out.println(number + " adalah bilangan genap.");
            } else {
                System.out.println(number + " adalah bilangan ganjil.");
            }
            number++;
        }
        System.out.println();
    }
}
