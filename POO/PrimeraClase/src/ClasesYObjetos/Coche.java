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
public class Coche {
    
    //atributos
    String color;
    String marca;
    int km;
    
    //metodo
    public static void main(String [] args){
        Coche coche1 = new Coche();
        coche1.color = "Negro";
        coche1.marca = "Toyota";
        coche1.km = 0;
        
        //System.out.println(new Coche().color = "rojo"); 
        System.out.println("Detalles del coche: \n" + coche1.color + "\n" + coche1.marca + "\n" +coche1.km);
    }
}
