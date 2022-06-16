/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8_arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author MIANCAS
 * Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 numeros.
 * Despues pedir un numero y una posi4ción, insertarlo en la posición indicada, desplazando los que estén detrás.
 */
/*public class practica_forma2_ejercicio8_arreglos {
    public static void main(String[] args) {
        int sizeArray =10, numbers, newnumber, position;
        int[] array=new int[sizeArray];
        
        //llenar el array dejando 2 espacios libre [8]y[9]
        for(int i=0;i<array.length-2;i++){
            array[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+"/"+(sizeArray-2)+" Ingrese un numero"));
        }
        //muestro array original
        System.out.println("\n***Array Original****");
        for(int i: array){
            System.out.print(i+" ");
        }
        
        //pido la posicion que quiero para ingresar el nuevo valor o numero al array
        position=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion entre 0-9"));
        newnumber=Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el nuevo valor: "));
        
        //creo un array de backup con los numeros que se encuentran a partir de la posicion indicada
        int arrayBackup[]=new int[array.length-1-position];
        int position_backup=position;
        for(int i=0;i<arrayBackup.length;i++){
            arrayBackup[i]=array[position_backup];
            position_backup++;
        }
        //muestro array backup
        System.out.println("***Array Backup****");
        for(int i: arrayBackup){
            System.out.print(i+" ");
        }
        
        //agregar el nuevo valor en la posicion indicada
        array[position]=newnumber;
        //uno los dos arrays, el array original con el de backup
        int indice_backup=0;
        for(int i=position+1;i<array.length;i++){
            array[i]=arrayBackup[indice_backup];
            indice_backup++;
        }
        //muestro array original
        System.out.println("\n***Array Final****");
        for(int i: array){
            System.out.print(i+" ");
        }
    }
}
*/