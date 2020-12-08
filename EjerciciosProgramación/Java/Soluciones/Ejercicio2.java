package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int hora;

        System.out.println("¿Qué hora es? No es necesario ingresar los minutos");
        hora = leer.nextInt();
        if ((hora >= 6) && (hora <= 12)) {
            System.out.println("Buenos días");
        } else if ((hora >= 13) && (hora <= 20)) {
            System.out.println("Buenas tardes");
        } else if (((hora >= 21) && (hora < 24)) || (hora <= 5)) {
            System.out.println("Buenas noches");

        } else if (hora >= 24) {
            System.out.println("La hora ingresada no está en un formato válido");
        }
    }
}
