package models;

public class Rectangulo 
{
    //Propiedades
    private double largo;
    private double ancho;
    
    //Encapsular
    public double getLargo()
    {
        return this.largo;
    }
    public void setLargo(double valor)
    {
        this.largo = valor;
    }
    public double getAncho()
    {
        return this.ancho;
    }
    public void setAncho(double valor)
    {
        this.ancho = valor;
    }
    //Constructor (declarar explicitamente)
    public Rectangulo()
    {
        System.out.println("Constructor predeterminado:");
    }
    public Rectangulo(double _largo, double _ancho)
    {
        System.out.println("Constructor parametrizado:");
        this.largo = _largo;
        this.ancho = _ancho;
    }
    
    //Metodos: get / set
    public double getPerimetro()
    {
        double perimetro = 2 * (this.largo + this.ancho);
        return perimetro;
    }
    public double getArea()
    {
        double area = this.largo*this.ancho;
        return area;
    }
    public double getDiagonal()
    {
        double diagonal = Math.sqrt(Math.pow(this.largo, 2)+Math.pow(this.ancho,2 ));
        return diagonal;
    }
}
