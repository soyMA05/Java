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
    public static void main(String[] args) {
        Clase1 objeto1 = new Clase1();
        //modificador de acceso por defecto #NIVEL DE PAQUETE
        objeto1.atributo = 5;
        
        //modificador de acceso public #NIVEL INTERPAQUETES
        objeto1.atributo1=6;
        
        //modificador de acceso private # NIVEL DE CLASE
        //#NO se puede acceder, SOLO por metodos que estan de la misma clase, 
        
    }
}
