package ejerciciosarrays;
import java.util.Scanner;
public class Ejercicio7_Cambiar_datos_en_array {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String rojo = "\033[31m";
        String azul = "\033[34m";
        int[] n = new int[100];
        int n1, n2;
        for (int i = 0; i < n.length; i++) {
            n[i] = (int) (Math.random() * 21);
            System.out.print(n[i] + " ");
        }
        System.out.println("");
        System.out.println("Introduce un número");
        n1=leer.nextInt();
        System.out.println("Introduce otro número");
        n2=leer.nextInt();
        for (int i = 0; i < n.length; i++) {
            if (n[i] == n1){
                n[i] = n2;
                System.out.print(rojo + "'" + n[i] + "' ");
            }else{
                System.out.print(azul + n[i] + " ");
            }
        }
        
    }
}
