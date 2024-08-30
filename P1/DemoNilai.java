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
public class DemoNilai {
    public static void main(String[] args) {
        
        Nilai mahasiswa1 = new Nilai("2310631170069", "Delia Nur Ilmi Salam", 100, 80, 90, 95);
        Nilai mahasiswa2 = new Nilai ("2310631170003", "Afifah Fadilah", 100, 90, 95, 85);
       
        System.out.println("=================================================");
        System.out.println("\t\tData Nilai Mahasiswa");
        System.out.println("=================================================");
        mahasiswa1.cetakNilai();
        System.out.println("=================================================");
        mahasiswa2.cetakNilai();
        System.out.println("=================================================");
    }
}
