package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio8TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Tabla de multiplicar! Dame un número");
        int num = leer.nextInt();
        for (int i = 0; i <= 10; i++){
            int producto = num*i;
            System.out.println(num + " * " + i + " = " + producto);
        }
    }
}
