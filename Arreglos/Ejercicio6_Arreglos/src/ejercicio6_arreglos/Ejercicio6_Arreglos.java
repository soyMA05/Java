/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_arreglos;

import java.util.Scanner;

/**
 *
 * @author MIANCAS
 */
public class Ejercicio6_Arreglos {

    /**
     * Leer dos tablas de 12 elementos numericos y mezclarlos de la forma que: 3 del 1mer arreglo, 3 del 2do arreglo
     * otro 3 del 1mer arreglo, otros 3 del segundo arreglo.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int[] a= {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] b= {1,2,3,4,5,6,7,8,9,10,11,12};
        int[] unionArreglo=new int [24];
        int x=0;
        /* Forma 1
        for(int i=0;i<12;i+=3){
            unionArreglo[x]=a[i];
            x++;
            unionArreglo[x]=a[i+1];
            x++;
            unionArreglo[x]=a[i+2];
            x++;
            unionArreglo[x]=b[i];
            x++;
            unionArreglo[x]=b[i+1];
            x++;
            unionArreglo[x]=b[i+2];
            x++;
        }
        */
        
        for(int i=0; i<12;i+=3){
            unionArreglo[2*i]=a[i];
            unionArreglo[2*i+1]=a[i+1];
            unionArreglo[2*i+2]=a[i+2];
            //
            unionArreglo[2*i+3]=b[i];
            unionArreglo[2*i+4]=b[i+1];
            unionArreglo[2*i+5]=b[i+2];
        }
        for(int i: unionArreglo){
            System.out.print(" "+ i +" ");
        }
    }
    
}
