/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import javax.swing.JOptionPane;

/**
 * 13.	Leer 10 enteros en una tabla. 
 * Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos impares
 */
public class Ejercicio13_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int[] arreglo = new int [10];
        int contadorPares=0, contadorImpares=0;
        String mostrarArreglo=" ";
        
        //ingreso arreglo
        for(int i=0; i<arreglo.length;i++){
            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1) +". Ingrese un numero: "));
            if(arreglo[i] % 2 ==0){
                contadorPares++;
            }else{
                contadorImpares++;
            }
        }
        //mostrar arreglo ingresado
        for(int i: arreglo){
            mostrarArreglo+= " " + i;
        }
        JOptionPane.showMessageDialog(null,"Arreglo ingresado: \n" + mostrarArreglo);
        
        //crear arreglos para elementos pares e impares.
        int[] arregloPares = new int[contadorPares];
        int[] arregloImpares = new int [contadorImpares];
        
        //colocar adecuadamente los elementos pares e impares en sus respectivos arreglos
        contadorPares=0;
        contadorImpares=0;
        for(int i=0; i<arreglo.length;i++){
            if(arreglo[i] % 2 == 0){
                arregloPares[contadorPares]=arreglo[i];
                contadorPares++;
            }else{
                arregloImpares[contadorImpares]=arreglo[i];
                contadorImpares++;
            }
        }
        
        //mostrar arreglos Pares e Impares
        mostrarArreglo="";
        //a. Arreglo de elementos pares
        System.out.println("***Arreglo Pares****");
        for(int i: arregloPares){
            System.out.print(i +" ");
            mostrarArreglo+=i +" ";
        }
        
        //b. Arreglo de elementos impares
        System.out.println("\n***Arreglo Impares****");
        for(int i: arregloImpares){
            System.out.print(i +" ");
            mostrarArreglo+=i +" ";
        }
        
        //Concatenar los arreglos Pares e Impares
        //a. forma 1
        System.out.print("\n Arreglo Final 1:\n" +mostrarArreglo);
        
        //b. forma 2
        for(int i= 0; i<arregloPares.length;i++){
            arreglo[i]=arregloPares[i];
        }
        for(int i=arregloPares.length, j=0; i<arreglo.length; i++,j++){
            arreglo[i]=arregloImpares[j];
        }
            //mostrar arreglo
        System.out.print("\n Arreglo Final 2: \n");
        for(int i: arreglo){
            System.out.print( i + " ");
        }
        
    }
    
}
