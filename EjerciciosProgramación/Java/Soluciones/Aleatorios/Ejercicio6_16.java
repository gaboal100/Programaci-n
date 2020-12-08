package Ejercicio6;

import java.util.Scanner;

/*ejercicio 16- apartado 6 */
public class Ejercicio6_16 {

    public static void main(String[] args) {

        int figura1 = 0;
        int figura2 = 0;
        int figura3 = 0;

        for (int i = 1; i < 4; i++) {
            int figuras = (int) (Math.random() * 5) + 1;

            if (i == 1) {
                figura1 = figuras;
            } else if (i == 2) {
                figura2 = figuras;
            } else if (i == 3) {
                figura3 = figuras;
            }

            switch (figuras) {
                case 1:
                    System.out.println("corazón");
                    break;
                case 2:
                    System.out.println("diamante");
                    break;
                case 3:
                    System.out.println("herradura");
                    break;
                case 4:
                    System.out.println("campana");
                    break;
                case 5:
                    System.out.println("limón");
                    break;
            }
        }

        if ((figura1 == figura2) && (figura2 == figura3)) {
            System.out.println("Enhorabuena");
        } else if ((figura1 == figura2) || (figura1 == figura3) || figura2 == figura3) {
            System.out.println("has recuperado");
        } else {
            System.out.println("has perdido");
        }
    }
}
