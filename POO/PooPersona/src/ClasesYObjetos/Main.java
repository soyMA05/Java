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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Karla", "Zambrano");
        p1.mostrarDatosF1();
        p1.correr();
        
        
        Persona p2 = new Persona("Jose", 24);
        p2.mostrarDatosF2();
        System.out.println(p2.correr(200));
        
        
    }
    
}
