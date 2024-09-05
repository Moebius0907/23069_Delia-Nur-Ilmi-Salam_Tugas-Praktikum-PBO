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
public class LaguBingo {
    //Deklarasi attribut dengan acces privat atau hanya bisa diakses pada class LaguBingo
    private String lirikAwal;
    private String bingo;

    public LaguBingo() {//Konstruktor
        this.lirikAwal = "There was a farmer who had a dog\nAnd Bingo was his name-o.\n";
        this.bingo = "B-I-N-G-O";
    }

    public void nyanyikanLagu() {
        for (int i = 0; i <= 5; i++) {//Looping untuk menampilkan lirik sebanyak 6x atau 6 paragraf
            System.out.println(lirikAwal);
            for (int j = 0; j < 3; j++) {//Looping untuk menampilkan lirik kode di dalamnya sebanyak 3 kali
                for (int k = 0; k < i; k++) {//Looping untuk menampilkan lirik "clap" sebanyak i 
                    System.out.print("(clap)-");
                }
                if (i < 5) {//Pengkondisian jika i < 5
                    System.out.println(bingo.substring(i * 2));// Mencetak sisa dari string "B-I-N-G-O" mulai dari indeks i*2
                } else {
                    System.out.println(); //Jika tidak menecetak baris kosong
                }
            }
            System.out.println("And Bingo was his name-o.\n");
        }
    }
}