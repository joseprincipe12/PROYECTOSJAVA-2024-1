package program;

//Importar las clases para JDBC
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        System.out.println("=== JDBC ===");
        
        //Leer un valor para buscar
        Scanner tec = new Scanner(System.in);
        System.out.print("Ingrese el valor: ");
        String valorBuscado = tec.next();
        
        //Para JDBC -> try - catch
        try
        {
            //(1) - Levantar el controlador
            Class.forName("com.mysql.jdbc.Driver");
            
            //(2) - Establecer conexion
            String cadena = "jdbc:mysql://127.0.0.1:3306/bdpiad303";
            String usuario = "root";
            String clave = "";
            //Asignando el objeto de conexion a la variable conexion de la clase Connection
            Connection conexion = DriverManager.getConnection(cadena, usuario, clave);
            
            //(3) - Preparar la sentencia
            PreparedStatement sentencia = conexion.prepareStatement("select * from producto where descripcion like concat('%',?,'%')");
            
            //(4) - Enviar los parametros a la sentencia
            sentencia.setString(1, valorBuscado);
            
            //(5) - Ejecutar la sentencia
            ResultSet tabla = sentencia.executeQuery();
            
            //Moviendo el puntero de registros a la primera fila
            while(tabla.next())
            {
                //Leer los valores de las columnas de la fila actual
                int id = tabla.getInt("id");
                String descripcion = tabla.getString("descripcion");
                String categoria = tabla.getString("categoria");
                double precio = tabla.getDouble("precio");

                //Mostrar los valores
                System.out.println(id + "-" + descripcion + "-" + categoria + "-" + precio);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error !");
            System.out.println(e.getMessage());
        }
        
    }
}
