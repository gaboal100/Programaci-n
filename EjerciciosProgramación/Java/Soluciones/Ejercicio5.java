
package ejercicios4;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Vamos a resolver una ec. de 1er grado\nFormato: Ax+B=0");
        //PEDIR A    
        System.out.println("¿Cuanto es A?");
        double a = scn.nextDouble();
        //PEDIR B
        System.out.println("¿Cuanto en B?");
        double b = scn.nextDouble();
        if (a != 0.0) {
            double x = (-b) / a;

            System.out.println("X es igual a " + x);
        } else {
            System.out.println("No hay resultado");
        }
    }
}
