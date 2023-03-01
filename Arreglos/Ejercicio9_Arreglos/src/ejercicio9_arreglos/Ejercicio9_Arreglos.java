/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author MIANCAS
 */
public class Ejercicio9_Arreglos {

    /**
     * 9.Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una
     * posición hacia abajo: el primero pasa a ser el segundo,
     * el segunda pasa a ser el tercero y así sucesivamente.El último pasa a ser el primero.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un tamanio" ));
        int[] array = new int[size];
        
        //FORMA 1
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {//si i es diferente a la ultima posicion del array, el ultimo numero sea primero.
                array[i + 1] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "/" + (size) + " Ingrese un numero"));
            }else{
                array[i - (array.length - 1)] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "/" + (size) + " Ingrese un numero"));
            }
        }
        /*
        //FORMA 2
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "/" + (size) + " Ingrese un numero"));
        }
        //variable para almacenar el ultimo valor
        int last_one=array[9];
        //recorre una posicion hacia abajo (osea de 8 a 9) en el arreglo
            for(int i=8;i>=0;i--){
                array[i+1]=array[i];
            }
        //ultimo elemento como primero
        array[0]=last_one;*/
        //muestro array original
        System.out.println("\n*** Array ****");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
