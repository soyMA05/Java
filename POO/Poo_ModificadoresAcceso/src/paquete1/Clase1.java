/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author miancastillo
 */
public class Clase1 {
    //atributos
    
    //#NIVEL DE PAQUETE
    int atributo; //modificador de acceso por defecto que NO se deja acceder por clases que se encuentran en paquetes diferentes pero SI por clases del mismo paquete.
    
    //#NIVEL INTERPAQUETES (paquetes del mismo proyecto)
    public int atributo1; //modificado de acceso publico que SI se deja acceder desde clases que se encuentran en paquetes diferentes.
    
    //# NIVEL DE CLASE
    private int atributo2;//modificador de acceso privado que SOLO se puede acceder por metodos de la misma clase
}
