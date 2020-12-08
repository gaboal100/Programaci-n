package ejerciciosarray;
import java.util.Scanner;
public class Ejercicio5_Max_Min {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] num = new int[10];
        int max = 0;
        int min = Integer.MAX_VALUE;
        System.out.println("Dame los valores de los 10 puestos del array");
        for (int i = 0; i < num.length; i++) {
            num[i] = leer.nextInt();
            if (num[i] > max){
                max = num[i];
            } else if (num[i] < min){
                min = num[i];
            }
        }
        
        System.out.println("");
        System.out.println("");
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] == min && min != max){
                System.out.println("Mínimo = " + num[i]);
            } else if (num[i] == max && max != min){
                System.out.println("Máximo = " + num[i]);
            } else{
                System.out.println(num[i]);
            }
        }
        System.out.println("");
        
    }
}
