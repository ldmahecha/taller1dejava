import java.util.Scanner;

public class discotek {
    public static void main () {
        int age;
        Scanner lectura=new Scanner (System.in);
        age=lectura.nextInt();
        if (age<18) {
            System.out.println("No puede ingresar");

        }
        else {
            System.out.println("Bienvenido");
        }
        lectura.close();
    }
}
