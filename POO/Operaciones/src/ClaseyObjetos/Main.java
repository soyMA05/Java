/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseyObjetos;
import ClaseYObjetos.Operaciones;
import ClaseyObjetos.OperacionesParamArgumento;
import ClaseyObjetos.Operaciones_conReturn;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author miancastillo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Uso de clase operaciones sin PARAMETROS NI ARGUMENTOS
        Operaciones op = new Operaciones();
        op.pedirNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
        
        //USO de clase Operaciones con Parametros y Argumentos
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));

        OperacionesParamArgumento operaciones = new OperacionesParamArgumento();
        
        operaciones.sumar(n1, n2);
        operaciones.restar(n1, n2);
        operaciones.multiplicar(n1, n2);
        operaciones.dividir(n1, n2);
        operaciones.mostrarResultado();
        
        
        //Uso de metodos con return
        Operaciones_conReturn opReturn = new Operaciones_conReturn();
        int suma = opReturn.sumar(n1, n2);
        int restar = opReturn.restar(n1, n2);
        int multiplicar = opReturn.multiplicar(n1, n2);
        int dividir = opReturn.dividir(n1, n2);
        
        //Formas de mostrar resultado
        opReturn.mostrarResultado(suma, restar, multiplicar, dividir);
        System.out.println("Suma: "+opReturn.sumar(n1, n2) + " Resta: "+opReturn.restar(n1, n2) + " Multiplicacion: " + opReturn.multiplicar(n1, n2)+ " Division "+ opReturn.dividir(n1, n2));
    }
    
}
