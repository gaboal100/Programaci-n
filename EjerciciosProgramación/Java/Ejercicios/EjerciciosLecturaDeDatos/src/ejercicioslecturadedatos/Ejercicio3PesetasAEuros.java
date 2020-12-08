package ejercicioslecturadedatos;
import java.util.Scanner;
public class Ejercicio3PesetasAEuros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame tus pesetas y te daré euros");
        double pesetas = leer.nextDouble();
        double euros = 166.386;
        System.out.println(pesetas + " pesetas son " + (pesetas/euros) + "€");
    }
}
