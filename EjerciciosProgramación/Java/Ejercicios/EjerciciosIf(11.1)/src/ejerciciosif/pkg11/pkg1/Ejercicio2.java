package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Qué hora es?");
        int hora = leer.nextInt();
        if (hora > 21 && hora <= 23 || hora >= 0 && hora <= 5){
            System.out.println("Buenas noches");
        } else if (hora >= 6 && hora <= 12){
            System.out.println("Buenos días");
        } else if (hora >= 13 && hora <= 20){
            System.out.println("Buenas tardes");
        } else{
            System.out.println("Hora no válida");
        }
    }
}
