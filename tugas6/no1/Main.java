/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6.no1;
import java.util.Scanner;

/**
 *
 * @author delia
 */
//Class main yang mengimplementasikan keempat kelas
public class Main {

    public static void main(String[] args) {
        
        //Membuat objek scanner
        Scanner input = new Scanner(System.in);
        
        //Program akan berjalan selama kondisinya true
        while (true) {
            //Pilihan opsi menu
            System.out.println("========================================================================");
            System.out.println("\tProgram Nomor 1");
            System.out.println("========================================================================");
            System.out.println("1. Menghitung Deret bilangan prima dan bukan dari 0 – 20 dengan Hasilnya");
            System.out.println("2. Menghitung Deret bilangan ganjil dan genap dari 0 – 20 dengan Hasilnya");
            System.out.println("3. Huruf Z – A");
            System.out.println("4. Lagu “Anak Ayam Turun N”");
            System.out.println("5. Keluar"); // Opsi untuk keluar dari program
            System.out.println("========================================================================");
            System.out.print("Masukkan Pilihan (1-5): ");
            
            int pilihan = input.nextInt(); // Menerima input angka
            
            switch (pilihan) {
                case 1:
                    // Menghitung Deret bilangan prima
                    BilanganPrima bilanganPrima = new BilanganPrima();
                    bilanganPrima.tampilkanBilanganPrima();
                    break;
                case 2:
                    // Menghitung Deret bilangan ganjil dan genap
                    GanjilGenap bilanganGanjilGenap = new GanjilGenap();
                    bilanganGanjilGenap.tampilkanGanjilGenap();
                    break;
                case 3:
                    // Menampilkan huruf Z-A
                    Alphabet deretHuruf = new Alphabet();
                    deretHuruf.getAlphabet();
                    break;
                case 4:
                    //Meminta input jumlah anak ayam (n)
                    System.out.print("Masukkan jumlah anak ayam : ");
                    int jumlahAnakAyam = input.nextInt();
                    
                    // Menampilkan lagu
                    AnakAyam laguAnakAyam = new AnakAyam();
                    laguAnakAyam.tampilkanLagu(jumlahAnakAyam);
                    break;
                case 5:
                    System.out.println("Terima kasih! Program selesai.");
                    input.close(); // Menutup scanner sebelum keluar
                    return; // Keluar dari program
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan angka 1-5.");
                    break;
            }
        }
    }
}
