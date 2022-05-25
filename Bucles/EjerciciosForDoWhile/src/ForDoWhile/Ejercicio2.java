/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ForDoWhile;

import javax.swing.JOptionPane;

/**
 *
 * @author miancastillo
 */
public class Ejercicio2 {

    /**
     * EJERCICIO 2: Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados(4) y suspensos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        float nota;
        int aprobados=0, condicionados=0, suspensos=0;
        
        
       for(int i=1; i<=6;i++){
           do{
               nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del estudiante Nro "+ i));
           }while(nota<0 || nota>10); 
           if(nota>4){
               aprobados++;
           }else if(nota==4){
               condicionados++;
           }else{
               suspensos++;
           }
            
       }
        
        System.out.println("Nro de Aprobados: " +aprobados +"\n" +
                           "Nro de Condicionados: "+ condicionados +"\n"+
                           "Nro en Suspensos: " +suspensos );
    }
        */
    
    /*EJERCICIO 3: Segun la calificacion determinar el numero de materias en suspenso*/
    int negativo=0, i=1;
        float calificacion;
        boolean hay_suspenso=false;
        for(int j=1;j<=5;j++){
            do {
                calificacion = Float.parseFloat(JOptionPane.showInputDialog("Ingres la calificación Nro " + j + " :"));

                if (calificacion < 4) {
                    hay_suspenso = true;
                    negativo++;
                }
            } while (calificacion<0 || calificacion>10);   
        }
            if(hay_suspenso==true){
                JOptionPane.showMessageDialog(null, "La cantidad de materias en suspenso son: "+ negativo);
            }else{
                JOptionPane.showMessageDialog(null, "NO HAY SUSPENSO");
            }
    }
}
