package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio31LConAsteriscos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame la altura de la L");
        int h = leer.nextInt();
        
        for (int i = 1; i < h; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < h/2+1; i++) {
            System.out.print("* ");
        }
    }
}
