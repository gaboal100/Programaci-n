package javaejerciciosrandom;
import java.util.Scanner;
public class Ejercicio6_Adivina_El_Número {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Adivina el número al azar");
        int azar = (int) (Math.random()*100)+1;
        int suerte;
        int oportunidades = 0;
        do {
            System.out.print("Introduce el número: ");
            suerte = leer.nextInt();
            oportunidades++;
            if (suerte > azar){
                System.out.println("El número que has dado es mayor");
            } else {
                System.out.println("El número que has dado es menor");
            }
            System.out.println("Quedan " + (5 - oportunidades) + " intentos");
            System.out.println("");
        } while (suerte != azar && oportunidades < 5);
        
        if(oportunidades == 5){
            System.out.println("Has agotado el número de intentos");
        }
        if(suerte == azar){
            System.out.println("Has acertado");
        }
    }
}
