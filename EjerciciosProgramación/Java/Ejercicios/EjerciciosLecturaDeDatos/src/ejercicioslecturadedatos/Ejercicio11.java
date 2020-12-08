package ejercicioslecturadedatos;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("KB:");
        double KB = leer.nextDouble();
        double MB = 1024;
        System.out.println(KB + "KB son " + (KB/MB) + "MB");
    }
}
