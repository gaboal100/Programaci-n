package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio2MultiplosDe5While {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Múltiplos de 5");
        int c = 0;
        while (c < 100){
            c=c+5;
            System.out.println(c);
        }
    }
    
}
