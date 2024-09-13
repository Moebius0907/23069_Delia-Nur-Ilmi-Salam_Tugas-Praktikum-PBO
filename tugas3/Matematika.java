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
public class Matematika {
    
    public int pertambahan(int a, int b){//method untuk operasi pertambahan
      return a+b;//akan mengembalikan hasil penjumlahan a dan b  
    }
    
    
    public int pengurangan(int a, int b){//method untuk operasi pengurangan 
        return a-b;//akan mengembalikan hasil pengurangan a dan b 
    }
    
   
    public int perkalian(int a, int b){//method untuk operasi perkalian
        return a*b;//akan mengembalikan hasil perkalian a dan b 
    }
    
 
    public int pembagian(int a,int b){//method untuk operasi pembagian 
        if (b != 0){//pengkondisian untuk menangani pembagi sama dengan 0
             return a/b;
        }
        System.out.println("Pembagi tidak boleh sama dengan 0");//jika pembagi 0 akan menampilkan output berikut 
        return 0;//mengakhiri program
    }
}

    

