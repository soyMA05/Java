/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_arreglos;

import java.util.Scanner;

/**
 *
 * @author MIANCAS
 */
public class Ejercicio7_Arreglos {

    /**
     * Leer por teclado 10 numeros enteros y la aplicación debe determinar si los numeros estan ordenados de forma
     * creciente, decreciente o si están desordenados.
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       //int[] arreglo= {1,2,3,4,5,6,7,8,9,10};
       //int[] arreglo= {10,9,8,7,6,5,4,3,2,1};
       //int[] arreglo= {1,2,3,4,5,6,7,8,90,10};
       int[] arreglo= {1,1,1,2,2,2,2,3,3,3};
       //int[] arreglo= {10,1,1,1,1,1,1,1,1,1};
       int ctc=1,ctd=1,cti=1;
       String respIgual="El arreglo tiene numeros iguales",respCreciente="El arreglo es creciente",
       respDecreciente="El arreglo es decreciente",respDesordn="El arreglo esta desordenado";
       
       /* FORMA 1
       for(int i=0; i<9 ;i++){
           if(arreglo[i]<arreglo[i+1]){
               ctc++;               
           }
           if(arreglo[i]>arreglo[i+1]){
               ctd++;
           }
           if(arreglo[i]==arreglo[i+1]){
               cti++;
           }
       }
       if(ctc==10){
           System.out.println(respCreciente);
       }else if(ctd==10){
           System.out.println(respDecreciente);
       }else if(cti==10){
           System.out.println(respIgual);
       }else{
           System.out.println(respDesordn);
       }*/
       

        //FORMA 2 mas precisa si se da el caso de que hay [1,1,1,2,2,2,2,3,3,3]
       boolean creciente= false, decreciente=false;
       for(int i=0; i<9 ;i++){
           if(arreglo[i]<arreglo[i+1]){
               creciente=true;
           }
           if(arreglo[i]>arreglo[i+1]){
               decreciente=true;
           }
       }
       if(creciente==true && decreciente==false){
           System.out.println("Arreglo creciente");
       }else if(creciente==false && decreciente==true){
           System.out.println("Arreglo decreciente");
       }else if(creciente== true && decreciente==true){
           System.out.println("Arreglo esta desordenado");
       }else if(creciente==false && decreciente==false){
           System.out.println("Son iguales");
       }
    }
    
}
