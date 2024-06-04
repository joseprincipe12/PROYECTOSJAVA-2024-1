import java.util.Scanner;
import models.Rectangulo;

public class Principal 
{
    //Propiedades
    
    //Metodos
    public static void main(String[] args) 
    {
        //Instanciar la clase Scanner
        Scanner objTeclado = new Scanner(System.in);
        
        //Lectura de valores de entrada
        System.out.print("Largo: ");
        double largo = objTeclado.nextDouble();
        System.out.print("Ancho: ");
        double ancho = objTeclado.nextDouble();
        
        /*
        //Utilizar el encapsulamiento
        objRectangulo.setLargo(largo);
        objRectangulo.setAncho(ancho);
        */
        
        //Utilizar el metodo constructor
        //Instanciar la clase Rectangulo
        Rectangulo objRectangulo = new Rectangulo(largo, ancho);
        
        //Imprimir resultados
        System.out.println("Perimetro: " + objRectangulo.getPerimetro());
        System.out.println("Area: " + objRectangulo.getArea());
        System.out.println("Diagonal: " + objRectangulo.getDiagonal());
        
    }
}
