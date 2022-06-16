/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8_arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author MIANCAS
 * Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 numeros.
 * Despues pedir un numero y una posición, insertarlo en la posición indicada, desplazando los que estén detrás.
 * 
 */
/*public class forma2_ejercicio8_arreglos {
    public static void main(String[] args) {
        //Declarar variables
        int indice, valor; 
        //Pedir la longitud del array a ingresar
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la longitud del array : "));
        int[] numeritos = new int[num];

        //Pedir los valores para el array
        for (int i = 0; i < num - 1; i++) {
            numeritos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor de la posicion " + i + " :"));
        }

        //Pedir el indice y valor
        indice = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el indice: "));
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor :"));

        int indice_u = indice;

        //Mostrar el indice y valor ingresado
        System.out.println("Indice : " + indice_u);
        System.out.println("Valor  : " + valor);
        System.out.println("*****************");

        //LLenar los valores despues del indice en un array de backup
        int[] backup = new int[num - indice_u - 1];
        System.out.println(" Longitud backup: "+ backup.length);
        for (int i = 0; i < backup.length; i++) {
            backup[i] = numeritos[indice_u];
            indice_u++;
        }
        //muestro los valores que contiene el array de backup
        System.out.println("-------ARRAY BACKUP----------");
        for (int i = 0; i < backup.length; i++) {
            System.out.print(backup[i] + " ");
        }
        //muestro el array original
        System.out.println("-------ARRAY NUMEROS----------");
        for (int i = 0; i < numeritos.length; i++) {
            System.out.print(numeritos[i] + " ");
        }

        //inserto el valor en el indice ingresado
        numeritos[indice] = valor;

        //Insertar los valores del array backup un valor despues del indice en el array original
        int conta = 0;
        System.out.println("------ARRAY FINAL--------------");
        for (int i = 1; i <= backup.length; i++) {
            numeritos[indice + i] = backup[conta];
            /*System.out.println("+++++++++");
            System.out.println("Numeritos ["+(indice+i)+"] : "+numeritos[indice+i]);*//*
            conta++;
        }
        //mostrar el array final
        for (int i = 0; i < numeritos.length; i++) {
            System.out.print(numeritos[i]+" ");
        }
    }
}
*/