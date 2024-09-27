/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas5;
import java.util.Scanner;//import library scanner

/**
 *
 * @author delia
 */
public class dataMahasiswaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//membuat object scanner untuk input user
        dataMahasiswa mhs = new dataMahasiswa();//membuat object dari class dataMahasiswa
        int pilihan;//attribut pilihan yang akan digunakan sebagai ekspresi di switch 
        
        //Looping do-while
        do {
            System.out.println("===========================");
            System.out.println(" Menu Data Nilai Mahasiswa ");
            System.out.println("===========================");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.println("===========================");
            System.out.print("Pilih menu (1-3) : ");
            pilihan = input.nextInt();
            System.out.println("===========================");

            switch (pilihan) {//Pengkondisian switch berdasarkan pilihan menu user 
                case 1://Menginput data
                    input.nextLine(); //Membersihkan
                    System.out.print("Masukkan Nama : ");
                    mhs.nama = input.nextLine();
                    System.out.print("Masukkan NPM : ");
                    mhs.NPM = input.nextLine();
                    System.out.print("Masukkan Nilai Kehadiran : ");
                    mhs.nilaiAbsen = input.nextDouble();
                    System.out.print("Masukkan Nilai Tugas : ");
                    mhs.nilaiTugas = input.nextDouble();
                    System.out.print("Masukkan Nilai UTS : ");
                    mhs.nilaiUTS = input.nextDouble();
                    System.out.print("Masukkan Nilai UAS : ");
                    mhs.nilaiUAS = input.nextDouble();
                    System.out.println("Data berhasil diinput!");
                    break;
                case 2://Menampilkan data 
                    mhs.getOutput();
                    break;
                case 3://Keluar dari program
                    System.out.println("Keluar dari program.Terima Kasih");
                    break;
                default://Input selain 1-3
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);//Loop berjalan selama memenuhi kondisi berikut
    }
}
    
