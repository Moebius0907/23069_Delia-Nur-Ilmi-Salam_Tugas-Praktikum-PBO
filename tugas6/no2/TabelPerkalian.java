/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6.no2;

/**
 *
 * @author delia
 */
public class TabelPerkalian {
    
    private int n;
    
    // Konstructor untuk menerima nilai n
    public TabelPerkalian(int x){
        this.n = x;
    }
    
    // Metode untuk mencetak tabel perkalian
    public void getOutput(){
        System.out.print("  ");
        for(int i = 1; i <= this.n; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n");
        
        // Mencetak tabel perkalian
        for(int j = 1; j <= this.n; j++){
            if(j > 1){
                System.out.print("\n");
            }
            System.out.print(j + " ");
            for(int k = j; k <= this.n*j; k++){
                        if(k % j == 0){
                           System.out.print(k + " "); 
                        }      
            }
        }
    }
    
}
