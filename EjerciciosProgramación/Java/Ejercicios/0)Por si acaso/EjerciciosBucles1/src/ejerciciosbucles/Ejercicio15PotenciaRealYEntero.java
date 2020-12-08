package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio15PotenciaRealYEntero {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame dos números");
        int a = leer.nextInt();
        int b = leer.nextInt();
        System.out.println("");
        for (int i = 1; i <= b; i++){
            System.out.print(a + "^" + i + ", ");
        }
        System.out.println("");
    }
}
