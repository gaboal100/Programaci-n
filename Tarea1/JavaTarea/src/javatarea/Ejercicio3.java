package javatarea;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Vamos a obtener los dígitos de control");
        long n;
        do{
           System.out.println("Dame un número de 10 dígitos (si son menos, las cifras no dadas serán consideradas como ceros): ");
           n = leer.nextLong(); 
        }while(n > 9999999999L);
        
        int resto = (int) (n%97);
        String restom = "" + resto;
        if (resto < 10){
            restom = 0 + restom;
        }
        
        System.out.println("Número de la seguridad social: " + n + "  " + restom);
    }
}
