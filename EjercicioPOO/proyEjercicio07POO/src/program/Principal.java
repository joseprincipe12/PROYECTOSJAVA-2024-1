package program;

//Importar la clase Scanner
import java.util.Scanner;
import models.Trabajador;
import java.util.ArrayList;

public class Principal 
{
    public static void main(String[] args) 
    {
        //Instanciar la clase Scanner
	Scanner tec = new Scanner(System.in);
        //Instanciar un ArrayList de trabajadores
        ArrayList<Trabajador> listaTrabajadores = new ArrayList<Trabajador>();
        
        //Variable de control
        char respuesta;
        //Leer valores y asignar al objeto
        //Agregar al ArrayList
        do{
            //Leer valores
            System.out.print("codigo: ");
            int codigo = tec.nextInt();
            System.out.print("Nombre: ");
            String nombre = tec.next();
            System.out.print("Sueldo: ");
            double sueldo = tec.nextDouble();
            
            //Instanciar el trabajador con los valores
            Trabajador objTrabajador = new Trabajador(codigo, nombre, sueldo);
            
            //Agregar el trabajador al arraylist
            listaTrabajadores.add(objTrabajador);
            
            //Pregunta de control
            System.out.print("Continuar ? [s/n]: ");
            respuesta = tec.next().charAt(0);
 
        }while(respuesta=='s');
        
        System.out.println("Lista de Trabajadores");
        System.out.println("======================");
        //ForEach
        for(Trabajador t:listaTrabajadores)
        {
            //System.out.println(t.getCodigo() + " - " + t.getNombre() + " - " + t.getSueldo() + " - AFP: " + t.getAFP() + " - Neto: " + t.getSueldoNeto());
            System.out.println(t.getInformacion());
        }   
    }
}
