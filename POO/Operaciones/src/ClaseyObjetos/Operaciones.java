/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseYObjetos;

import java.util.Scanner;

/**
 *
 * @author miancastillo
 */
public class Operaciones {
    //atributos
    int numero1;
    int numero2;
    int rsuma;
    int rresta;
    int rmultiplicacion;
    int rdivision;
    
    //METODOS
    
    //metodo para pedir 2 numeros
    public void pedirNumeros(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        numero1 = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        numero2 = teclado.nextInt();
    }
    
    //metodo para sumar 2 numeros
    public void sumar(){
        rsuma = numero1 + numero2;
    }
    //metodo para restar 2 numeros
    public void restar(){
        rresta = numero1 - numero2;
    }
    //metodo para dividir 2 numeros
    public void dividir(){
        rdivision = numero1 / numero2;
    }
    //metodo para multiplicar 2 numeros
    public void multiplicar(){
        rmultiplicacion = numero1 * numero2;
    }
    
    //metodo para mostrar resultados
    public void mostrarResultados(){
        System.out.println("Suma: "+ rsuma);
        System.out.println("Resta: "+ rresta);
        System.out.println("Multiplicacion: "+ rmultiplicacion);
        System.out.println("Division: "+ rdivision);
    }
    
            
    
}
