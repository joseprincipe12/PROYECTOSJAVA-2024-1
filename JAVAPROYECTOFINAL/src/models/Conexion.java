package models;

import java.sql.DriverManager;
import java.sql.Connection;

public class Conexion {
    
    public static Connection getConexion(){
        //Declaramos la variable para la conexion
        Connection conexion;
        
        //Controlamos la expecion try catch
        try{
            //Conexion a JDBC
            //Cargar el controlador
            Class.forName("com.mysql.jdbc.Driver");
            
            //Declaramos las variable de parametro de conexion
            String cadena = "jdbc:mysql://127.0.0.1:3306/bdpiad303";
            String usuario = "root";
            String clave = "";
            
            //instanaciamos y abrir la conexion
            conexion = DriverManager.getConnection(cadena, usuario, clave);
            
        }catch(Exception e){
            conexion = null;
            System.out.println("-- Error! --");
            System.out.println(e.getMessage());
        }
        
        return conexion;
    }
}
