/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas8.no2;
import java.time.YearMonth;//kelas dari java untuk menentukan jumlah hari dalam bulan tertentu berdasarkan input tahun dan bulan.
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author delia
 */
public class HitungHari {
    
    // Metode untuk mendapatkan nama bulan berdasarkan index (0-11)
    public String checkIndexBulan(int index){
        String bulan = "";
        
        // Menggunakan switch-case untuk mencocokkan index dengan nama bulan
        switch(index){
            case 0:
                bulan = "Januari";
                break;
            case 1:
                bulan = "Februari";
                break;
            case 2:
                bulan = "Maret";
                break;
            case 3:
                bulan = "April";
                break;
            case 4:
                bulan = "Mei";
                break;
            case 5:
                bulan = "Juni";
                break;
            case 6:
                bulan = "Juli";
                break;
            case 7:
                bulan = "Agustus";
                break;
            case 8:
                bulan = "September";
                break;
            case 9:
                bulan = "Oktober";
                break;
            case 10:
                bulan = "November";
                break;
            case 11:
                bulan = "Desember";
                break;
        }
        
        return bulan;
    }
    
    
    //metode untuk menghitung jumlah hari
     public long hitungHari(int tahun, int bulan){//menerima 2 parameter berupa tahun dan bulan 
         
        // Membuat objek YearMonth berdasarkan tahun dan bulan yang diberikan
        YearMonth tahunBulan = YearMonth.of(tahun, bulan);
        
        long jumlahHari = tahunBulan.lengthOfMonth(); //inisialisasi jumlahHari dengan pemanggilan method lengthMonth
        
        return jumlahHari;
    }
    
    
    //Metode untuk menyimpan hasil ke bentuk .txt
     public static void saveTextToFile(String textToSave) {
        try {
            // Ganti path dengan lokasi dan nama file yang Anda inginkan
            File file = new File("C:\\Users\\delia\\Downloads\\output.txt");

            // Membuat FileWriter untuk menulis ke file
            FileWriter fileWriter = new FileWriter(file);

            // Membuat BufferedWriter untuk menulis teks ke FileWriter
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Menulis teks dari JTextField ke file
            writer.write(textToSave);

            // Menutup BufferedWriter
            writer.close();

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan file: " + e.getMessage());
        }
    }
    
}
