package ejerciciosif.pkg11.pkg1;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ecuación: dame los valores de a y b");
        double a = leer.nextDouble();
        double b = leer.nextDouble();
        double x = -b/a;
        if (a != 0){
            System.out.println("ax + b = 0 ===> " + x);
        } else{
            System.out.println("Error");
        }
        
    }
}
