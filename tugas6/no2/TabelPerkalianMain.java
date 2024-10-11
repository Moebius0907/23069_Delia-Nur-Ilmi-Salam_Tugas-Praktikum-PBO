/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6.no2;
import java.util.Scanner;

/**
 *
 * @author delia
 */
public class TabelPerkalianMain {

      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String repeat;

        do {
            System.out.print("Masukkan n yang anda inginkan (<= 10): ");
            int n = input.nextInt();

            // Memastikan nilai n tidak lebih dari 10
            while (n < 1 || n > 10) {
                System.out.print("Nilai n harus antara 1 dan 10. Masukkan n yang anda inginkan: ");
                n = input.nextInt();
            }

            TabelPerkalian num = new TabelPerkalian(n);
            num.getOutput();
            
            System.out.println();

            // Menanyakan apakah user ingin mengulang program atau tidak 
            System.out.print("Ulangi program (Y/N): ");
            repeat = input.next();
        } while (repeat.equalsIgnoreCase("Y")); // Mengulangi jika user memasukkan 'Y' atau 'y'

        System.out.println("Terima kasih! Program selesai.");
        input.close(); // Menutup scanner
    }
}
