/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;

/**
 *
 * @author Lab Informatika
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/responsi";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statment;
    
    public Connector(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Koneksi berhasil");
        } catch(Exception e){
            
            System.out.println("Koneksi Gagal"); 
        }
    }
}
