package ejerciciosarrays;
import java.util.Scanner;
public class Ejercicio9_Par_Impar_Arrays {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] n = new int[8];
        System.out.println("Introduce 8 números");
        for (int i = 0; i < n.length; i++) {
            n[i] = leer.nextInt();
        }
        
        for (int i = 0; i < n.length; i++) {
            if (n[i]%2==0) {
                System.out.println(n[i] + " Par");
            }else{
                System.out.println(n[i] + " Impar");
            }
        }
    }
    
}
