package ejerciciosarrays;
import java.util.Scanner;
public class Ejercicio8_Diagrama {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String rojo = "\033[31m";
        String azul = "\033[34m";
        String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int[] temp = new int[12];
        System.out.println("Introduce temperaturas medias:");
        for (int i = 0; i < temp.length; i++) {
            temp[i] = leer.nextInt();
        }
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i]; j++) {
                System.out.print("█");
            }
            System.out.print(" " + mes[i]);
            System.out.println("");
        }
    }
}
