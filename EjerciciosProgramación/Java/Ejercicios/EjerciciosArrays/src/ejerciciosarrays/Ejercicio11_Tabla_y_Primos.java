package ejerciciosarrays;
import java.util.Scanner;
public class Ejercicio11_Tabla_y_Primos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] n = new int[10];
        int[] aux = new int[10];
        int primos = 0;
        int contador;
        System.out.println("Escribe 10 números");
        
        for (int i = 0; i < n.length; i++) {
            n[i] = leer.nextInt();
        }
        System.out.println("");
        
        for (int i = 0; i < n.length; i++) {
            contador = 2;
            while (n[i]%contador!=0 && contador<=n[i]/2){
            contador++;
            }
            if (contador > n[i]/2){
                aux[primos]=n[i];
                primos++;
            }
        }
        
        for (int i = 0; i < aux.length; i++) {
            contador = 2;
            while (n[i]%contador!=0 && contador <= n[i]/2){
            contador++;
            }
            if (contador <= n[i]/2){
                aux[primos]=n[i];
                primos++;
            }
        }
        
        for (int i = 0; i < aux.length; i++) {
            System.out.print(aux[i] + " ");
        }
        
        
        
        
        
    }
}
