/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_arreglos;

import java.util.Scanner;

/**
 *
 * @author MIANCAS
 */
public class forma2_Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanio=10, ascender=0, descender=9;
        int[] arreglo= new int[tamanio];
        int[] arregloNuevo= new int[tamanio];
        boolean invertir=false;
        for(int i=0;i<arreglo.length; i++){
            System.out.print((i+1)+". Ingrese un numero: ");
            arreglo[i]=entrada.nextInt();
        }
        /*Forma 2
        for(int i=0, j=9;i<5 && j>4;i++,j--){
            System.out.print(arreglo[i]+" - "+arreglo[j] +" - ");
        }*/
        
        /*Forma 3
        for(int i=0;i<5;i++){
            System.out.print(arreglo[i]+" - "+arreglo[9-i] +" - ");
        }*/
        
        /*Forma 4*/
        for (int i=0; i<10; i++){
           
            if(invertir==false){//esto equivale a if(!invertir) significa que si invertir es true entra al condicional
                arregloNuevo[i]=arreglo[ascender];
                ascender++;
                // System.out.println(!invertir);
            }else{
                arregloNuevo[i]=arreglo[descender];
                descender--;
            }
            invertir=!invertir;
         //   System.out.println(invertir);
        }
        for (int i: arregloNuevo){
            System.out.print(i + " ");
        }
    }
}
