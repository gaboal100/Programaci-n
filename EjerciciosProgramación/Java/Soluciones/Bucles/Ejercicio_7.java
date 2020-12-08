package ejerciciosbucles;

import java.util.Scanner;

public class bucles7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a;
        int b = 1;
        do {
            System.out.println("Introduce un código");
            a = leer.nextInt();
            b++;//b=b+1
        } while (a != 1234 && b <= 4);
        if (b <= 4) {
            System.out.println("Código correcto");
        } else {
            System.out.println("Codigo incorrecto");
        }
    }
}
