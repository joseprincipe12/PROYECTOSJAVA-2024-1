package models;

public class Rectangulo 
{
    //Propiedades
    private double largo;
    private double ancho;
    
    //Constructor
    public Rectangulo() {}
    
    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    //Encapsulado
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
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
