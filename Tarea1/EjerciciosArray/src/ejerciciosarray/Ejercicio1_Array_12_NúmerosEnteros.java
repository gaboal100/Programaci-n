package ejerciciosarray;
import java.util.Scanner;
public class Ejercicio1_Array_12_NúmerosEnteros {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;
        for (int i = 0; i < num.length; i++) {
            System.out.print("/ " + num[i] + " / ");
        }
        System.out.println("");
        System.out.println("Los arrays sin datos valen 0 al igual que los arrays con ese número como dato");
    }
    
}
