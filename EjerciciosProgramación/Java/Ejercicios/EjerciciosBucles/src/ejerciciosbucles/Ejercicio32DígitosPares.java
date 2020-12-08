package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio32DígitosPares {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Por favor, introduce un número entero positivo: ");
        long num = leer.nextInt();
        long n = num;
        long inv = 0;
        long suma = 0;
        System.out.print("Dígitos pares: ");
        while (n>0){
            inv = inv*10+n%10;
            n/=10;
        }
        while (inv>0){
            if ((inv%10)%2 == 0){
                System.out.print(inv%10 + " ");
                suma += inv%10;
            }
            inv/=10;
        }
        System.out.println("");
        System.out.println("Suma de los dígitos pares: " + suma);
    }
}
