package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio14ParesyDivisibles {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número");
        int num = leer.nextInt();
        int par = num%2;
        int div5 = num%5;
        if (par == 0){
            System.out.println("El número es par");
        }
        if (div5 == 0) {
            System.out.println("El número es divisible entre 5");
        }
        if (div5 != 0 && par != 0){
            System.out.println("El número ni es par ni divisible entre 5");
        }
    }
}
