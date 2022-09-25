package ecommerce_manager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;

public class ConexaoMYSQL {
    public static Connection con = null;
    public static void ConectarMYSQL(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con = DriverManager.getConnection("jdbc:mysql://localhost/ECommerce1","root","");
            System.out.println("Conectado");
        } catch (ClassNotFoundException ex){
            System.out.println(ex);
        }catch (SQLException e){
               System.out.println(e);
               throw new RuntimeException(e);
        }
    }

}