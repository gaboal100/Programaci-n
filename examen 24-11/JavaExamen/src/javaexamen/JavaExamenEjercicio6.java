package javaexamen;
import java.util.Scanner;
public class JavaExamenEjercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce una altura");
        int n = leer.nextInt();
        
        leer.nextLine();
        
        System.out.println("Dame un carácter");
        String car = leer.nextLine();
        
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j<3){
                    System.out.print(" ");
                } else{
                    System.out.print(car);
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i>=j){
                    System.out.print(" ");
                }else{
                    System.out.print(car);
                }
            }
            System.out.println("");
        }
        
            
        
        /*
        Scanner leer = new Scanner(System.in);
        int n = 0;
        while (n<3 || n>10){
            System.out.print("Dame un número entre el 3 y el 10: ");
            n = leer.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("A");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < n * 2 - 1; i++) {
            for (int z = i; z < n; z++) {
                System.out.print("A");
            }
            System.out.println("");
        }

        */
    }
}
