package ejercicioslecturadedatos;
import java.util.Scanner;
public class Ejercicio4CalculadoraBasica {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame dos números");
        double x = leer.nextDouble();
        double y = leer.nextDouble();
        System.out.println("Suma =>" +(x+y));
        System.out.println("Resta =>" +(x-y));
        System.out.println("Multiplicación=>" +(x*y));
        System.out.println("División=>" +(x/y));
    }
}
