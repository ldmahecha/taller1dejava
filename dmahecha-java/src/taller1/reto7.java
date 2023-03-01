package taller1;
import java.util.Scanner;

import java.util.Random;

public class reto7 {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int bolita;
        double cantidadpagar, descuento, importecompra;
        Random rand = new Random();
        System.out.print("Ingresa el valor de importe de la compra: ");
        importecompra = lectura.nextDouble();
        lectura.nextLine();
        descuento=0;
        bolita=rand.nextInt(5);
        
        if(bolita==1 && importecompra>=50000)
        {
            descuento=importecompra*0.1;
            System.out.println("Bolita Roja.");
        }
        if(bolita==2 && importecompra>=50000)
        {
            descuento=importecompra*0.3;
            System.out.println("Bolita Azul.");
        }
        if(bolita==3 && importecompra>=50000)
        {
            descuento=importecompra*0.5;
            System.out.println("Bolita Amarilla.");
        }
        if(bolita==4 && importecompra>=50000)
        {
            descuento=importecompra;
            System.out.println("Bolita Blanca.");
        }

        else{
            System.out.println("No Aplica Descuento");
        }
        
        cantidadpagar=importecompra-descuento;
        System.out.println("Valor de bolita: " + bolita);
        System.out.println("Valor de cantidad a pagar: " + cantidadpagar);
        System.out.println("Valor de descuento: " + descuento);
        
        lectura.close();
    }

}

