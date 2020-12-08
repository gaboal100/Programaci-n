package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio12SerieDeFibonacci {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Serie de Fibonacci. Cuántos números quieres ver?");
        int n = leer.nextInt();
        int x = 0;
        int y = 1;
        int aux = 0;
        for (int i = 0; i < n; i++){
            System.out.print(x + ", ");
            aux = x + y;
            x = y;
            y = aux;
        }
        
    }
}
