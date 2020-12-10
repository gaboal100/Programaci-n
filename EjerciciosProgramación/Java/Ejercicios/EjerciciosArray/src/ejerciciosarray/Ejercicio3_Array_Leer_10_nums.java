package ejerciciosarray;
import java.util.Scanner;
public class Ejercicio3_Array_Leer_10_nums {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Dame los valores de los 10 puestos del array");
        for (int i = 0; i < num.length; i++) {
            
            num[i] = leer.nextInt();
        }
        System.out.println("");
        System.out.println("Array en orden inversa");
        for (int i = num.length-1; i >= 0; i--) {
            System.out.print("/ " + num[i] + " / ");
        }
    }
}
