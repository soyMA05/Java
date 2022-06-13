    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author miancastillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //variables
        Scanner entrada = new Scanner(System.in);
        Cuadrilatero cuadrilatero;
        
        //Ingreso de datos
        float lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la longitud de un lado del cuadrilatero: "));
        float lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la longitud de lado 2 del cuadrilatero: "));
        
        //condicion para la inicializar el constructor
        if(lado1 == lado2){
            cuadrilatero = new Cuadrilatero(lado1);
        }else{
            cuadrilatero = new Cuadrilatero(lado1, lado2);
        }
        System.out.println("***Cuadrado***\n: Area: "+ cuadrilatero.getArea() + "\n Perimetro: "+ cuadrilatero.getperimetro());
    }
    
}
