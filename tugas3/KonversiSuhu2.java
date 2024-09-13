/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author delia
 */
public class KonversiSuhu2 extends KonversiSuhu{
    
    //Method untuk mengonversi dari Fahrenheit ke Celcius,yang akan digunakan pada fungsi FahreinhetToReamur
    //acces private, hanya bisa diakses pada class konversiSuhu2
    private double fahrenheitToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

     // Method untuk mengonversi dari Fahrenheit ke Reamur dengan memanfaatkan fahrenheitToCelcius()
    public double fahrenheitToReamur(double fahrenheit) {
        // Memanggil method fahrenheitToCelcius terlebih dahulu
        double celsius = fahrenheitToCelcius(fahrenheit);
        
        // Menggunakan hasil Celcius untuk dikonversi ke Reamur
        return celciusToReamur(celsius);//method yang berasal dari class matematika1
    }
}
