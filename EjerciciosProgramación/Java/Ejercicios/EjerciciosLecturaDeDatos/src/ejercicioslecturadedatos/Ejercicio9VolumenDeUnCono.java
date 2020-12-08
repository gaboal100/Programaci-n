package ejercicioslecturadedatos;
import java.util.Scanner;
public class Ejercicio9VolumenDeUnCono {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Volumen del cono. Necesito el radio y la algura");
        double r = leer.nextDouble();
        double h = leer.nextDouble();
        double volumen = (1.0/3.0)*(Math.PI*Math.pow(r,2)*h);
        System.out.println("Volumen = " + volumen + "cm cúbicos");
    }
}
