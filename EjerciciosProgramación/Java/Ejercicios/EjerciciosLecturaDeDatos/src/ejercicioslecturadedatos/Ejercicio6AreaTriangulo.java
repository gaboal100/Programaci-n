package ejercicioslecturadedatos;
import java.util.Scanner;
public class Ejercicio6AreaTriangulo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Area triángulo: Dame la base y la altura");
        double b = leer.nextDouble();
        double h = leer.nextDouble();
        double area = (b*h)/2;
        System.out.println("Area => " + area + "cm");
    }
    
}
