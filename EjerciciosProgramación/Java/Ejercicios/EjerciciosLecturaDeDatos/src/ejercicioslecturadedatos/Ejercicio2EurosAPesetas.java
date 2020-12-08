package ejercicioslecturadedatos;
import java.util.Scanner;
public class Ejercicio2EurosAPesetas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame tus euros y te daré pesetas");
        double euros = leer.nextDouble();
        double pesetas = 166.386;
        System.out.println(euros + "€ son " + (euros*pesetas) + " pesetas");
    }
}
