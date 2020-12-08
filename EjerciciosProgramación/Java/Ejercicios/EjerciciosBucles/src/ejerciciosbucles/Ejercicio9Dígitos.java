package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio9Dígitos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número");
        int num = leer.nextInt();
        int numtemp = num;
        int cantidad = 0;
        while (numtemp > 0){
            numtemp = numtemp/10;
            cantidad++;
        }
        System.out.println(num + " tiene " + cantidad + " dígitos.");        
    }
}
