package models;

public class Triangulo 
{
    //Propiedades
    private double a;
    private double b;
    private double c;
    
    //Encapsular (get/set)
    public double getA()
    {
        return this.a;
    }
    public void setA(double valor)
    {
        this.a = valor;
    }

    public double getB()
    {
        return this.b;
    }
    public void setB(double valor)
    {
        this.b = valor;
    }

    public double getC()
    {
        return this.c;
    }
    public void setC(double valor)
    {
        this.c = valor;
    }
    
    //Constructor
    public Triangulo() {}
    
    public Triangulo(double _a, double _b, double _c)
    {
        this.a = _a;
        this.b = _b;
        this.c = _c;
    }
    
    //Metodos
    public boolean getExiste()
    {
        //TEOREMA EXISTENCIA
        boolean condicionA = (Math.abs(this.b-this.c)<this.a)&&(this.a<(this.b+this.c));
        boolean condicionB = (Math.abs(this.a-this.c)<this.b)&&(this.b<(this.a+this.c));
        boolean condicionC = (Math.abs(this.b-this.a)<this.c)&&(this.c<(this.b+this.a));

        boolean existe = condicionA && condicionB && condicionC;
        
        return existe;
    }
    
    public double getPerimetro()
    {
        double perimetro;
        if(this.getExiste())
        {
            perimetro = (this.a + this.b + this.c);
        }else{
            perimetro = 0.0;
        }
        return perimetro;
    }
    
    public double getArea()
    {
        double area;
        if(this.getExiste())
        {
            double s = this.getPerimetro()/2;
            area = Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
        }else{
            area = 0.0;
        }
        return area;
    }
    
    public String getTipo()
    {
        String tipo;
        if(this.getExiste())
        {
            if((this.a==this.b)&&(this.b==this.c)&&(this.a==this.c))
            {
                tipo = "Equilatero";
            }else if((this.a==this.b)||(this.b==this.c)||(this.a==this.c)){
                tipo = "Isoceles";
            }else{
                tipo = "Escaleno";
            }            
        }else{
            tipo = "-No existe-";
        }
        
        return tipo;
    }
    
}
