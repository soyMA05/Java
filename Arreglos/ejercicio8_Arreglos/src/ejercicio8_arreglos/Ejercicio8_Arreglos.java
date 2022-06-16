/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8_arreglos;

import java.util.Scanner;

/**
 *
 * @author MIANCAS
 */
public class Ejercicio8_Arreglos {
    /**
     * AQUI SOLO CAMBIE EL VALOR DE LA NUEVA POSICION
     * Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 numeros.
     * Despues pedir un numero y una posición, insertarlo en la posición indicada, desplazando los que estén detrás.
     */
    public static void main(String[] args) {
    
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int tamanio =10, numero, posicion;
        int[] arreglo= new int [tamanio];
        
        for(int i=0; i<arreglo.length-2; i++){
            System.out.print((i+1)+". Ingrese un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        //imprimo arreglo original
        for(int i: arreglo){
            System.out.print(i + " ");
        }
        //pido posiciones y el valor a insertar
        do{
            System.out.print("Ingrese la posicion que desea cambiar de valor (0-9): ");
            posicion=entrada.nextInt();
            if(posicion >9 || posicion<0){
                System.out.print("Ingrese la posicion correcta ");
            }
        }while(posicion>9 || posicion<0);
        System.out.print(" Ingrese el nuevo valor a insertar en la posicion " + posicion +": ");
        numero=entrada.nextInt();     
        /**
         * tomo los valores desde la ultima posicion 7 porque llene 8 numeros y la posicion 8 y 9 estan con ceros
         * entonces necesito desplazar de atras hacia mas atras eso valores del valor de la posicion 7 va hacia el 8
         */
        for(int i=7;i>=posicion;i--){
            arreglo[i+1]=arreglo[i];
            System.out.println("arregloBac: "+arreglo[i+1]);
            System.out.println("o++: "+i);
           
        }
        //coloco el valor en la posicion
        arreglo[posicion]=numero;
        //imprimo arreglo con nuevo elemento agregado
        for(int i: arreglo){
            System.out.print(i + " ");
        }        
    }
}
