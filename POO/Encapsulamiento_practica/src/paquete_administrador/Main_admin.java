/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_administrador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import paquete1.Persona;

/**
 *
 * @author miancastillo
 */
public class Main_admin {
    
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        List<Persona> listaPersonas = new ArrayList<>();
        
        int numero_registros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de personas a registrar:  "));
        for(int i=0; i<numero_registros; i++){
            String nombre= JOptionPane.showInputDialog("###Registro Nro: "+(i+1)+"###\n\n  Ingrese el nombre: ");
            String apellido =JOptionPane.showInputDialog("Ingrese el apellido: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
            String cedula = JOptionPane.showInputDialog("Ingrese la cedula: ");
            String sexo = JOptionPane.showInputDialog("Ingrese el sexo: ");
            listaPersonas.add(i,new Persona(nombre, apellido, edad, cedula, sexo));
        }
        int tamanio_listaPersonas = listaPersonas.size();
        System.out.println("Total Nro de registros: "+ tamanio_listaPersonas );
        
        for(Persona registro: listaPersonas){
            System.out.println(registro.mostrarDatos());
        }
        
        
    }
}
