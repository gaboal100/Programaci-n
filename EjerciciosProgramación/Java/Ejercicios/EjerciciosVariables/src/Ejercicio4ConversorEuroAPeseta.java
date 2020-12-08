import java.util.Scanner;

public class Ejercicio4ConversorEuroAPeseta {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Dime cuánto dinero tienes y te lo doy en pesetas:");
        double euros = s.nextDouble();
        //1€ = 166,386psts
        double pesetas = 166.386;
        double conversion = euros*pesetas;
        System.out.println(euros + "€ en pesetas son " + conversion);
    }
}
