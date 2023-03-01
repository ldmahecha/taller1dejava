import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura= new Scanner (System.in);
        System.out.println("Hello, World!");
        System.out.println("ingresa primer numero");
        System.out.println("ingresa segundo numero");
        int numberOne;
        int numberTwo;
        int resultado;
        numberOne=lectura.nextInt();
        numberTwo=lectura.nextInt();
        resultado=lectura.nextInt();
        System.out.println("El numero ingresado es "+numberTwo);
         int mai=numberOne+numberTwo;
         System.out.println("El resultado es "+numberOne+numberTwo);
         lectura.close();
    }
}


