/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;

/**
 *
 * @author delia
 */
public class Barang {
    //Attribute-attribute yang akan dimiliki oleh object barang
    //di set protected agar hanya bisa diakses oleh kelas lain di package yang sama
    protected String kodeBarang, namaBarang;
    protected int hargaBarang, jumlahBeli;
    
    //Konstruktor 
    protected Barang(String kodeBarang, String namaBarang, int hargaBarang, int jumlahBeli){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
    }

    protected int getTotalBayar(){
        return hargaBarang*jumlahBeli;
    }
    
}
