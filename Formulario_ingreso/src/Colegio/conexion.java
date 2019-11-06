/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colegio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class conexion {
   
   //public static void conexion(){
//static Connection conexion();
private static String  url = "jdbc:mysql://localhost:3306/colegio";
private static String user = "root";
private static String pass = "123";
 static Connection conexion;
 
 public static Connection getConexion(){

try {
 
 conexion = DriverManager.getConnection(url, user,pass);
System.out.println("Conectado!!");

}catch(SQLException e){
System.out.println(e.getMessage());
}  
return conexion;
 }

}
