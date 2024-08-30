/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author delia
 */
public class MahasiswaBeraksi {
    
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();//Pembuatan object mahasiswa1 dari class Mahasiswa
        Mahasiswa mahasiswa2 = new Mahasiswa();
        Mahasiswa mahasiswa3 = new Mahasiswa();
        
    
        //pengisian nama mahasiswa
        mahasiswa1.nama = "1. Delia Nur Ilmi Salam";
        mahasiswa2.nama = "2. Afifah Fadilah";
        mahasiswa3.nama = "3. Zahra Fadhilatusyifa";
        
        //Pemanggilan ketiga fungsi    
        mahasiswa1.membaca();
        mahasiswa2.nyontek();
        mahasiswa3.modifikasi();
    }
    
}
