package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio27MúltiplosDe3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número");
        int n = leer.nextInt();
        int suma = 0;
        int contador = 0;
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0){
                System.out.print("/" + i + "/ " );
                suma += i;
                contador++;
            }
        }
        System.out.println("");
        System.out.println("Hay " + contador + " múltiplos.");
        System.out.println("Suma total = " + suma);
    }
}
