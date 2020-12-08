package javatarea;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame tu número de tarjeta");
        long n = leer.nextLong();
        int cont = 0;
        Long resto = 0L;
        int mult = 0;
        Long sum = 0L;
        int total = 0;
        while (n > 0){
            resto = n%10;
            cont++;
            if (cont%2==0){
                mult = (int) (resto * 2);
                int aux = mult;
                if(mult >= 10){
                    mult = 0;
                    while (aux>0){
                        int multresto = aux%10;
                        mult += multresto;
                        aux/=10;
                    }
                    
                }
            } else{
                sum = resto;
            }
            total = (int) (total + (mult + sum));
            mult = 0;
            sum = 0L;
            n/=10;
        }
        System.out.println("Total: " + total);
        if(total%10==0){
            System.out.println("Número correcto");
        } else{
            System.out.println("Número incorrecto");
        }
    }
}
