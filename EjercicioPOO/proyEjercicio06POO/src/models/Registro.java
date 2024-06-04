package models;

public class Registro 
{
    //Propiedades
    private double n1;
    private double n2;
    private double n3;
    private double n4;
    
    //Encapsulados
    public double getN1() {
        return n1;
    }
    public void setN1(double _n1) {
        this.n1 = _n1;
    }

    public double getN2() {
        return n2;
    }
    public void setN2(double _n2) {
        this.n2 = _n2;
    }

    public double getN3() {
        return n3;
    }
    public void setN3(double _n3) {
        this.n3 = _n3;
    }

    public double getN4() {
        return n4;
    }
    public void setN4(double _n4) {
        this.n4 = _n4;
    }

    //Constructores
    public Registro() {}
    public Registro(double _n1, double _n2, double _n3, double _n4) {
        this.n1 = _n1;
        this.n2 = _n2;
        this.n3 = _n3;
        this.n4 = _n4;
    }

    //Metodos
    public double getMenor()
    {
        //Determinar el menor 
        double menor;

        menor = this.n1;

        if(this.n2<menor){
            menor = this.n2;
        }
        if(this.n3<menor){
            menor = this.n3;
        }
        if(this.n4<menor){
            menor = this.n4;
        }
        
        return menor;
    }
    public double getMayor()
    {
        //Determinar el menor 
        double mayor;

        mayor = this.n1;

        if(this.n2>mayor){
            mayor = this.n2;
        }
        if(this.n3>mayor){
            mayor = this.n3;
        }
        if(this.n4>mayor){
            mayor = this.n4;
        }
        
        return mayor;
    }
    
    public double getPromedio()
    {
        //Calcular
	double promedio = (this.n1+this.n2+this.n3+this.n4-this.getMenor()+this.getMayor())/4.0;
        
        return promedio;
    }
    public String getEstado()
    {
        String estado;
        if(this.getPromedio()>=11)
        {
            estado = "Aprobado";
        }else{
            estado = "Desaprobado";
        }
        return estado;
    }
    
    public String getCalificacion()
    {
        String calificacion;

        if(this.getPromedio()>=18.0){
            calificacion="Excelente";
        }else if(this.getPromedio()>=16.0){
            calificacion="Muy bueno";
        }else if(this.getPromedio()>=14.0){
            calificacion="Bueno";
        }else if(this.getPromedio()>=11.0){
            calificacion="Regular";
        }else{
            calificacion="En progreso";
        }
        return calificacion;
    }
    
}
