
import java.util.Scanner;


public class Exercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n=leer.nextInt();
        if ((n%2)==0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        if ((n%5)==0) {
            System.out.println("El número es divisible entre 5");
        } else {
            System.out.println("El número no es divisible entre 5");
        }
    }
}
