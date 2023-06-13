/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12_arreglos;

import java.util.Arrays;
import javax.swing.JOptionPane;


/**
 *
 * @author MIANCAS
 */
public class Ejercicio12_Arreglos {

    /**
     *Leer por teclado una tabla de 10 elementos numericos enteros y una posicion (0-9)
     *Luego eliminar el elemento situado en la posicion dada sin dejar huecos. 
     */
    public static void main(String[] args) {
        //variables
        int[] arreglo = new int[10];
        int posicionEliminar=0;
        int elementoEliminar=0;
        //ingreso arreglo de 10 elementos
        for(int i=0; i<arreglo.length; i++){
            arreglo[i]= Integer.parseInt(JOptionPane.showInputDialog(i+1+". Ingrese un numero: "));
        }
        
        //pido posicion muestro arreglo con JOPTIONPANE (se puede hacerlo con un string + vector[i] y mostrar el string)
        do{
            posicionEliminar= Integer.parseInt(JOptionPane.showInputDialog( Arrays.toString(arreglo) +" \n" +
            "Ingrese una posicion entre 0-9 para eliminar un elemento: "));
            if(posicionEliminar<0 || posicionEliminar>9){
             JOptionPane.showMessageDialog(null, "Ingrese una posicion correcta: ");
            }
        }while(posicionEliminar<0 || posicionEliminar>9);
        //muestro elemento a eliminar
             
        for(int i=0; i<arreglo.length; i++){
            if((arreglo[i]==arreglo[posicionEliminar]) && (i==posicionEliminar)){
                elementoEliminar=arreglo[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El elemento a eliminar es: "+ elementoEliminar);
        
        //algoritmo para eliminar elemento en esa posicion
        for(int i=posicionEliminar; i<arreglo.length-1;i++){
            arreglo[i]=arreglo[i+1];
        }
        for(int i=0; i<arreglo.length-1; i++){
            System.out.print(" "+arreglo[i]+" ");
        }
    }
    
}
