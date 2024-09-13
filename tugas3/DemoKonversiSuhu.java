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
public class DemoKonversiSuhu {
    public static void main(String[] args) {
       
        // Membuat objek dari class KonversiSuhu2
        KonversiSuhu2 Suhu2 = new KonversiSuhu2();

        // Memanggil method dari class KonversiSuhu
        double suhuCelsius = 90.0;//mengisi nilai pada attribute suhuCelcius
        
        System.out.println("================================");//Judul Program
        System.out.println("  KALKULATOR KONVERSI SUHU");
        System.out.println("================================");
        
        System.out.println(suhuCelsius + "°C dalam Fahrenheit: " + Suhu2.celciusToFahrenheit(suhuCelsius) + "°F");
        System.out.println(suhuCelsius + "°C dalam Reamur: " + Suhu2.celciusToReamur(suhuCelsius) + "°R");
        
        // Memanggil method dari class KonversiSuhu2
        double suhuFahrenheit = Suhu2.celciusToFahrenheit(suhuCelsius);
        System.out.println(suhuFahrenheit + "°F dalam Reamur: " + Suhu2.fahrenheitToReamur(suhuFahrenheit) + "°R");
    }
}
