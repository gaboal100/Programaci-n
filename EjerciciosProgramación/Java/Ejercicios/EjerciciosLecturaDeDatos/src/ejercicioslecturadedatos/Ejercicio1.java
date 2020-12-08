package ejercicioslecturadedatos;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame dos números para multiplicar");
        int x,y;
        x = leer.nextInt();
        y = leer.nextInt();
        int producto = x * y;
        System.out.println(x + " * " + y + " = " + producto);
    }   
}
