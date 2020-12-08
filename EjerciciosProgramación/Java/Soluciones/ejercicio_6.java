package ejercicios_4.pkg5;

import java.util.Scanner;

public class ejercicio_6 {

    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        System.out.println("dame la altura?");
        double h = esc.nextDouble();
        double g = 9.81;
        double t = 0;
        if (h >= 0) {
            t = Math.sqrt(2 * h / g);
            System.out.println("el resultado es " + t);
        } else {
            System.out.println("la altura no puede ser negativa");
        }
    }

}
