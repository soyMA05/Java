/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11_arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author MIANCAS
 */
public class Ejercicio11_Arreglos {

    /**
     * 11. Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Estos los guardaremos 
     * en una tabla de tamaño 10. Leer un número N, e insertarlo en el lugar adecuado 
     * para que la tabla continué ordenado.  
     */
    public static void main(String[] args) {
        //variables
        int[] array= new int [10];
        int numero, posicion_numero=0;
        boolean creciente=true;
        //utilizo el do while para corregir la entrada de numeros ordenados
        do {
            //llenar array
            for (int i = 0; i < array.length - 5; i++) {
                array[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Ingrese un numero: "));
            }
            //verificar si esta o no ordenado
            for(int i=0; i<4; i++){
                if(array[i]<array[i+1]){
                    creciente=true;
                }
                if(array[i]>array[i+1]){
                    creciente=false;
                    break; // una vez que detecte que es falso salga de todo el bucle y no haga ciclos de gana que pueden alterar 
                }                   
            }
            if(creciente==false){
                JOptionPane.showMessageDialog(null, "Los numeros ingresados no estan ordenados", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } while(creciente==false);
        
        //ingresa el numero
        numero= Integer.parseInt(JOptionPane.showInputDialog(" Ingrese un nuevo numero: "));
        
        //encontrar la posicion del nuevo numero 
        int j=0;
        while(array[j]<numero && j<5/*no se han completado los elementos que tiene el array si no se va de largo*/){
            posicion_numero++;
            j++;
        }
        System.out.println("pOSICION: "+posicion_numero);
        //hacer el recorrido de posiciones a partir de la posicion del numero encontrado
        for(int i=4; i>=posicion_numero;i--){
            array[i+1]=array[i];
        }
        //colocar numero en su posicion
        array[posicion_numero]=numero;
        
        //imprimo arreglo con los elementos necesarios
        for(int i=0;i<array.length-4;i++){
            System.out.print(" "+array[i]+" ");
        }
    }
    
}
