/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6.no1;

/**
 *
 * @author delia
 */
public class Alphabet {
    char huruf;
    
    //Metode untuk mencetak alphabet dari a-z menggunakan looping for
    public void getAlphabet(){
        for (huruf = 'Z'; huruf >= 'A'; huruf--){
            System.out.print(huruf + " ");
        }
         System.out.println();
   }   
     
}
