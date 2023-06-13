package ejercicio16_arreglos;

import javax.swing.JOptionPane;
/**
 *
 * @author MIANCAS
 */
public class Ejercicio16Arreglos {

    /*
    16.	Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. 
    Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un grupo. 
    Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la posición N 
    (N se leer por teclado). Nota propia:seria bueno implementar un switch
    */
    public static void main(String[] args) {
        //variables
        float[] G1_1Trimestre = new float[5];
        float[] G1_2Trimestre = new float[5];
        float[] G1_3Trimestre = new float[5];
        float notaMediaG1_1T=0, notaMediaG1_2T=0, notaMediaG1_3T=0, notaMediaAlumno=0;
        int numeroAlumno, posicionAlumno=0;
        
        //PRIMER TRIMESTRE
        //a.Ingreso de notas
        for(int i=0; i<G1_1Trimestre.length;i++){
            do{
               G1_1Trimestre[i]=Float.parseFloat(JOptionPane.showInputDialog("*******Primer Trimestre*******"+"\n Ingrese la nota (formato 19.95 o 19) del estudiante "+(i+1)+" : " )); 
               if(G1_1Trimestre[i]<0 || G1_1Trimestre[i]>20){
                   JOptionPane.showMessageDialog(null, "Ingrese correctamente la nota del del estudiante "+(i+1)+"...");
               }
            }while(G1_1Trimestre[i]<0 || G1_1Trimestre[i]>20);
        }
        //b.mostrar notas
        System.out.println("****Notas del Primer Trismestre G1****** \n");
        for(float i:G1_1Trimestre){
            System.out.print(i +" ");
        }
        
        //SEGUNDO TRIMESTRE
        //a.Ingreso de notas
        for(int i=0; i<G1_2Trimestre.length;i++){
            do{
               G1_2Trimestre[i]=Float.parseFloat(JOptionPane.showInputDialog("*******Segundo Trimestre*******"+"\n Ingrese la nota (formato 19.95 o 19) del estudiante "+(i+1)+" : " )); 
               if(G1_2Trimestre[i]<0 || G1_2Trimestre[i]>20){
                   JOptionPane.showMessageDialog(null, "Ingrese correctamente la nota del del estudiante "+(i+1)+"...");
               }
            }while(G1_2Trimestre[i]<0 || G1_2Trimestre[i]>20);
        }
        //b.mostrar notas
        System.out.println("\n\n****Notas del Segundo Trismestre G1****** \n");
        for(float i:G1_2Trimestre){
            System.out.print(i +" ");
        }
        
        //TERCER TRIMESTRE
        //a.Ingreso de notas
        for(int i=0; i<G1_3Trimestre.length;i++){
            do{
               G1_3Trimestre[i]=Float.parseFloat(JOptionPane.showInputDialog("*******Tercer Trimestre*******"+"\n Ingrese la nota (formato 19.95 o 19) del estudiante "+(i+1)+" : " )); 
               if(G1_3Trimestre[i]<0 || G1_3Trimestre[i]>20){
                   JOptionPane.showMessageDialog(null, "Ingrese correctamente la nota del del estudiante "+(i+1)+"...");
               }
            }while(G1_3Trimestre[i]<0 || G1_3Trimestre[i]>20);
        }
        //b.mostrar notas
        System.out.println("\n\n****Notas del Tercer Trismestre G1****** \n");
        for(float i:G1_3Trimestre){
            System.out.print(i +" ");
        }  
        
        //CALCULO MEDIAS
        //a. Media Primer Trimestre
        float sumaNotas=0;
        for(int i=0; i<G1_1Trimestre.length;i++){
            sumaNotas+=G1_1Trimestre[i];
        }
        notaMediaG1_1T=sumaNotas/5;
        
        //b. Media Segundo Trimestre
        sumaNotas=0;
        for(int i=0; i<G1_2Trimestre.length;i++){
            sumaNotas+=G1_2Trimestre[i];
        }
        notaMediaG1_2T=sumaNotas/5;
        
        //c. Media Tercer Trimestre
        sumaNotas=0;
        for(int i=0; i<G1_3Trimestre.length;i++){
            sumaNotas+=G1_3Trimestre[i];
        }
        notaMediaG1_3T=sumaNotas/5;
        
        //mostrar promedios por trimestre
        System.out.println("\n\n****Promedio de Curso por Trimestre****** \n");
        System.out.println("Primer trimestre: "+ notaMediaG1_1T +"\n");
        System.out.println("Segundo trimestre: "+ notaMediaG1_2T +"\n");
        System.out.println("Tercer trimestre: "+ notaMediaG1_3T +"\n");
        
        
        //MEDIA POR ALUMNO
        int salir=0;
        do{
            //a. Pedir nro alumno (Nro de lista del 1 al 5) y determinar posicion
            do {
                numeroAlumno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de lista del estudiante (1-5): "));
                if (numeroAlumno < 1 || numeroAlumno > 5) {
                    JOptionPane.showMessageDialog(null, "El numero de lista no existe...Digite nuevamente");
                }
            } while (numeroAlumno < 1 || numeroAlumno > 5);
            posicionAlumno = numeroAlumno - 1;

            //b.Buscar alumno por numero de lista (posicion). Luego Obtener calificaciones de los 3 trimestres del alumno por su posicion
            float sumaNotaAlumno = 0;
            sumaNotaAlumno = G1_1Trimestre[posicionAlumno] + G1_2Trimestre[posicionAlumno] + G1_3Trimestre[posicionAlumno];
            notaMediaAlumno = sumaNotaAlumno / 3;
            System.out.println("*****Promedio del estudiante Nro. " + numeroAlumno + " es: " + notaMediaAlumno);
            System.out.println("");
            numeroAlumno=0;
            notaMediaAlumno=0;
            salir=Integer.parseInt(JOptionPane.showInputDialog("Pulse 0 para buscar nuevamente y 1 para salir"));
        }while(salir==0);
        
    }
    
}
