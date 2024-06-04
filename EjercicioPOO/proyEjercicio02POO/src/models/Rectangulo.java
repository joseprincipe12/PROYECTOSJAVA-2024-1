package models;

public class Rectangulo 
{
    //Propiedades
    public double largo;
    public double ancho;
    
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
