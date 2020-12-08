package ejercicios5_4;

import java.util.Scanner;

public class Ejercicio_20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        String simb = leer.next();
        System.out.println("Introduce una altura");
        int h = leer.nextInt();

        for (int i = 0; i < h; i++) {
            for (int z = i; z < h; z++) {
                System.out.print(" ");
            }
            System.out.print(simb);
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(" ");
            }
            if (i > 0) {
                System.out.print(simb);
            }
            System.out.println("");

        }
        for (int i = 0; i < h * 2 + 1; i++) {
            System.out.print(simb);
        }
        System.out.println("");
    }

}