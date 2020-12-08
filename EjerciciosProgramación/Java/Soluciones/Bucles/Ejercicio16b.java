
import java.util.Scanner;


public class Ejercicio16b {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int n;
        System.out.println("Dime un número");
        n= leer.nextInt();
        int i=2;
        while(n%i!=0 && i<=n/2){
           i++;
        }
        if (i>n/2){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }
}
