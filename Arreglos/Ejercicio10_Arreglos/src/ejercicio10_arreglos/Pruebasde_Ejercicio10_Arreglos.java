/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author MIANCAS
 */
public class Pruebasde_Ejercicio10_Arreglos {

    /**
     * Crear un programa que lea por teclado una tabla de 10 numeros enteros y desplace N posiciones en el 
     * arreglo (N es digitado por el usuario)
     */
    /*public static void main(String[] args) {
       //int[] array= new int [10];
       int[] array = {1,2,3,4,5,6,7,8,9,10};
       int npostion;
       
       //muestro array original
        System.out.println("\n*** Array ****");
        for (int i : array) {
            System.out.print(i + " ");
        }
        do{
            npostion=Integer.parseInt(JOptionPane.showInputDialog("Digite la posiciones que recorre el array: "));
            if(npostion >9 || npostion<0){
                System.out.print("Ingrese la posicion correcta ");
            }
        }while(npostion>9 || npostion<0);

         //LLenar los valores en un array de backup
        int[] backup = new int[10];
        int indice_u=0;
        for (int i = 0; i < backup.length; i++) {
            backup[i] = array[indice_u];
            indice_u++;
        }
        //igualo nuevamente a cero el indice_u porque lo necesito para recorrer el backup
        indice_u=0;
        if(npostion==1){
           for (int i = 0; i < array.length; i++) {
                if (i < array.length - 1) {//si i es menor a la ultima posicion del array
                    array[i + 1] = backup[indice_u]; //elementos avanza un espacio
                }else{ //elemento de la posicion 9 estara en posicion 0.
                    array[i - (array.length - 1)] = backup[indice_u];
                }
                indice_u++;
            } 
        }
        if(npostion==2){
            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 2) {//si i es menor a la penultima posicion del array
                    array[i + 2] = backup[indice_u];//elementos avanza 2 espacios
                }else{//elemento de la posicion 8 estara en posicion 0.
                    array[i - (array.length - 2)] = backup[indice_u];
                }
                indice_u++;
            }        
        }
        if(npostion==3){
            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 3) {//si i es menor a la 7ma posicion del array
                    array[i + 3] = backup[indice_u];//elementos avanza 3 espacios
                }else{//elemento de la posicion 7 estara en posicion 0.
                    array[i - (array.length - 3)] = backup[indice_u];
                }
                indice_u++;
            }
        }
        if(npostion==4){
            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 4) {//si i es menor a la 6ta posicion del array
                    array[i + 4] = backup[indice_u];//elementos avanza 4 espacios
                }else{//elemento de la posicion 6 estara en posicion 0.
                    array[i - (array.length - 4)] = backup[indice_u];
                }
                indice_u++;
            }
        }
        if(npostion==5){
            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 5) {//si i es menor a la 5ta posicion del array
                    array[i + 5] = backup[indice_u];//elementos avanza 5 espacios
                }else{//elemento de la posicion 5 estara en posicion 0.
                    array[i - (array.length - 5)] = backup[indice_u];
                }
                indice_u++;
            }
        }
        if(npostion==6){
            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 6) {//si i es menor a la 4ta posicion del array
                    array[i + 6] = backup[indice_u];//elementos avanza 6 espacios
                }else{//elemento de la posicion 4 estara en posicion 0.
                    array[i - (array.length - 6)] = backup[indice_u];
                }
                indice_u++;
            }
        }
        if(npostion==7){
            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 7) {//si i es menor a la 3ra posicion del array
                    array[i + 7] = backup[indice_u];//elementos avanza 7 espacios
                }else{//elemento de la posicion 3 estara en posicion 0.
                    array[i - (array.length - 7)] = backup[indice_u];
                }
                indice_u++;
            }
        }
        if(npostion==8){
            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 8) {//si i es menor a la 4ta posicion del array
                    array[i + 8] = backup[indice_u];//elementos avanza 8 espacios
                }else{//elemento de la posicion 2 estara en posicion 0.
                    array[i - (array.length - 8)] = backup[indice_u];
                }
                indice_u++;
            }
        }
        if(npostion==9){
            for (int i = 0; i < array.length; i++) {
                if (i < array.length - 9) {//si i es menor a la 4ta posicion del array
                    array[i + 9] = backup[indice_u];//elementos avanza 9 espacios
                }else{//elemento de la posicion 1 estara en posicion 0.
                    array[i - (array.length - 9)] = backup[indice_u];
                }
                indice_u++;
            }
        }
        
        //muestro array desplazado
        System.out.println("\n*** Array Desplazado****");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }*/
}
