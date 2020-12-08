package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio18PrimeraCifra {
    public static void main(String[] args) {
        int primera, num;
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número de cinco cifrase");
        num = leer.nextInt();
        if (num < 10){
            primera = num;
            System.out.println("Primera cifra => " + primera);
        } else if (num > 10 && num < 100){
            primera = num/10;
            System.out.println("Primera cifra => " + primera);
        } else if (num > 100 && num < 1000){
            primera = num/100;
            System.out.println("Primera cifra => " + primera);
        } else if (num > 1000 && num < 10000){
            primera = num/1000;
            System.out.println("Primera cifra => " + primera);
        } else if (num > 1000 && num < 100000){
            primera = num/10000;
            System.out.println("Primera cifra => " + primera);
        } else{
            System.out.println("Número no válido");
        }
        
    }
}
