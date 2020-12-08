package ejercicioslecturadedatos;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("MB:");
        double MB = leer.nextDouble();
        double KB = 1024;
        System.out.println(MB + "MB son " + (MB*KB) + "KB");
    }
}
