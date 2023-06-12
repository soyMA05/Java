/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_arreglos;

import javax.swing.JOptionPane;

/**
 *10.Crear un programa que lea por teclado una tabla de 10 números enteros y 
 * desplace N posiciones en el arreglo (N es digitado por el usuario).
 * 
 */
public class ejercicio10_arreglos_avanzado {
    public static void main(String[] args) {
        int[] array= new int [10];
        int nposition;
        //lleno array
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "/" + (array.length) + ". Ingrese un numero"));
        }
        //muestro array original
        System.out.println("\n*** Array ****");
        for (int i : array) {
            System.out.print(i + " ");
        }
        //LLenar los valores en un array de backup
        int[] backup = new int[10];
        int indice_u = 0;
        for (int i = 0; i < backup.length; i++) {
            backup[i] = array[indice_u];
            indice_u++;
        }

        //pedir las posiciones a recorrer
        do {
            nposition = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion(es) que recorre el array (1-9): "));
            if (nposition > 9 || nposition < 0) {
                System.out.print("Ingrese la posicion correcta ");
            }
        } while (nposition > 9 || nposition < 0);

        //igualo nuevamente a cero el indice_u porque lo necesito para recorrer el backup
        indice_u = 0;
        //bloque de cambio de posiciones
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - nposition) {//si i es menor a la ultima posicion de [array.lenght - nposition]
                array[i + nposition] = backup[indice_u]; //elementos que estan antes de [array.lenght - nposition] avanzan n espacios
            } else { //elemento de la posicion [array.lenght - nposition] avanza desde las primeras posiciones
                array[i - (array.length - nposition)] = backup[indice_u];
            }
            indice_u++;
        }
        //muestro array desplazado
        System.out.println("\n*** Array Desplazado****");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
