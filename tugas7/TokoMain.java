/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;
import java.util.Scanner;
/**
 *
 * @author delia
 */
public class TokoMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("****************************************");
            System.out.println("TOKO SERBA ADA");
            System.out.println("****************************************");

            // Meminta input item barang
            System.out.print("Masukkan Item Barang : ");
            int jumlahBarang = input.nextInt();
            input.nextLine(); 

            // Inputan akan digunakan sebagai panjang array 
            Barang[] listBelanja = new Barang[jumlahBarang];

            // Looping untuk mengisi array barang sebanyak jumlahBarang
            for (int i = 0; i < jumlahBarang; i++) {
                System.out.println("Data ke " + (i + 1));
                System.out.print("Masukkan Kode: ");
                String kodeBarang = input.nextLine();
                System.out.print("Masukkan jumlah Beli: ");
                int jumlahBeli = input.nextInt();
                input.nextLine(); 

                // Deklarasi dan inisialisasi awal namaBarang dan harga
                String namaBarang = "";
                int hargaBarang = 0;

                // Menentukan nama dan harga sesuai input kodeBarang
                switch (kodeBarang) {
                    case "a001":
                        namaBarang = "Buku";
                        hargaBarang = 3000;
                        break;
                    case "a002":
                        namaBarang = "Pensil";
                        hargaBarang = 4000;
                        break;
                    case "a003":
                        namaBarang = "Pulpen";
                        hargaBarang = 5000;
                        break;
                    default:
                        System.out.println("Kode barang tidak ditemukan!");
                        i--; // Mengurangi iterasi jika kode barang tidak ditemukan 
                        continue;
                }
                listBelanja[i] = new Barang(kodeBarang, namaBarang, hargaBarang, jumlahBeli); // Akan masuk ke array listBelanja
            }

            // Menampilkan output dimulai dari no, kode, nama, harga, jumlah beli dan jumlah bayarnya 
            System.out.println("****************************************");
            System.out.println("TOKO SERBA ADA");
            System.out.println("****************************************");
            System.out.println("No  Kode Barang  Nama Barang    Harga    Jumlah Beli  Jumlah Bayar");
            System.out.println("===================================================================");

            // Deklarasi var totalbayar yang akan digunakan untuk menyimpan total belanjaan yang harus dibayar
            int totalBayar = 0;

            // Looping untuk menghitung dan menampilkan data belanja
            for (int i = 0; i < listBelanja.length; i++) {
                Barang barang = listBelanja[i];
                int jumlahBayar = barang.getTotalBayar();
                totalBayar += jumlahBayar;
                System.out.printf("%d       %s      %s         %d         %d            %d\n", 
                    (i + 1), 
                    barang.kodeBarang, 
                    barang.namaBarang, 
                    barang.hargaBarang, 
                    barang.jumlahBeli, 
                    jumlahBayar);
            }
            System.out.println("==================================================================");
            System.out.println("Total Bayar                                         " + totalBayar);
            System.out.println("==================================================================");

            // Menanyakan apakah pengguna ingin belanja lagi
            System.out.print("Apakah Anda ingin belanja lagi? (Y/N): ");
            String jawab = input.nextLine();//Disimpan dalam var string jawab 

            // Keluar dari looping jika jawaban tidak = 'Y'
            if (!jawab.equalsIgnoreCase("Y")) {
                break; // Keluar dari loop
            }
        }

        System.out.println("Terima kasih telah berbelanja di Toko Serba Ada!");
        input.close();
    }
}
