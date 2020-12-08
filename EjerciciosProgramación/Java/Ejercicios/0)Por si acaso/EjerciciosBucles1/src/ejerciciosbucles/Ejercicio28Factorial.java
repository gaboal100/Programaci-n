package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio28Factorial {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número");
        long factorial = 1;
        int num = leer.nextInt();
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
