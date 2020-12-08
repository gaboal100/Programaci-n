package ejercicios_5.pkg4;

import java.util.Scanner;

public class ejercicio_29 {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        System.out.println("dame un numeros");
        int a = esc.nextInt();
        System.out.println("dame un numero para buscar sus no divisores");
        int b = esc.nextInt();
        System.out.println("no divisores de " + b+" son");
        for (int i = a - 1; i > 0; i--) {
            if (i % b != 0) {
                System.out.println(i);
            }
        }
    }
}
