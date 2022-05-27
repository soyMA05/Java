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
public class Clase1 {
    //atributos 
    private int edad;
    private String nombre;
    private int idProvincia;
    //variable estatica
    private final String cedula; //#cedula nunca cambia por eso estatica y no es visible en ninguna otra clase
    

    public Clase1(int edad, String nombre, int idProvincia, String _cedula) {
        this.edad = edad;
        this.nombre = nombre;
        this.idProvincia = idProvincia;
        this.cedula = _cedula;
    }

    //#Metodos accesores de forma automatica
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }
    
    //#Forma manual
    //Metodo Setter: Establecer la edad
    public void SetEdad(int _edad){
        this.edad = _edad;
    }
    
    //Metodo Getter: Mostramos la edad
    public int GetEdad(){
        return edad;
    }
}
