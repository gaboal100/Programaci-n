package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame la altura desde la que cae un objeto");
        double h = leer.nextDouble();
        if (h < 0){
            System.out.println("Número dado es negativo, será corregido");
            h = -h;
        }
        double div = (2 * h) / 9.81;
        double rdo = Math.sqrt(div); //Match.sqrt ==== Raíz cuadrada
        System.out.println("Solución: " + rdo);       
    }
}
