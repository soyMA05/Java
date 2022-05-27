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
public class Clase2 {
    public static void main (String [] args){
        
        Clase1 objeto1 = new Clase1(20,"Karla",23,"23002035578");//#la cedula es privada no se cambia
        objeto1.SetEdad(23);
        System.out.println("Edad: "+ objeto1.GetEdad());
        System.out.println("Nombre: " + objeto1.getNombre());
        System.out.println("Pronvicia: " + objeto1.getIdProvincia());
       
    }
}
