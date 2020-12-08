package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio14Potencias {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame una base y un exponente");
        int base = leer.nextInt();
        int expo = leer.nextInt();
        System.out.println("");
        int solu = base;
        int result = (int) Math.pow(base, expo);
        for (int i = 1; i < expo; i++){
            solu = solu * base;
        }
        if (expo == 0){
            solu = 1;
        }
        System.out.println("Resultado => " + solu);
    }
}