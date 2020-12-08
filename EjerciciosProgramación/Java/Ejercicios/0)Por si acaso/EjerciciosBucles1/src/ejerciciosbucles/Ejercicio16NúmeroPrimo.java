package ejerciciosbucles;
import java.util.Scanner;
public class Ejercicio16NúmeroPrimo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dame un número.");
        int num = leer.nextInt();
        int contador = 2;
        while (num % contador != 0 && contador <= num/2){
            contador++;
        }
        if (contador > num/2){
            System.out.println("Es primo.");
        }else{
            System.out.println("No es primo");
        }
        
        /*int i;
        for (i = 2; i < num/2; i++) {
            if (num%i==0){
                System.out.println("No es primo");
                break;
            } 
            if (i == num-1){
            System.out.println("Es primo");
            }
        }*/
        
        
        /*
        boolean primo = true;
        int contador = 2;
        while (contador != num){
            if ((num % contador) == 0){
                primo = false;
            }
            contador++;
        }
        if (primo == false){
            System.out.println("No es primo");
        } else{
            System.out.println("Es primo");
        }*/
    }
}
