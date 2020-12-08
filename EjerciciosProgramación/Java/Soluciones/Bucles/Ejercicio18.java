/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author dam124
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x, y;
        System.out.println("Introduce un número entero");
        x = leer.nextInt();
        do {
            System.out.println("Introduce un segundo número distinto al anterior.");
            y = leer.nextInt();
        } while (x == y);
        if (x > y) {
            int aux = x;
            x = y;
            y = aux;
        }
        for (int i = x; i < y; i += 7) {
            System.out.print( i+" ");
        }
    }

}
