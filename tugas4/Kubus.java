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
public class Kubus extends Geometri{//Subclass dari Geometri 
    
    //deklarasi attribute yang accesnya private
    private double sisi;

    public Kubus(double sisi) {//Konstruktor 
        this.sisi = sisi;
    }

    @Override
    public double volume() {//Method untuk menghitung volume  kubus
        return sisi * sisi * sisi;
    }

    @Override
    public double luasPermukaan() {//Method untuk menghitung luas Permukaan kubus
        return 6 * (sisi * sisi);
    }
    
}
