package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio17SumarCienNúmeros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        do{
            System.out.println("Dame un número");
            num = leer.nextInt();
            System.out.println("");
        } while(num < 0);
        int sum = num;
        for (int i = (num + 1); i < (num + 100); i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
