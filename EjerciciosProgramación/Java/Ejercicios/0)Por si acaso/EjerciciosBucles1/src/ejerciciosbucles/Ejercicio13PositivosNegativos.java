package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio13PositivosNegativos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame diez números");
        int contamas = 0;
        int contamenos = 0;
        for (int i = 0; i < 10; i++){
            int num = leer.nextInt();
            if (num > 0){
                contamas++;
            }
            if (num < 0){
                contamenos++;
            }
        }
        System.out.println("Números positivos => " + contamas + "\t Numeros negativos => " + contamenos);
    }
}
