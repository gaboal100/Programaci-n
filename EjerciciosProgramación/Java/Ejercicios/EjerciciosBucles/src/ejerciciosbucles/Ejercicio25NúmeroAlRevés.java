package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio25NúmeroAlRevés {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número");
        int n = leer.nextInt();
        int inv = 0;
        while (n>0){
            inv = inv*10+n%10;
            n/=10;
        }
        System.out.println(inv);
    }
}
