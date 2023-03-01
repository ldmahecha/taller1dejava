package taller1;
import java.util.Scanner;
public class reto2 {
     public static void main(String[] args) {
        int pesobbe=0;
        int mesesbbe=0;
        int dosis=0;
        try (Scanner lectura = new Scanner(System.in)){
            System.out.println("Ingrese el peso del bebé: ");
            pesobbe = lectura.nextInt();
            System.out.println("Ingrese la edad del bebé (meses): ");
            mesesbbe = lectura.nextInt();
            dosis = ((mesesbbe*10)/(pesobbe+10) * 8);
            System.out.println("La dosis adecuada es: " + dosis);

        }
    }
    
}