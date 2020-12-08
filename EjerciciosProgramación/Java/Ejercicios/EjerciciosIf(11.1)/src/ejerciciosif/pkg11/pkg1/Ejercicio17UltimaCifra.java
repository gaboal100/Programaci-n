package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio17UltimaCifra {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número");
        int num = leer.nextInt();
        int ultDigit = num%10;
        System.out.println("El último dígito es " + ultDigit);
    }
}
