package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio33UConAsteriscos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame la altura de la U: ");
        int h = leer.nextInt();
        System.out.println("");
        
        for (int i = 1; i < h; i++) {
            System.out.print("* ");
            for (int j = 0; j < h/2+1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        System.out.print("  ");
        for (int i = 0; i < h/2+1; i++) {
            System.out.print("* ");
        }
        
        System.out.println("");
    }    
}
