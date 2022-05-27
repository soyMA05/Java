/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseyObjetos;

/**OperacionesParamArgumento
 *
 * @author miancastillo
 */
public class OperacionesParamArgumento {
    
    //atributos
    int rsuma;
    int rresta;
    int rmultiplicacion;
    int rdivision;
    
    //METODOS usando parametros
    
    public void sumar(int num1, int num2){
        rsuma= num1 + num2;
    }
    
    public void restar(int num1, int num2){
        rresta= num1 - num2;
    }
    
    public void multiplicar(int num1, int num2){
        rmultiplicacion= num1 * num2;
    }
    
    public void dividir(int num1, int num2){
        rdivision= num1 / num2;
    }
    
    //metodo para mostrar resultado de operaciones
    public void mostrarResultado(){
        System.out.println("--------Clase Operaciones CON Parametros y Argumentos--------");
        System.out.println("Suma: "+ rsuma);
        System.out.println("Resta: "+ rresta);
        System.out.println("Multiplicacion: "+ rmultiplicacion);
        System.out.println("Division: "+ rdivision);
    }
}
