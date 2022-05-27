/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseyObjetos;

/**
 *
 * @author miancastillo
 */
public class Operaciones_conReturn {
    //atributos
    
    //METODOS con parametros y retorno
    public int sumar(int num1, int num2){
        return num1 + num2;
    }
    
    public int restar(int num1, int num2){
        return num1 - num2;
    }
    
    public int multiplicar(int num1, int num2){
        return num1 * num2;
    }
    
    public int dividir(int num1, int num2){
        return num1 / num2;
    }
    
    public void mostrarResultado(int rsuma, int rresta, int rmultiplicacion, int rdivision){
        System.out.println("--------Clase Operaciones usando Return en los Metodos--------");
        System.out.println("Suma: "+ rsuma);
        System.out.println("Resta: "+ rresta);
        System.out.println("Multiplicacion: "+ rmultiplicacion);
        System.out.println("Division: "+ rdivision);
    }
}
