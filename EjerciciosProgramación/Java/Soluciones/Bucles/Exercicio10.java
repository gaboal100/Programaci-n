
import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca números positivos (para parar, introduzca uno negativo");
        double n = leer.nextDouble();
        double i = 0;
        double suma = 0;
        while (n >= 0) {
            i++;
            suma += n;
            System.out.println("Introduzca números positivos (para parar, introduzca uno negativo");
            n = leer.nextDouble();
        }
        System.out.println("La media de los números introducidos es " + (suma / i));
    }
}
