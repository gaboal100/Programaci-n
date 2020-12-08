package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio18ListaDeNúmeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame dos números");
        int a = leer.nextInt();
        int b = leer.nextInt();
        System.out.println("");
        int aux;
        if (b < a){
            aux = b;
            b = a;
            a = aux;
        }
        for (int i = a; i < b; i+=7) {
            System.out.print(i + ", ");
        }
    }
}
