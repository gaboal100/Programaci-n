
import java.util.Scanner;

public class Ejercicio5_30 {

    public static void main(String args[]) {
        Scanner leer = new Scanner(System.in);
        int dia=leer.nextInt();
        int hora=leer.nextInt();
        int dia2;
        System.out.println("Introducela segunda hora");
        
        
        do{
        dia2=leer.nextInt();
        
        }while(dia2<dia);
        int hora2=leer.nextInt();
        System.out.println(((dia2*24)+hora2)-((dia*24)+hora));
        }
    }

