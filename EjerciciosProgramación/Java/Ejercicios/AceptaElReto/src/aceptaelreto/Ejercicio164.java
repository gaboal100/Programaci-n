package aceptaelreto;
import java.util.Scanner;

public class Ejercicio164 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int bIzq, bDer, aIzq, aDer;
        int base, altura;

        while (true) {

            bIzq = leer.nextInt();
            aIzq = leer.nextInt();
            bDer = leer.nextInt();
            aDer = leer.nextInt();

            base   = bDer - bIzq;
            altura = aDer - aIzq;

            if (base < 0 || altura < 0) break;
            System.out.println( base * altura );
        }


    }

}
