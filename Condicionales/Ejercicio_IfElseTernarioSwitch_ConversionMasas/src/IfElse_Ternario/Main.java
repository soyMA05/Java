/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IfElse_Ternario;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author MIANCAS
 */
public class Main {

    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in); /*entrada y salida de datos por consola */
        float kg, libra=2.20462f, onza= 35.274f, respD;
        int opc,gr=1000, respE;
        do{
            opc= Integer.parseInt(JOptionPane.showInputDialog("Selecciona una opcion: \n"
                    + "1. KG convertir a LIBRA\n"
                    + "2. KG convertir a ONZA\n"
                    + "3. KG convertir a GRAMOS\n"
                    + "0. SALIR. "));
            switch(opc){
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por usar la calculadora de conversion de masas");
                    break;
                case 1:
                    do{
                        kg=Float.parseFloat(JOptionPane.showInputDialog("CALCULADORA DE KG A LB\n"
                                + "Ingrese los KG a convertir: \n"
                                + "Pulse 0 para salir "));
                        
                        if(kg!=0){
                            respD=kg * libra;
                            JOptionPane.showMessageDialog(null, "RESULTADO: \n"+kg + " kg  --> " + respD +" lb");
                        }else{
                            JOptionPane.showMessageDialog(null, "Regresará al Menú...");
                        }
                    }while(kg!=0);
                    break;
                    
                case 2:
                    do{
                        kg=Float.parseFloat(JOptionPane.showInputDialog("CALCULADORA DE KG A Oz\n"
                                + "Ingrese los KG a convertir: \n"
                                + "Pulse 0 para salir "));
                        
                        if(kg!=0){
                            respD=kg * onza;
                            JOptionPane.showMessageDialog(null, "RESULTADO: \n"+kg + " kg  --> " + respD +" Oz");
                        }else{
                            JOptionPane.showMessageDialog(null, "Regresará al Menú...");
                        }
                    }while(kg!=0);
                    break;
                    
                case 3:
                    do{
                        kg=Float.parseFloat(JOptionPane.showInputDialog("CALCULADORA DE KG A GRAMOS\n"
                                + "Ingrese los KG a convertir: \n"
                                + "Pulse 0 para salir "));
                                            
                            respE=(int) (kg * gr);
                            //aplicacion del operador ternario (condicion) ? "Mensaje si es VERDADERO" : "Mensaje si es FALSO"
                            JOptionPane.showMessageDialog(null,(kg!=0) ? "RESULTADO: \n"+kg + " kg  --> " + respE +" Gr" : "Regresará al Menú...");
                    }while(kg!=0);
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta, digite de nuevo entre 1-3");
                    break;
            }
        }while(opc!=0);
        JOptionPane.showMessageDialog(null, "SALIO, Gracias...");
    }
}
