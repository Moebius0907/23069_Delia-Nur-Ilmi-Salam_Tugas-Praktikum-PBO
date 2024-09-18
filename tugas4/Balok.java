/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author delia
 */
public class Balok extends Geometri{//Subclas dari Geometri
    
    //deklarasi attribute yang akan digunakan pada class Balok
    //accesnya private sehingga hanya bisa diakses di class ini saja
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {//Konstruktor 
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {//Method untuk menghitung volumebalok
        return panjang * lebar * tinggi;
    }

    @Override
    public double luasPermukaan() {//Method  untuk menghitung luas permukaan balok
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}
