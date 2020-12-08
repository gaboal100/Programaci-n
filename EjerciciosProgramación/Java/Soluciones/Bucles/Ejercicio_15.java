
package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int base, exp;
        System.out.println("introduce una base y un exponente");
        base = leer.nextInt();
        exp = leer.nextInt();
        for (int i = 1; i <= exp; i++) {
            System.out.print(base + "^" + i + ",");
        }
        System.out.println("");      
    }
   
           
}
