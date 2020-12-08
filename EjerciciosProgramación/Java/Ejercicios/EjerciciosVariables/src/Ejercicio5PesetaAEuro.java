import java.util.Scanner;

public class Ejercicio5PesetaAEuro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Dime cuánto dinero tienes y te lo doy en pesetas:");
        double pesetas = s.nextDouble();
        //1€ = 166,386psts
        double euros = 166.386;
        double conversion = pesetas/euros;
        System.out.println(euros + "pesetas en euros son " + conversion);
    }
}
