/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_arreglos;

import java.util.Scanner;

/**
 *
 * @author MIANCAS
 */
public class Ejercicio5 {

    /**
     * Leer 2 arreglos de tamanio 10 que imprima el 1mer elemento del primer arreglo, el 1mer del 2do arreglo
     * el 2do elemento del primer arreglo, el 2do elemento del segundo arreglo y asi
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner (System.in);
        int[] a={1,2,3,4,5,6,7,8,9,10};
        int[] b={21,22,23,24,25,26,27,28,29,30};
        int[] unionArreglo=new int[20];
        /* Forma 1
        for(int i=0,j=1,x=0;(i&j)<unionArreglo.length;i+=2,j+=2,x++){
            unionArreglo[i]=a[x];
            unionArreglo[j]=b[x];
        }*/
        /*Forma 2*/
        int j=0;
        for(int i=0;i<10;i++){
            unionArreglo[j]=a[i];
            j++;
            unionArreglo[j]=b[i];
            j++;
        }
        /*Forma 3
        for(int i=0; i<10;i++){
            unionArreglo[2*i]=a[i];
            unionArreglo[2*i+1]=a[i];
        }*/
        for(int i:unionArreglo){
            System.out.print(" " + i +" ");
        }
       
    }
    
}
