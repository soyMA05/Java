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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona("Jaime", "Kaviedes", 45, "1708205444", "H");
        System.out.println("***Datos*** \n"+persona.obtenerDatos());
    }
    
}
