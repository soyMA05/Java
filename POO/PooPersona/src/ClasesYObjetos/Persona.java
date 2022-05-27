/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYObjetos;

/**
 *
 * @author miancastillo
 */
public class Persona {
    //atributos
    String nombre;
    String apellido;
    int edad;
            
    //Metodo Constructor(FORMA 1)
    public Persona(String _nombre, String _apellido){
        nombre = _nombre;
        apellido = _apellido;
    }
    
    //SOBRECARGA Metodo Constructor(FORMA 2)
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //metodo de accion de clase
    public void correr(){
        System.out.println("Soy " + nombre +" y me gusta correr." );
    }
    //SOBRECARGA de accion de clase
    public String correr(int distancia){
        String mensaje = "Soy " + nombre +" tengo " + edad +" años y todas las mañanas corro " + String.valueOf(distancia)+ " metros. ";
        return mensaje;
    }
    
    public void mostrarDatosF1(){
        System.out.println("--------Mostrar datos constructor 1--------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
    
    public void mostrarDatosF2(){
        System.out.println("--------Mostrar datos constructor 2--------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
