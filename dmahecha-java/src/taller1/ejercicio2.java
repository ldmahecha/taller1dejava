package taller1;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        
        Scanner lectura= new  Scanner (System.in);
   
        double nota1, nota2, nota3,nota4, def, acumulador;
   
    
   
    
        System.out.println("Por favor ingrese las notas del estudiante");
        System.out.print("Ingrese nota 1: ");
        nota1 = lectura.nextDouble();
        System.out.print("Ingrese nota 2: ");
        nota2 = lectura.nextDouble();
        System.out.print("Ingrese nota 3: ");
        nota3 = lectura.nextDouble();
        System.out.print("Ingrese nota 4: ");
        nota4 = lectura.nextDouble();

        acumulador = nota1 + nota2 + nota3 + nota4;
    
    

        def = (acumulador/4);

        System.out.println(def);
    
   
    
   
    
        if(def >= 3.0 && def <=5.0) {
            System.out.println("El estudiante aprueba");
        }
        else {
            if(def >= 1.9 && def <3) {
                System.out.println("El estudiante habilita");
            }
            else {
                if(def >= 0 && def <1.9) {
                    System.out.println("El estudiante reprueba");
                }
                else {
                    System.out.println("Error en las notas ingresadas");
                }
            }
        }
    } 
   
 
}

    

