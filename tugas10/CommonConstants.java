/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas10;
import java.sql.*;

/**
 *
 * @author delia
 */
//Class yang berisi deklarasi konstanta koneksi ke database
public class CommonConstants {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";//nama driver
    static final String DB_URL = "jdbc:mysql://localhost/LoginApkKalkulator";//nama database
    static final String DB_USERNAME = "root";//set default username 
    static final String DB_PASSWORD = "";//set default password
    static final String DB_USERS_TABLE_NAME = "pengguna";//nama table
}
