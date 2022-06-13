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
public class Cuadrilatero {

    //Atributos
    private float lado1;
    private float lado2;

    //Constructor para cuadrilatero: romboide, rectangulo
    public Cuadrilatero(float _lado1, float _lado2) {
        this.lado1 = _lado1;
        this.lado2 = _lado2;
    }
    
    //Constructor para cuadrado y rombo
    public Cuadrilatero(float _lado1){
        this.lado1 = this.lado2 = _lado1;
    }
    
    //Metodos de clase
    
    //#metodo para encontrar el area 
    public float getArea(){
        return lado1 * lado2;
    }
    
    //#metodo en caso de que se desee encontrar el area del rombo
    public float getAreaRombo(float diam_superior, float diam_inferior){
        return (diam_superior * diam_inferior)/2;
    }
    
    //#metodo para encontrar el perimetro 
    public float getperimetro(){
        return (lado1*2) + (lado2*2);
    }
    
    
    
}
