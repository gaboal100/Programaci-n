package ejerciciosarray;
import java.util.Scanner;
public class Ejercicio6_15_Nums_Rotación {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num = new int[10];
        System.out.println("Dame los valores de los 15 puestos del array");
        for (int i = 0; i < num.length; i++) {
            num[i] = leer.nextInt();
        }
        
        for (int i = 1; i < num.length; i++) {
            for (int j = i-1; j < num.length -1; j++) {
                num[i] = num[j];
            }
            
            System.out.println("/ " + num[i] + " / ");
        }
        
        
    }
}
