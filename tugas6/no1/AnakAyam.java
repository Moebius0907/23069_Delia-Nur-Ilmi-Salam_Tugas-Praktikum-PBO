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
public class AnakAyam {
    
    //Metode untuk menampilkan lagu anak ayam dengann looping do while
    public void tampilkanLagu(int jumlahAnakAyam) {
        System.out.println("Lagu Anak Ayam Turun N:");
        
        int i = jumlahAnakAyam; // Inisialisasi jumlah anak ayam
        do {
            if (i == 1) {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggal " + (i - 1) + ".");
            }
            i--; // Mengurangi jumlah anak ayam
        } while (i > 0); // Kondisi untuk terus mengulang
    } 
}
