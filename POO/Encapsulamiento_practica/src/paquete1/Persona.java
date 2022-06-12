/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author miancastillo
 */
public class Persona {
    
    //Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String cedula;
    private String sexo;
    
    //Metodo constructor
    public Persona(String _nombre, String _apellido, int _edad, String _cedula, String _sexo){
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.edad = _edad;
        this.cedula = _cedula;
        this.sexo = _sexo;
    }
    
    //Metodos accesores de atributos
    
    //#Obtener datos
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public String getCedula(){
        return this.cedula;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    //#Establecer valores a los atributos del objeto
   public void setNombre(String _nombre){
       this.nombre = _nombre;
   } 
   
   public void setApellido(String _apellido){
       this.apellido = _apellido;
   }

    public void setEdad(int _edad) {
        this.edad = _edad;
    }

    public void setCedula(String _cedula) {
        this.cedula = _cedula;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
   
    private String obtenerDatos(){
       String textoDatos = this.nombre + " "+ this.apellido +" " + Integer.toString(edad) + " " + this.cedula + " " +this.sexo +"\n\n---------\n\n";
       return textoDatos;
    }
    
    public String mostrarDatos(){
        return obtenerDatos();
    }
    
}
