/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas10;
import tugas10.ConDb;
import java.sql.*;
/**
 *
 * @author delia
 */
public class MyJDBC {
    
    //Method untuk mengecek user sudah ada di database belum 
    public static boolean checkUser(String username){
        try{
           Connection konek = DriverManager.getConnection(ConDb.DB_URL, ConDb.DB_USERNAME, ConDb.DB_PASSWORD);
           
           PreparedStatement checkUserExists = konek.prepareStatement("SELECT * FROM " + ConDb.DB_USERS_TABLE_NAME + " WHERE USERNAME = ?");
           
           checkUserExists.setString(1, username);
           
           ResultSet  resultSet = checkUserExists.executeQuery();
           
           if(!resultSet.isBeforeFirst()){
               return false;
           }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return true;
    }
    
    //Method untuk melakukan pendaftaran pengguna baru dengan username dan password.
    public static boolean register(String username, String password){
        //Memeriksa username dan password sudah ada di database belum
        try {
            //Jika belum ada 
            if (!checkUser(username)){
                Connection konek = DriverManager.getConnection(ConDb.DB_URL, ConDb.DB_USERNAME, ConDb.DB_PASSWORD);
            
            PreparedStatement insertUser = konek.prepareStatement("INSERT INTO " + ConDb.DB_USERS_TABLE_NAME + "(username, password)" + "VALUES(?, ?)");
            //Di insert ke database 
            insertUser.setString(1, username);
            insertUser.setString(2, password);
            //Perintah SQL untuk menambahkan pengguna baru ke database.
            insertUser.executeUpdate();
            return true;//Pendaftaran berhasil 
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
    
    //Method untuk memvalidasi login
    public static boolean validasiLogin(String username, String password){
        try{
            Connection konek = DriverManager.getConnection(ConDb.DB_URL, ConDb.DB_USERNAME, ConDb.DB_PASSWORD);
            
            PreparedStatement validasiUser = konek.prepareStatement("SELECT * FROM " + ConDb.DB_USERS_TABLE_NAME + " WHERE USERNAME = ? AND PASSWORD = ?");
            validasiUser.setString(1, username);
            validasiUser.setString(2, password);
            
            ResultSet resultSet = validasiUser.executeQuery();
            
            if(!resultSet.isBeforeFirst()){
                return false;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return true;
    }
    
}
