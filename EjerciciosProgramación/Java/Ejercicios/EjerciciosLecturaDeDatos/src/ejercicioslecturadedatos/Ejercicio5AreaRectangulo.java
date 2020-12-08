package ejercicioslecturadedatos;
import java.util.Scanner;
public class Ejercicio5AreaRectangulo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Vamos a calcular el área de un rectángulo");
        System.out.println("Dame los dos lados");
        double l1 = leer.nextDouble();
        double l2 = leer.nextDouble();
        double Area = l1*l2;
        System.out.println("Area => " + Area + "cm");
    }
}
