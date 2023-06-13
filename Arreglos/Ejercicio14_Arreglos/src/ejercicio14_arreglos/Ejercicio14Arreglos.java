/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14_arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author MIANCAS
 */
public class Ejercicio14Arreglos {

    /*
     Ejercicio 14: Usar un arreglo con nombre arreglo1. 
    Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
     */
    public static void main(String[] args) {
        //variables
        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];
        int[] arregloFinal1_2 = new int[20];
        boolean creciente=true;
        
        //Ingreso y compruebo si el PRIMER ARREGLO es creciente o no
        do{
            //ingreso
            for(int i=0; i<arreglo1.length;i++){
                arreglo1[i]=Integer.parseInt(JOptionPane.showInputDialog("Arreglo 1 \n"+(i+1)+". Ingrese un número: "));
            }
            //comprobar creciente
            for(int i=0;i<arreglo1.length-1;i++){
                if(arreglo1[i]<arreglo1[i+1]){
                    creciente=true;//inicialiar en true para que considere un arreglo del mismo numero como ordenador a pesar de que se igual
                }
                if(arreglo1[i]>arreglo1[i+1]){
                    creciente=false;
                    break;
                }
            }
            if(creciente==false){
                JOptionPane.showMessageDialog(null, "Arreglo desordenado. Intente de nuevo!");
            }
        }while(creciente==false);
        
        creciente=true;
        //Ingreso y compruebo si el SEGUNDO ARREGLO es creciente o no
        do{
            //ingreso
            for(int i=0; i<arreglo2.length;i++){
                arreglo2[i]=Integer.parseInt(JOptionPane.showInputDialog("Arreglo 2 \n"+(i+1)+". Ingrese un número: "));
            }
            //comprobar creciente
            for(int i=0;i<arreglo2.length-1;i++){
                if(arreglo2[i]<arreglo2[i+1]){
                    creciente=true;
                }
                if(arreglo2[i]>arreglo2[i+1]){
                    creciente=false;
                    break;
                }
            }
            if(creciente==false){
                JOptionPane.showMessageDialog(null, "Arreglo desordenado. Intente de nuevo!");
            }
        }while(creciente==false);
        
        //mostrar arreglos ingresados
        System.out.println("****Arreglo1*** \n");
        for(int i: arreglo1){
            System.out.print(i +" ");
        }
        System.out.println("\n****Arreglo2*** \n");
        for(int i: arreglo2){
            System.out.print(i +" ");
        }
        
        //ingresar el arreglo1 en arreglofinal
        for(int i=0,j=0; i<arregloFinal1_2.length; i++,j++){
            arregloFinal1_2[i]=arreglo1[i];
            if(i==arreglo1.length-1){
                break;
            }
        }
        //obtener elementos del arreglo2 y encontrar posicion
        int contador=0 , c=0,j=0, contadorPosicion=0, contadorRecorrido=0;
        int numeroArreglo2 =0, posicion_Num=0;
        
        do{
            //a. obtener elemento arreglo2
           while(c<1+contadorRecorrido){
               numeroArreglo2 = arreglo2[c];
               c++;
               contador=c;
               System.out.println("Numero obtenido arreglo 2: " +numeroArreglo2);
           } 
           //b.encontrar la posicion del nuevo numero 
           while(arregloFinal1_2[j]<numeroArreglo2 && j<10+contadorPosicion){
               posicion_Num++;
               j++;
           }
            System.out.println("Posicion numero: "+ posicion_Num);
            
            //c.hacer el recorrido de posiciones a partir de la posicion del numero encontrado
            for(int i=9+contadorPosicion; i>=posicion_Num;i--){
                arregloFinal1_2[i+1]=arregloFinal1_2[i];
            }
            //colocar numero en su posicion
            arregloFinal1_2[posicion_Num]=numeroArreglo2;
           posicion_Num=0;
           j=0;
           contadorPosicion++;
           contadorRecorrido++;
        }while(contador!=arreglo2.length);
        
            
        System.out.println("\n****Arreglo Final*** \n");        
        for(int i: arregloFinal1_2){
            System.out.print( i +" ");
        }
        System.out.println("\n");
        
    }
    
}
