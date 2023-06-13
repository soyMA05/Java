/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15_arreglos;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author MIANCAS
 */
public class Ejercicio15Arreglos {

    /*
    15.	Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la tabla. 
    Se debe mostrar la posición en que se encuentra. Si no está, indicarlo con un mensaje.
     */
    public static void main(String[] args) {
        // variables
        int[] arreglo= new int[10];
        int numeroBuscar=0,posicion_numero=0;
        boolean creciente=true, encontrado=false;
        
        //ingreso arreglo
        do{
            for(int i=0; i<arreglo.length; i++){
                arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Ingrese un número: "));
            }
            //control creciente
            for(int i=0; i<arreglo.length-1; i++){
                if(arreglo[i]<arreglo[i+1]){
                    creciente=true; //inicialiar en true para que considere un arreglo del mismo numero como ordenador a pesar de que se igual
                }
                if(arreglo[i]>arreglo[i+1]){
                    creciente=false;
                    break;
                }
            }
            if(creciente==false){
                JOptionPane.showMessageDialog(null, "El arreglo no está ordenador. Intente de nuevo!");
            }
        }while(creciente==false);
        
        System.out.println("****Arreglo***ingresado \n");
        for(int i: arreglo){
            System.out.print(i + " ");
        }
        
        //pedir numero al usuario
        do {
            numeroBuscar = Integer.parseInt(JOptionPane.showInputDialog(Arrays.toString(arreglo) +" \n"+"Digite el número a buscar: "));

            //buscar numero en arreglo
            for (int i : arreglo) {
                posicion_numero++;
                if (i == numeroBuscar) {
                    encontrado = true;
                    break;
                }
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "Número no encontrado. Digite otro ");
                posicion_numero=0;
            }
        } while(encontrado==false);
       
        System.out.println("\n"+ Arrays.toString(arreglo) +"\nNúmero encontrado y digitado es: " + numeroBuscar +" \n" +
                "Posicion de numero: "+ (posicion_numero-1));
           
        
        
    }
}
