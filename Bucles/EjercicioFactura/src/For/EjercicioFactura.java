/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package For;

import java.util.Scanner;

/**
 *
 * @author miancastillo
 */
public class EjercicioFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        long codigoFactura=0000,codigoArticulo1=1001,codigoArticulo2=1002,codigoArticulo3=1003, cod;
        int cantidadLitros=0, ctd_factura600=0, totalLitrosVentas=0;
        float TotalFacturaCliente=0, precioLitro, totalFacturaVentas=0.f ;
        
        for(int i=1; i<=5;i++){
            codigoFactura+=1;
            System.out.println("Ingrese el código del articulo " +i +":");
            cod=entrada.nextLong();
            System.out.println("Ingrese cantidad vendida en litros: ");
            cantidadLitros=entrada.nextInt();
            /*System.out.println("Ingrese el precio: ");
            precioLitro=entrada.nextFloat();*/
            //operaciones para cliente
            //TotalFacturaCliente= cantidadLitros*precioLitro;
            if(cod==codigoArticulo1){
                TotalFacturaCliente=  (float) ((cantidadLitros)*(0.6));
            }else if(cod==codigoArticulo2){
                TotalFacturaCliente=  (float) ((cantidadLitros)*(3));
            }else if(cod==codigoArticulo3){
                TotalFacturaCliente=  (float) ((cantidadLitros)*(1.25));
            }
            System.out.println("\nCodigo Factura: 0000"+codigoFactura +"\n"+
                               "Codigo Articulo: " +cod +"\n"+
                               "Cantidad Litros: " + cantidadLitros + "\n"+
//                               "Precio x Litro: "+ precioLitro +"\n"+
                                "Total: " + TotalFacturaCliente +"\n**************");
            //operaciones para empresa
            totalFacturaVentas+=TotalFacturaCliente;
            if(cod==codigoArticulo1){
                totalLitrosVentas+=cantidadLitros;
            }
            if(TotalFacturaCliente>=600){
                ctd_factura600++;
            }
            
        }
        System.out.println("Facturación Total del día: "+totalFacturaVentas+ "\n"+
                           "Litros vendidos Articulo "+ codigoArticulo1+": "+totalLitrosVentas+ "\n"+
                           "Facturas mayor a $600: " +ctd_factura600);
    }
    
}
