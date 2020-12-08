package Bucles;

import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Dime un numero");
        n = leer.nextInt();
        int i;
        for (i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                System.out.println("No es primo");
            }
            break;

        }
    
        if (i >= n - 1) {
            System.out.println("Es primo");

        }

    }

        
        
    }

