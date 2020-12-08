package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio11AlCuadradoAlCubo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número");
        int num = leer.nextInt();
        int contador = 1;
        while(contador <= 5){
            int cuadrado = num*num;
            int cubo = (int) Math.pow(num, 3);
            System.out.println(num + "\t" + cuadrado + "\t" + cubo);
            contador++;
            num++;
        }
    }
}
