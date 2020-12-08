package ejercicioslecturadedatos;
import java.util.Scanner;
public class Ejercicio7FacturaBaseImponible {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame la base de tu factura");
        double base = leer.nextDouble();
        double IVA = (base * 21)/100;
        double factura = base + IVA;
        System.out.println("Factura => " + factura + "€");
    }
}
