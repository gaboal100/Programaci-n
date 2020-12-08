package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio10MediaDeNúmeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Media de números");
        System.out.println("Dame un número. No te pido más si me das uno negativo");
        double num = leer.nextInt();
        double numtotal = 0;
        double contador = 0;
        while (num >= 0){
            numtotal += num;
            contador++;
            System.out.println("Total= " + numtotal + " Dame un número. No te pido más si me das uno negativo");
            num = leer.nextInt();
        }
        System.out.println(numtotal);
        double media = numtotal/contador;
        System.out.println("Media de " + contador + " números que suman " + numtotal + " = " + media);
    }
}
