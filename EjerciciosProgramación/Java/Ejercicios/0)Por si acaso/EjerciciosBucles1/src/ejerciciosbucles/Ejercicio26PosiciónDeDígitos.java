package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio26PosiciónDeDígitos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número y un dígito de ese número");
        int n = leer.nextInt();
        int d = leer.nextInt();
        int inv = 0;
        int posicion = 0;
        int x;
        while (n>0){
            inv = inv*10+n%10;
            n/=10;
        }
        while (inv > 0){
            posicion++;
            x = inv%10;
            if (x == d){
                System.out.println("Posición de " + d + " => " + posicion);
            }
            inv/=10;
        }
    }
}
