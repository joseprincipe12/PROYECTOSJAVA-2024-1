package models;

import models.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Set;

public class Cliente {
    //Atributos
    private int id;
    private String nombre;
    private String numruc;
    private String direccion;
    private String telefono;
    
    //Encapsulamiento
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNumruc() {
        return numruc;
    }
    public void setNumruc(String numruc) {
        this.numruc = numruc;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //Constructor
    public Cliente() {
       
    }
    
    public Cliente(int id, String nombre, String numruc, String direccion, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.numruc = numruc;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    //Metodos
    
    public Cliente getBuscarById(int idBuscar){
        //Instanciamos la clase cliente
        Cliente cliente = new Cliente();
        
        try{
            //Establecemos conexion
            Connection cnx = Conexion.getConexion();
            //Preparamos la instruccion sql
            PreparedStatement ps = cnx.prepareStatement("select * from cliente where id=?");
            //pasar los valores de los parametros sql
            ps.setInt(1, idBuscar);
            //Ejecutar SQL
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                //Leer los valores de la fila
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setNumruc(rs.getString("numruc"));
                cliente.setDireccion(rs.getString("direccion"));
                cliente.setTelefono(rs.getString("telefono"));
            }else{
                //Asignamos valores por defecto
                cliente.setId(0);
                cliente.setNombre("");
                cliente.setNumruc("");
                cliente.setDireccion("");
                cliente.setTelefono("");
            }
            
            
        }catch(Exception e){
            //Contraolamos los errores
            cliente.setId(-1);
            cliente.setNombre("-- ERROR DE CONEXION --");
            cliente.setNumruc("");
            cliente.setDireccion("");
            cliente.setTelefono("");
        }
      
        return cliente;
    }
    
    public int setInsertar(Cliente cliente){
        //Instanciamos la clase cliente
        int nuevoId;
        
        try{
            //Establecemos conexion
            Connection cnx = Conexion.getConexion();
            //Preparamos la instruccion sql
            PreparedStatement ps = cnx.prepareStatement("insert into cliente(nombre, numruc, direccion, telefono) values(?,?,?,?);");
            //pasar los valores de los parametros sql
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getNumruc());
            ps.setString(3, cliente.getDireccion());
            ps.setString(4, cliente.getTelefono());
            //Ejecutar la instrcuccion SQL
            ps.executeUpdate(); //INSERT-UPDATE-DELETE
            
            //Preparamos la instruccion sql
            ps = cnx.prepareStatement("select max(id) as nuevoId from cliente");
            //Ejecutar SQL
            ResultSet rs = ps.executeQuery();//SQL
            
            if(rs.next()){
                //Leer nuevo id
                nuevoId = rs.getInt("nuevoId");
            }else{
                //Asignamos valores por defecto
                nuevoId = 0;
            }
            
            
        }catch(Exception e){
            //Contraolamos los errores
            nuevoId = -1;
            System.out.println("Error!");
            System.out.println(e.getMessage());
        }
      
        return nuevoId;
    }
    
    public void setAtcualizar(Cliente cliente){
  
        try{
            //Establecemos conexion
            Connection cnx = Conexion.getConexion();
            //Preparamos la instruccion sql
            PreparedStatement ps = cnx.prepareStatement("update cliente set nombre=?, numruc=?, direccion=?, telefono=? where id=?;");
            //pasar los valores de los parametros sql
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getNumruc());
            ps.setString(3, cliente.getDireccion());
            ps.setString(4, cliente.getTelefono());
            ps.setInt(5, cliente.getId());
            //Ejecutar la instrcuccion SQL
            ps.executeUpdate(); //INSERT-UPDATE-DELETE
            
            
        }catch(Exception e){
            //Contraolamos los errores
            System.out.println("Error!");
            System.out.println(e.getMessage());
        }
      

    }
    
    public void setEliminar(int idEliminar){
        try{
             //Establecemos conexion
            Connection cnx = Conexion.getConexion();
            //Preparamos la instruccion sql
            PreparedStatement ps = cnx.prepareStatement("delete from cliente where id=?;");
            //Pasar los valores de los parametros SQL
            ps.setInt(1, idEliminar);
            //Ejecutar la instrcuccion SQL
            ps.executeUpdate(); //INSERT-UPDATE-DELETE
        }catch(Exception e){
            //Contraolamos los errores
            System.out.println("Error!");
            System.out.println(e.getMessage());
        }
    }
}
